package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class WallClock extends Clock implements ShowTime{

    public WallClock(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void showTime() {
        ShowMessage.showMessage(LocalDateTime.now().toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        WallClock wallClock = (WallClock) o;
        return getDriveMechanism() == wallClock.getDriveMechanism();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDriveMechanism());
    }

    @Override
    public String toString() {
        return "WallClock{" + super.toString() + '}';
    }
}
