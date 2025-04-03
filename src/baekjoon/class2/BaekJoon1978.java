package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/1978
 */
public class BaekJoon1978 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int loop = readInt();
        int primeCount = loop;
        while (loop-- > 0)
        {
            int number = readInt();
            if (number == 1)
            {
                primeCount--;
                continue;
            }

            for (int i = 2; i < number; i++)
            {
                if (number % i == 0) {
                    primeCount--;
                    break;
                }
            }
        }

        System.out.println(primeCount);
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
