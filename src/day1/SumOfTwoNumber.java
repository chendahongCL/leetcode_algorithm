package day1;

import java.util.Hashtable;

/**
 * 求解两数之和  分别使用枚举和hash表
 */

public class SumOfTwoNumber {
    public static int[] forloopSolution(int[] sourceArr, int target) {
        for (int i = 0; i < sourceArr.length; i++) {
            for (int j = i + 1; j < sourceArr.length; j++) {
                if (sourceArr[i] + sourceArr[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{0};
    }

    public static int[] hashTableSolution(int[] sourceArr, int target) {
        Hashtable<Integer, Integer> hashtable = new Hashtable();
        for (int i = 0; i < sourceArr.length; i++) {
            if (hashtable.containsKey(target - sourceArr[i])) {
                return new int[]{hashtable.get(target - sourceArr[i]), i};
            }
            hashtable.put(sourceArr[i], i);
        }
        return new int[]{0};
    }

    public static void main(String[] args) {
        // System.out.println(forloopSolution(new int[]{1, 2, 3, 4, 9}, 10)[0]);
        // System.out.println(forloopSolution(new int[]{1, 2, 3, 4, 5}, 9)[1]);
        System.out.println(hashTableSolution(new int[]{1, 2, 3, 4, 5}, 7)[0]);
        System.out.println(hashTableSolution(new int[]{1, 2, 3, 4, 5}, 7)[1]);
    }
}
