package com.example;

public class App {
    public int findArraySum(int[] numbers) {
        if (numbers == null) {
            return 0;
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}
