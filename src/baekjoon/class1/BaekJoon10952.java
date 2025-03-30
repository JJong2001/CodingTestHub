package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 입력은 여러 개의 테스트 케이스로 이루어져 있다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 * 입력의 마지막에는 0 두 개가 들어온다.
 */
public class BaekJoon10952 {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();
        int num1, num2;
        do {
            num1 = System.in.read() & 15;
            int space = System.in.read();
            num2 = System.in.read() & 15;
            int enter = System.in.read();

            sb.append(num1 + num2).append('\n');
        } while (num1 != 0 && num2 != 0);

        System.out.println(sb.substring(0, sb.length() - 3));
    }
}
