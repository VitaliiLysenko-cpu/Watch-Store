package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import static com.shop.model.constants.Constants.ALARM;

public class WristWatchWithAlarm extends WristWatch implements ToAlarm {



    public WristWatchWithAlarm(String name, String manufactureName,
                               BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void toAlarm(LocalDate time) {
        ShowMessage.showMessage(ALARM);
    }

    public String getAlarm() {
        return ALARM;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WristWatchWithAlarm that = (WristWatchWithAlarm) o;
        return getAlarm().equals(that.getAlarm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAlarm());
    }

    @Override
    public String toString() {
        return "WristWatchWithAlarm{" + super.toString() + '}';
    }
}

