package baekjoon.class1;

import java.io.IOException;

/**
 * 문제:
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력:
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class BaekJoon1000 {
    public static void main(String[] args) {
        System.out.println(readInt() + readInt());
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
