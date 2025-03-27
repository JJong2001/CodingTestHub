package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다.
 * 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
 */
public class BaekJoon10818 {
    private static final int ASCII_INPUT = 32;
    private static final int ASCII_MINUS = 45;

    public static void main(String[] args) {
        int numbers = readInt();
        int max = -1000000, min = 1000000;
        for (int i = 0; i < numbers; i++) {
            int number = readInt();
            if (number > max) max = number;
            if (number < min) min = number;
        }

        System.out.println(min + " " + max);
    }

    private static int readInt() {
        boolean isMinus = false;
        int asciiCode, sum = 0;
        try
        {
            if ((asciiCode = System.in.read()) == ASCII_MINUS) isMinus = true;
            else sum = asciiCode & 15;  // asciiCode - 48

            while ((asciiCode = System.in.read()) > ASCII_INPUT)
            {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48)
            }
        } catch (IOException ignored) {}

        return isMinus ? -sum : sum;
    }
}
