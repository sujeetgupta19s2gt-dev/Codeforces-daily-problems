/**
 * Problem: Codeforces 116A - Tram
 * Link: https://codeforces.com/problemset/problem/116/A
 * Language: Java 21
 * Verdict: Accepted
 */

import java.util.*;

public class tram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] nums = new int[n][2];

        for (int i = 0; i < n; i++) {
            nums[i][0] = sc.nextInt();
            nums[i][1] = sc.nextInt();
        }

        int currentCapacity = 0;
        int maxCapacity = 0;

        for (int i = 0; i < n; i++) {
            currentCapacity -= nums[i][0];
            currentCapacity += nums[i][1];

            if (currentCapacity > maxCapacity) {
                maxCapacity = currentCapacity;
            }
        }

        System.out.println(maxCapacity);
    }
}
