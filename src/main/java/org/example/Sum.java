package org.example;

public class Sum {
    public int sumOdd() {
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        return sum;
    }
}
