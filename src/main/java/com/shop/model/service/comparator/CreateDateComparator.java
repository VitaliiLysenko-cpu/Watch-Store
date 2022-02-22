package com.shop.model.service.comparator;


import com.shop.model.entity.Clock;

import java.util.Comparator;

public class CreateDateComparator implements Comparator<Clock> {
    public int compare(Clock clock1, Clock clock2) {
        return clock1.getCreationItemDate().compareTo(clock2.getCreationItemDate());
    }
}
