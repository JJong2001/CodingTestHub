package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/2292
 */
public class BaekJoon2292 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int number = readInt();
        int move = 1;
        while (number > 1)
        {
            number -= 6 * move++;
        }

        System.out.println(move);
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
