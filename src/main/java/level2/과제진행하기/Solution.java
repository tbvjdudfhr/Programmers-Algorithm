package level2.과제진행하기;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Stack;

public class Solution {
    public String[] solution(String[][] plans) {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<HomeWork> homeWorks = new ArrayList<>();
        for (String[] plan : plans) {
            homeWorks.add(new HomeWork(plan));
        }
        Collections.sort(homeWorks, Comparator.comparing(a -> a.startTime));
        Stack<HomeWork> stack = new Stack<>() {
        };
        for (HomeWork homeWork : homeWorks) {
            if (stack.isEmpty()) {
                stack.add(homeWork);
                continue;
            }
            HomeWork peek = stack.peek();

            if (peek.getEndTime().compareTo(homeWork.startTime) <= 0) {
                stack.pop();
                strings.add(peek.name);
                stack.add(homeWork);
            } else {
                peek.updatePlayTime(homeWork);
                stack.add(homeWork);
            }
        }

        while (!stack.isEmpty()) {
            strings.add(stack.pop().name);
        }

        return strings.toArray(new String[0]);
    }

    private class HomeWork {
        String name;
        LocalTime startTime;
        int playTime;

        public HomeWork(String[] plan) {
            name = plan[0];
            startTime = LocalTime.parse(plan[1]);
            playTime = Integer.parseInt(plan[2]);
        }

        public LocalTime getEndTime() {
            return startTime.plusMinutes(playTime);
        }

        public void updatePlayTime(HomeWork homeWork) {
            long between = ChronoUnit.MINUTES.between(startTime, homeWork.startTime);
            playTime -= between;
        }
    }
}
