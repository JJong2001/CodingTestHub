package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어, 서로 다른 9개의 자연수
 *
 * 3, 29, 38, 12, 57, 74, 40, 85, 61
 *
 * 이 주어지면, 이들 중 최댓값은 85이고, 이 값은 8번째 수이다.
 *
 * 입력
 * 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
 */
public class BaekJoon2562 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        int maxNum = 0;
        int sequence = 1;
        for (int i = 0; i < 9; i++)
        {
            int num = readInt();
            if (num > maxNum)
            {
                maxNum = num;
                sequence = i + 1;
            }
        }

        System.out.println(maxNum + "\n" + sequence);
    }

    public static int readInt() {
        int c, n = 0;
        try {
            while ((c = System.in.read()) > ASCII_INPUT) {
                n = (n << 3) + (n << 1) + (c & 15); // n = n * 10 + (c - 48)
            }
        } catch (IOException ignored) {}

        return n;
    }
}
