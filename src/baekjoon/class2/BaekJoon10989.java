package baekjoon.class2;

import java.io.IOException;
import java.util.Arrays;

/**
 * https://www.acmicpc.net/problem/10989
 */
public class BaekJoon10989 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int[] numbers = new int[readInt()];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = readInt();
        }

        Arrays.sort(numbers);
        StringBuilder sb = new StringBuilder();
        for (int number : numbers)
        {
            sb.append(number).append('\n');
        }

        System.out.println(sb);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try
        {
            while ((asciiCode = System.in.read()) != ASCII_ENTER)
            {
                // sum = sum * 10 + asciiCode - 48;
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);
            }
        } catch (IOException ignored) {}
        return sum;
    }
}
