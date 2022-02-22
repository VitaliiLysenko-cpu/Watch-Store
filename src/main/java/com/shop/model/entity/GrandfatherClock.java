package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class GrandfatherClock extends Clock implements ShowTime, Chime {

    private DriveMechanism driveMechanism = DriveMechanism.UNKNOWN;
    private String soundChime = "bom-bom";

    public GrandfatherClock(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void showTime() {
        ShowMessage.showMessage(LocalDateTime.now().toString());
    }
    @Override
    public DriveMechanism getDriveMechanism() {
        return driveMechanism;
    }
@Override
    public void setDriveMechanism(DriveMechanism driveMechanism) {
        this.driveMechanism = driveMechanism;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GrandfatherClock that = (GrandfatherClock) o;
        return getDriveMechanism() == that.getDriveMechanism();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getDriveMechanism());
    }

    @Override
    public String toString() {
        return "GrandfatherClock{" + super.toString() + '}';
    }

    @Override
    public void toChime() {
        ShowMessage.showMessage(soundChime);
    }
}

