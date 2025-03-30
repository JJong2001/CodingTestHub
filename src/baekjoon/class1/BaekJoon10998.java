package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A×B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
 */
public class BaekJoon10998 {
    public static void main(String[] args) throws IOException {
        int a = System.in.read() & 15;
        System.in.read();   // space 입력
        int b = System.in.read() & 15;

        System.out.println(a * b);
    }
}
