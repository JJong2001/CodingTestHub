package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/2609
 */
public class BaekJoon2609 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int numberA = readInt();
        int numberB = readInt();
        int gcd = gcd(numberA, numberB);

        System.out.println(gcd + "\n" + numberA * numberB / gcd);
    }

    private static int gcd(int numberA, int numberB) {
        if (numberB == 0) return numberA;
        return gcd(numberB, numberA % numberB);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
