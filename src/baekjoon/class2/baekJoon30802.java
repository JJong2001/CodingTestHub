package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/30802
 */
public class baekJoon30802 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int people = readInt();
        int[] shirtSizeCounts = readIntArray(6);
        int shirtBundle = readInt(),
            penBundle = readInt();

        int orderShirtBundle = 0;
        for (int shirtSize : shirtSizeCounts)
        {
            orderShirtBundle += ((shirtSize + shirtBundle - 1) / shirtBundle);
        }

        int orderPenBundle = people / penBundle;
        int orderPen = people % penBundle;
        System.out.println(orderShirtBundle + "\n" +
                           orderPenBundle + " " + orderPen);
    }

    private static int[] readIntArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = readInt();
        }
        return arr;
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
