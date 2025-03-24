package baekjoon.class1;

import java.io.IOException;

/**
 * 문제
 * 컴퓨터를 제조하는 회사인 KOI 전자에서는 제조하는 컴퓨터마다 6자리의 고유번호를 매긴다.
 * 고유번호의 처음 5자리에는 00000부터 99999까지의 수 중 하나가 주어지며 6번째 자리에는 검증수가 들어간다.
 * 검증수는 고유번호의 처음 5자리에 들어가는 5개의 숫자를 각각 제곱한 수의 합을 10으로 나눈 나머지이다.
 *
 * 예를 들어 고유번호의 처음 5자리의 숫자들이 04256이면, 각 숫자를 제곱한 수들의 합 0+16+4+25+36 = 81 을 10으로 나눈 나머지인 1이 검증수이다.
 *
 * 입력
 * 첫째 줄에 고유번호의 처음 5자리의 숫자들이 빈칸을 사이에 두고 하나씩 주어진다.
 */
public class BaekJoon2475 {
    private static final int ASCII_ENTER = 10;
    private static final int ASCII_SPACE = 32;
    
    public static void main(String[] args) {
        int c;
        int sum = 0;
        try
        {
            while ((c = System.in.read()) != ASCII_ENTER)
            {
                if (c == ASCII_SPACE) continue;

                int readNumber = c & 15; // c - 48
                sum += readNumber * readNumber;
            }
        } catch (IOException ignored) {}

        System.out.println(sum % 10);
    }
}
