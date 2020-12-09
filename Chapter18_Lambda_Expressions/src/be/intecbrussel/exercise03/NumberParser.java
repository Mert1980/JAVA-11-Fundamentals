package be.intecbrussel.exercise03;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {
    public BigDecimal parse(String s);
}
