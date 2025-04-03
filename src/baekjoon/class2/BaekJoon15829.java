package baekjoon.class2;

import java.io.IOException;
import java.math.BigInteger;

public class BaekJoon15829 {
    private static final int ASCII_ENTER = 10;

    public static void main(String[] args) throws IOException {
        int asciiCode, length = 0;
        while ((asciiCode = System.in.read()) != ASCII_ENTER)
        {
            // sum = sum * 10 + (asciiCode - 48);
            length = (length << 3) + (length << 1) + (asciiCode & 15);
        }

        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < length; i++)
        {
            // asciiCode = System.in.read() - 96;
            asciiCode = System.in.read() & 31;
            sum = new BigInteger("31").pow(i).multiply(new BigInteger(String.valueOf(asciiCode))).add(sum);
        }

        System.out.println(sum.mod(new BigInteger("1234567891")));
    }
}
