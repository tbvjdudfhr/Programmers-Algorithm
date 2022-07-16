package leetcode.binarysearch;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }

        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        if (!set.contains(target)) {
            return new int[]{-1, -1};
        }

        int position = binarySearch(0, nums.length, target, nums);
        int first = findFirst(position, nums, target);
        int last = findLast(position, nums, target);

        return new int[]{first, last};
    }

    private int findLast(int position, int[] nums, int target) {
        int value = position;
        for (int i = position + 1; i < nums.length; i++) {
            if (nums[i] == target) {
                value = i;
                continue;
            }

            break;
        }

        return value;
    }

    private int findFirst(int position, int[] nums, int target) {
        int value = position;
        for (int i = position - 1; i >= 0; i--) {
            if (nums[i] == target) {
                value = i;
                continue;
            }

            break;
        }

        return value;
    }

    private int binarySearch(int low, int high, int target, int[] nums) {
        int mid;

        while (low <= high) {
            mid = (low + high) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1;
    }
}
