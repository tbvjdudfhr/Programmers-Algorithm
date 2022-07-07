package kakao.song;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;

public class Solution {
    public String solution(String m, String[] musicinfos) {
        ArrayList<Song> list = new ArrayList<>();

        for (int i = 0; i < musicinfos.length; i++) {
            String[] song = musicinfos[i].split(",");
            int playTime = getPlaytime(song[0], song[1]);
            if (isSameSong(playTime, replaceString(m), replaceString(song[3]))) {
                list.add(new Song(song[2], playTime, i));
            }
        }
        Collections.sort(list);

        if (list.isEmpty()) {
            return "(None)";
        }
        return list.get(0).name;
    }

    class Song implements Comparable<Song> {
        String name;
        int time;
        int index;

        public Song(String name, int time, int index) {
            this.name = name;
            this.time = time;
            this.index = index;
        }

        @Override
        public int compareTo(Song s) {
            if (this.time < s.time) {
                return 1;
            } else if (this.time == s.time) {
                return this.index > s.index ? 1 : -1;
            }

            return -1;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Song song = (Song) o;
            return time == song.time && index == song.index && Objects.equals(name, song.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, time, index);
        }
    }

    public int getPlaytime(String startTime, String endTime) {
        String[] st = startTime.split(":");
        String[] et = endTime.split(":");

        int startMinutes = Integer.parseInt(st[0]) * 60 + Integer.parseInt(st[1]);
        int endMinutes = Integer.parseInt(et[0]) * 60 + Integer.parseInt(et[1]);
        return endMinutes - startMinutes;
    }

    public boolean isSameSong(int time, String m, String song) {
        int index = 0;
        int t = 1;
        StringBuilder builder = new StringBuilder();

        while (t <= time) {
            if (index == song.length()) {
                index = 0;
            }

            builder.append(song.charAt(index));
            index++;
            t++;
        }

        return builder.toString()
                .contains(m);
    }

    public String replaceString(String str) {
        str = str.replaceAll("C#", "c")
                .replaceAll("F#", "f")
                .replaceAll("D#", "d")
                .replaceAll("G#", "g")
                .replaceAll("A#", "a");

        return str;
    }
}
