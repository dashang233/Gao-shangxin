package bignum;

import java.math.BigDecimal;

public class BigDecimal01 {
    public static void main(String[] args) {
        BigDecimal bigDecimal1 = new BigDecimal("1.23456");
        BigDecimal bigDecimal2 = new BigDecimal("1.2345");
        System.out.println(bigDecimal1.multiply(bigDecimal2));
        System.out.println(bigDecimal1.divide(bigDecimal2,BigDecimal.ROUND_CEILING));
    }
}
