package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * N을 입력받은 뒤, 구구단 N단을 출력하는 프로그램을 작성하시오. 출력 형식에 맞춰서 출력하면 된다.
 *
 * 입력
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
 */
public class BaekJoon2739 {
    public static void main(String[] args) throws IOException {
        int n = System.in.read() & 15;
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= 9; i++) sb.append(n).append(" * ").append(i).append(" = ").append(n * i).append('\n');
        System.out.println(sb);
    }
}
