package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Clock extends AllClock implements ShowTime {

    public Clock(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void showTime() {
        ShowMessage.showMessage(LocalDateTime.now().toString());
    }

    @Override
    public String toString() {
        return "Clock{" +
                " name = " + getName() + "," + '\t' +
                " manufactureName = " + getManufactureName() + "," + '\t' +
                " price = " + getPrice() + "," + '\t' +
                " creationItemDate = " + getCreationItemDate() + "," + '\t' +
                " watchCaseMaterial = " + getWatchCaseMaterial() + "," + '\t' +
                " displayType = " + getDisplayType() + "," + '\t' +
                " mechanismType = " + getMechanismType() + "," + '\t' +
                " dateOfManufacture = " + getDateOfManufacture() + "," + '\t' +
                " driveMechanism = " + getDriveMechanism() +
                '}';
    }
}
