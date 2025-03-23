package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *
 * 입력
 * 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 */
public class BaekJoon2438 {
    public static void main(String[] args) {
        int length = readInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
                sb.append('*');
            }
            sb.append('\n');
        }

        System.out.println(sb);
    }

    public static int readInt() {
        int c, n = 0;
        try {
            while ((c = System.in.read()) > 32) {
                n = (n << 3) + (n << 1) + (c & 15);
            }
        } catch (IOException ignored) {}

        return n;
    }
}
