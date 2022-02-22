package com.shop.model.entity;

import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

import static com.shop.model.constants.Constants.BOM_BOM;

public class TableStrikingClock extends TableClock implements Chime {
    private String soundChime = BOM_BOM;

    public TableStrikingClock(String name, String manufactureName, BigDecimal price, LocalDate creationItemDate, String watchCaseMaterial) {
        super(name, manufactureName, price, creationItemDate, watchCaseMaterial);
    }

    @Override
    public void toChime() {
        ShowMessage.showMessage(soundChime);
    }

    public String getSoundChime() {
        return soundChime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        TableStrikingClock that = (TableStrikingClock) o;
        return getSoundChime().equals(that.getSoundChime());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSoundChime());
    }

    @Override
    public String toString() {
        return "TableStrikingClock{" + super.toString() + '}';
    }
}

