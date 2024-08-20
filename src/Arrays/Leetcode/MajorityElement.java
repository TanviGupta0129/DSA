package Arrays.Leetcode;

import java.util.Scanner;

public class MajorityElement {

    // Function to find the majority element
    static int findMajorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;

        // 1: Finding a candidate for the majority element
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // 2: Verify that the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            return -1; // This indicates no majority element found, assuming one exists per the problem statement
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int majorityElement = findMajorityElement(nums);

        if (majorityElement != -1) {
            System.out.println("Majority Element: " + majorityElement);
        } else {
            System.out.println("No Majority Element found");
        }
    }
}


//Input: nums = [3,2,3]
//Output: 3
