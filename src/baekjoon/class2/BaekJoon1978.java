package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/1978
 */
public class BaekJoon1978 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int numberCount = readInt();
        int primeCount = 0;
        for (int i = 0; i < numberCount; i++)
        {
            int number = readInt();
            if (isPrime(number)) primeCount++;
        }

        System.out.println(primeCount);
    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
