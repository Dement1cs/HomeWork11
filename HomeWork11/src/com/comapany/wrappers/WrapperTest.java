package com.comapany.wrappers;

public class WrapperTest {

    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = Integer.valueOf(10);
        Integer i3 = new Integer(10);
        Integer i4 = Integer.parseInt("10");

        Double d = 40.50;
        byte b = 30;
        short sh = 25;
        int i = 150;
        float f = 20.10F;
        long l = 500L;

        Double d1 = Double.valueOf(b);
        Double d2 = Double.valueOf(sh);
        Double d3 = Double.valueOf(i);
        Double d4 = Double.valueOf(f);
        Double d5 = Double.valueOf(l);

        Double d6 = 0.0;
        final Double nanValue = 0.0d / d6;
        final Double infinityValue = 1.0d / 0.0d;

        System.out.println(nanValue);
        System.out.println(infinityValue);

        if (nanValue.isNaN()) {
            System.out.println("переменная nanValue = NAN");
        }
        if (infinityValue.isInfinite()) {
            System.out.println("переменная infinityValue = Infinity");
        }

        Long l1 = 120L;
        Long l2 = 120L;
        System.out.println(l1 == l2);
        l1 = 1200L;
        l2 = 1200L;
        System.out.println(l1 == l2);        //     \(0_0 )/
    }
}
