package three.patterns.strategy;

import java.math.BigDecimal;

public class DiscounterExecutor {
    private Discounter discounter;

    public DiscounterExecutor(Discounter discounter){
        this.discounter = discounter;
    }

    public Discounter getDiscounter() {
        return discounter;
    }

    public void setDiscounter(Discounter discounter) {
        this.discounter = discounter;
    }

    public BigDecimal executeDiscountCalc(BigDecimal fullAmount){
        return discounter.applyDiscount(fullAmount);
    }
}
