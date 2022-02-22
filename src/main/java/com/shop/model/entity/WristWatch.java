package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class WristWatch extends Clock implements ShowTime {

    private Gander gander;

    public WristWatch(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void showTime() {
        ShowMessage.showMessage(LocalDateTime.now().toString());
    }

    public Gander getGander() {
        return gander;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WristWatch that = (WristWatch) o;
        return getGander() == that.getGander();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getGander());
    }

    @Override
    public String toString() {
        return "WristWatch{" + super.toString() + '}';
    }
}

