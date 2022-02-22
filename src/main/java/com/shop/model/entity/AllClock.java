package com.shop.model.entity;

import java.math.BigDecimal;
import java.time.LocalDate;

public abstract class AllClock {

    private final String watchCaseMaterial;
    private final String name;
    private final String manufactureName;
    private final BigDecimal price;
    private final LocalDate creationItemDate;
    private DisplayType displayType;
    private MechanismType mechanismType;
    private LocalDate dateOfManufacture;
    private DriveMechanism driveMechanism;

    public AllClock(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {

        this.watchCaseMaterial = watchCaseMaterial;
        this.name = name;
        this.manufactureName = manufactureName;
        this.price = price;
        this.creationItemDate = creationItemDate;
    }

    public DisplayType getDisplayType() {
        return displayType;
    }

    public void setDisplayType(DisplayType displayType) {
        this.displayType = displayType;
    }

    public MechanismType getMechanismType() {
        return mechanismType;
    }

    public void setMechanismType(MechanismType mechanismType) {
        this.mechanismType = mechanismType;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }

    public DriveMechanism getDriveMechanism() {
        return driveMechanism;
    }

    public void setDriveMechanism(DriveMechanism driveMechanism) {
        this.driveMechanism = driveMechanism;
    }

    public String getWatchCaseMaterial() {
        return watchCaseMaterial;
    }

    public String getName() {
        return name;
    }

    public String getManufactureName() {
        return manufactureName;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDate getCreationItemDate() {
        return creationItemDate;
    }
}

