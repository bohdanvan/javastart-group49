package com.bvan.javastart.lesson3.type.double_type;

/**
 * @author bvanchuhov
 */
public class MoneySample {

    public static void main(String[] args) {
        long money = 268752184;
        double moneyForOutput = (double) money / 10_000_000;
        System.out.println(moneyForOutput); // 26.8752184
    }
}
