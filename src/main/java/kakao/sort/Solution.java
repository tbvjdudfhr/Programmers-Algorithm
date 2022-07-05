package kakao.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public String[] solution(String[] files) {
        Pattern pattern = Pattern.compile("(?<head>\\D+)(?<num>\\d+)(.*)");
        ArrayList<File> fileArrayList = new ArrayList<>();
        for (String file : files) {
            Matcher m = pattern.matcher(file);
            if (m.find()) {
                fileArrayList.add(new File(file, m.group(1), m.group(2)));
            }
        }
        Collections.sort(fileArrayList);

        return fileArrayList.stream()
                .map(file -> file.name)
                .toArray(String[]::new);
    }

    private class File implements Comparable<File> {
        String name;
        String head;
        int number;

        public File(String name, String head, String number) {
            this.name = name;
            this.head = head.toLowerCase();
            this.number = Integer.parseInt(number);
        }

        @Override
        public int compareTo(File file) {
            if (head.equals(file.head)) {
                return number - file.number;
            }

            return head.compareTo(file.head);
        }
    }
}
