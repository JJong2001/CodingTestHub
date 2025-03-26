package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 프로그램을 작성하시오.
 *
 * 예를 들어 A = 150, B = 266, C = 427 이라면 A × B × C = 150 × 266 × 427 = 17037300 이 되고, 계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.
 *
 * 입력
 * 첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
 */
public class BaekJoon2577 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) {
        int multiplication = 1;
        for (int i = 0; i < 3; i++) {
            int num = readInt();
            if (num < 100 || num > 1000) return;

            multiplication *= num;
        }

        int[] numbers = new int[10];
        while (multiplication != 0) {
            numbers[multiplication % 10]++;
            multiplication /= 10;
        }

        StringBuilder sb = new StringBuilder();
        for (int number : numbers) {
            sb.append(number).append('\n');
        }

        System.out.println(sb);
    }

    private static int readInt() {
        int asciiCode, sum = 0;
        try {
            while ((asciiCode = System.in.read()) != ASCII_ENTER) {
                sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48)
            }
        } catch (IOException ignored) {}

        return sum;
    }
}
