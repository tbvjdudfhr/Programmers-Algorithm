package level2.호텔대실;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String[][] book_time) {
        List<BookTime> bookTimes = new ArrayList<>();
        for (String[] time : book_time) {
            bookTimes.add(BookTime.from(time));
        }
        int answer = 0;

        for (BookTime bookTime: bookTimes) {
            answer = Math.max(answer, getMax(bookTimes, bookTime));
        }
        return answer;
    }

    private static int getMax(List<BookTime> bookTimes, BookTime bookTime) {
        long startTimeCount = bookTimes.stream().filter(a -> bookTime.startTime.compareTo(a.startTime) >= 0 &&  bookTime.startTime.compareTo(a.endTime) <= 0).count();
        long endTimeCount = bookTimes.stream().filter(a -> bookTime.endTime.compareTo(a.startTime) >= 0 && bookTime.endTime.compareTo(a.endTime) <= 0).count();
        return (int) Math.max(startTimeCount, endTimeCount);
    }

    private static class BookTime {
        LocalTime startTime;
        LocalTime endTime;

        public BookTime(LocalTime startTime, LocalTime endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public static BookTime from(String[] time) {
            return new BookTime(LocalTime.parse(time[0]), LocalTime.parse(time[1]));
        }
    }
}
