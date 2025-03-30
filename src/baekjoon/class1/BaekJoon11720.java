package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 *
 * 입력
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 */
public class BaekJoon11720 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        int sum = 0;
        int count = readInt();
        for (int i = 0; i < count; i++)
        {
            sum += (System.in.read() & 15);
        }

        System.out.println(sum);
    }

    private static int readInt() throws IOException {
        int asciiCode, sum = 0;
        while ((asciiCode = System.in.read()) != ASCII_ENTER)
        {
            sum = (sum << 3) + (sum << 1) + (asciiCode & 15);   // sum = sum * 10 + (asciiCode - 48);
        }
        return sum;
    }
}
