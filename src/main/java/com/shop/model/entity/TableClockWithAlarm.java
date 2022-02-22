package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import static com.shop.model.constants.Constants.WAKE_UP;

public class TableClockWithAlarm extends TableClock implements ToAlarm {

    public TableClockWithAlarm(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void toAlarm(LocalDate time) {
        ShowMessage.showMessage(WAKE_UP);
    }

    public String getAlarm() {
        return WAKE_UP;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TableClockWithAlarm that = (TableClockWithAlarm) o;
        return getAlarm().equals(that.getAlarm());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getAlarm());
    }

    @Override
    public String toString() {
        return "TableClockWithAlarm{" + super.toString() + '}';
    }
}

