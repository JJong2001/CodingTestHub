package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/11050
 */
public class BaekJoon11050 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int N = readInt(), K = readInt();
        System.out.println(factorial(N) / (factorial(N - K) * factorial(K)));
    }

    private static int factorial(int number) {
        if (number == 0) return 1;
        return number * factorial(number - 1);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                // sum = sum * 10 + asciiCode - 48;
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
