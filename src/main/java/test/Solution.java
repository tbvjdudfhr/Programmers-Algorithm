package test;

import java.util.HashSet;

class Solution {
    public static final int S_MIN_LENGTH = 3;
    public static final int BEGIN_INDEX = 0;
    private static boolean flag = false;

    public String solution(String[] registered_list, String new_id) {
        String sNewId = separateS(new_id);
        int nNewId = separateN(new_id);
        HashSet<Integer> integers = new HashSet<>();
        for (String id : registered_list) {
            String sId = separateS(id);
            int vId = separateN(id);
            if (sId.equals(sNewId)) {
                if(vId == nNewId) flag = true;
                integers.add(vId);
            }
        }
        if (flag) return sNewId + recommendId(nNewId, integers);
        return new_id;
    }

    private int recommendId(int nNewId, HashSet<Integer> integers) {
        Integer n = nNewId;
        while (integers.contains(n)) {
            n++;
        }
        return n;
    }


    private String separateS(String id) {
        int idx = getIdx(id);
        return id.substring(BEGIN_INDEX, idx);
    }

    private int separateN(String id) {
        int idx = getIdx(id);
        String substringId = id.substring(idx);
        return substringId.equals("") ? 0 : Integer.parseInt(substringId);
    }

    private int getIdx(String id) {
        int idx = id.length();
        for (int i = S_MIN_LENGTH; i < id.length(); i++) {
            if (Character.isDigit(id.charAt(i))) {
                idx = i;
                break;
            }
        }
        return idx;
    }
}
