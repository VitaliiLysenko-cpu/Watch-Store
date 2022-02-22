package com.shop.model.service.comparator;

import com.shop.model.entity.Clock;

import java.math.BigDecimal;
import java.util.Comparator;

public class PriceComparator implements Comparator<Clock> {
    public int compare(Clock clock1, Clock clock2) {
        BigDecimal price1 = clock1.getPrice();
        BigDecimal price2 = clock2.getPrice();
        return price1.compareTo(price2);
    }
}
