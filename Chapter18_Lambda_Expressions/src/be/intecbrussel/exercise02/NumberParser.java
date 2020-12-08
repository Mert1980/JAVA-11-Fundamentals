package be.intecbrussel.exercise02;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {
    public BigDecimal parse(String s);
}
