package com.monetary;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Money {
    private final BigDecimal amount;
    public Money(){
        amount = BigDecimal.valueOf(0.0);
    }
    public Money(BigDecimal amount) {
        this.amount = amount;
    }
    public BigDecimal getAmount() {
        return this.amount;
    }
    public String getAmountString() {
        return this.amount.toString();
    }
    public Money addAmount(Money other) {
        BigDecimal sum = setMonetaryScale(this.amount.add(other.amount));
        return new Money(sum);
    }
    private static BigDecimal setMonetaryScale(BigDecimal value){
        return value.setScale(4, RoundingMode.HALF_UP);
    }
}
