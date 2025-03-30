package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 정수 N개로 이루어진 수열 A와 정수 X가 주어진다.
 * 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
 * 둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
 */
public class BaekJoon10871 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int count = readInt();
        int num = readInt();
        for (int i = 0; i < count; i++) {
            int temp = readInt();
            if (num > temp) sb.append(temp).append(' ');
        }

        System.out.println(sb);
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
