package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/2798
 */
public class BaekJoon2798 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int[] cards = new int[readInt()];
        int number = readInt();
        int max = 0;

        for (int i = 0; i < cards.length; i++)
        {
            cards[i] = readInt();
        }

        for (int i = 0; i < cards.length; i++)
        {
            for (int j = i + 1; j < cards.length; j++)
            {
                for (int k = j + 1; k < cards.length; k++)
                {
                    int sum = cards[i] + cards[j] + cards[k];
                    if (sum <= number && sum > max) max = sum;
                }
            }
        }

        System.out.println(max);
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
