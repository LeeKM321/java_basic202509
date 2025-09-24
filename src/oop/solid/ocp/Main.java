package oop.solid.ocp;

public class Main {

    public static void main(String[] args) {

        DiscountCalculator calc = new DiscountCalculator();

        long vipPrice = calc.calculateDiscount("VIP", 200000);
        System.out.println("vipPrice = " + vipPrice);

    }

}
