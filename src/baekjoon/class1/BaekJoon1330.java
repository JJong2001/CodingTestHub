package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 *
 * 제한
 * -10,000 ≤ A, B ≤ 10,000
 */
public class BaekJoon1330 {
    private static final int ASCII_INPUT = 32;

    public static void main(String[] args) {
        System.out.println(getResult(readInt(), readInt()));
    }

    public static String getResult(int value1, int value2) {
        if (value1 > value2) return ">";
        else if (value1 < value2) return "<";
        else return "==";
    }

    public static int readInt() {
        boolean isMinus = false;
        int c, n = 0;
        try {
            c = System.in.read() & 15;
            if (c == 13) isMinus = true;
            else n = c;

            while ((c = System.in.read()) > ASCII_INPUT) {
                n = (n << 3) + (n << 1) + (c & 15);
            }
        } catch (IOException ignored) {}

        return isMinus ? -n : n;
    }
}
