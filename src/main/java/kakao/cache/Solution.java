package kakao.cache;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution {
    private static final int HIT = 1;
    private static final int MISS = 5;

    private int cacheSize;
    private Set<City> cache = new HashSet<>();
    private int currentTime;

    public int solution(int size, String[] cities) {
        cacheSize = size;
        processCities(cities);

        return currentTime;
    }

    private void processCities(String[] cities) {
        for (String city : cities) {
            currentTime += processCity(city.toUpperCase());
        }
    }

    private int processCity(String cityName) {
        City city = City.of(cityName, currentTime);

        if (cache.contains(city)) {
            return processHit(city);
        }

        return processMiss(city);
    }

    private int processHit(City city) {
        city.updateTime(currentTime);
        return HIT;
    }

    private int processMiss(City city) {
        if (cacheSize == 0) {
            return MISS;
        }

        if (cache.size() >= cacheSize) {
            removeCache();
        }

        cache.add(city);

        return MISS;
    }

    private void removeCache() {
        City leastRecentlyVisitedCity = cache.stream().min(Comparator.comparingInt(o -> o.lastVisitedTime)).orElse(null);
        cache.remove(leastRecentlyVisitedCity);
    }
}

class City {
    String cityName;
    int lastVisitedTime;

    private City(String cityName, int lastVisitedTime) {
        this.cityName = cityName;
        this.lastVisitedTime = lastVisitedTime;
    }

    public static City of(String cityName, int lastVisitedTime) {
        return new City(cityName, lastVisitedTime);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city = (City) o;
        return cityName.equals(city.cityName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cityName);
    }

    public void updateTime(int currentTime) {
        lastVisitedTime = currentTime;
    }
}
