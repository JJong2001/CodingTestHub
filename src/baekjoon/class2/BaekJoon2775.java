package baekjoon.class2;

import java.io.IOException;

/**
 * https://www.acmicpc.net/problem/2775
 */
public class BaekJoon2775 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        int testCase = readInt();
        while (testCase-- > 0)
        {
            int floor = readInt();
            int[] rooms = new int[readInt()];
            for (int i = 0; i < rooms.length; i++)
            {
                rooms[i] = i + 1;
            }

            for (int i = 0; i < floor; i++)
            {
                int sum = 0;
                for (int j = 0; j < rooms.length; j++)
                {
                    sum += rooms[j];
                    rooms[j] = sum;
                }
            }

            sb.append(rooms[rooms.length - 1]).append('\n');
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
