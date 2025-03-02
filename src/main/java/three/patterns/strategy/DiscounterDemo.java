package three.patterns.strategy;

import java.math.BigDecimal;

public class DiscounterDemo {
    public static void main(String[] args) {
        Discounter discounter = new FridayDiscounter();
        DiscounterExecutor discounterExecutor = new DiscounterExecutor(discounter);
        BigDecimal fullPrice = new BigDecimal("324.5");
        BigDecimal discounted = discounterExecutor.executeDiscountCalc(fullPrice);
        System.out.println("Friday Discount = " + discounted);
        discounterExecutor.setDiscounter(new NewYearDiscounter());
        discounted = discounterExecutor.executeDiscountCalc(fullPrice);
        System.out.println("New Year Discount = " + discounted);
        Discounter finalDiscounter = (puniIznos) -> puniIznos.multiply(new BigDecimal("0.2"));
        discounterExecutor.setDiscounter(finalDiscounter);
        discounted = discounterExecutor.executeDiscountCalc(fullPrice);
        System.out.println("Final discount = " + discounted);
        Discounter onSaleDiscounter = DiscounterDemo::onSale;
        discounterExecutor.setDiscounter(onSaleDiscounter);
        discounted  = discounterExecutor.executeDiscountCalc(fullPrice);
        System.out.println("Final On Sale discount = " + discounted);
    }
    private static BigDecimal onSale(BigDecimal fullAmount){
        return fullAmount.multiply(new BigDecimal("0.1"));
    }
}
