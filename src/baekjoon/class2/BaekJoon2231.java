package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/2231
 */
public class BaekJoon2231 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int inputNumber = readInt();
        int constructor = 0;

        for (int i = 1; i < inputNumber; i++) {
            int number = i;
            int sum = number;

            do {
                sum += (number % 10);
            } while ((number /= 10) > 0);

            if (sum == inputNumber) {
                constructor = i;
                break;
            }
        }

        System.out.println(constructor);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
