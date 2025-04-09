package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/1436
 */
public class BaekJoon1436 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int series = readInt();
        int number = 666, count = 1;
        while (series != count)
        {
            if (String.valueOf(++number).contains("666")) count++;
        }

        System.out.println(number);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                // sum = sum * 10 + (asciiCode - 48);
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
