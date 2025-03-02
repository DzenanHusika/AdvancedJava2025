package three.patterns.strategy;

import java.math.BigDecimal;
@FunctionalInterface
public interface Discounter {
    String name = "Disc";
    BigDecimal applyDiscount(BigDecimal fullAmount);

//BigDecimal getDiscountPercentage();

}
