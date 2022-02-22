package com.shop.model.service;

import com.shop.db.DataBase;
import com.shop.model.entity.DisplayType;
import com.shop.model.entity.DriveMechanism;
import com.shop.model.entity.GrandfatherClock;
import com.shop.model.entity.MechanismType;
import com.shop.model.entity.TableClock;
import com.shop.model.entity.TableClockWithAlarm;
import com.shop.model.entity.TableStrikingClock;
import com.shop.model.entity.WristWatch;
import com.shop.model.entity.WristWatchWithAlarm;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.Month;

public class DefaultProductsValue {

    private static final String STAINLESS_STEEL = "stainless steel";

    public void createList(DataBase dataBase) {
        dataBase.products.add(new WristWatch("Casio Watch GA-2100FR-5AER", "Casio", new BigDecimal("129.33"),
                LocalDate.of(2021, 1, 10), "plastic"));
        dataBase.products.add(new WristWatchWithAlarm("Casio Edifice Solar EFS-S510D-1B", "Casio", new BigDecimal("175.91"),
                LocalDate.of(2022, 1, 10), STAINLESS_STEEL));
        dataBase.products.add(new WristWatch("Hugo Boss Watch 1502611", "Hugo Boss", new BigDecimal("212.75"),
                LocalDate.of(2022, Month.MARCH, 12), STAINLESS_STEEL));
        dataBase.products.add(new WristWatch("Hugo Boss Watch 1513882", "Hugo Boss", new BigDecimal("262.98"),
                LocalDate.of(2022, 1, 15), STAINLESS_STEEL));
        dataBase.products.add(new TableClock("AT8060-09E", "Citizen", new BigDecimal("509.89"),
                LocalDate.of(2022, 2, 14), STAINLESS_STEEL));
        dataBase.products.add(new TableClockWithAlarm("Henning Koppel alarm clock", "Georg Jensen", new BigDecimal("87.90"),
                LocalDate.of(2021, 4, 15), STAINLESS_STEEL));
        dataBase.products.add(new TableStrikingClock("Mahogany Mechanical Table Clock With Westminster Chime & Moon Dial By HERMLE",
                "HERMLE", new BigDecimal("1360.00"), LocalDate.of(2021, 3, 13), "solid timber"));
        dataBase.products.add(new TableClock("table clock", "Liudan", new BigDecimal("39.55"),
                LocalDate.of(2022, 6, 24), "Copper"));
        dataBase.products.add(new GrandfatherClock("Chapman", "Ridgeway", new BigDecimal("3000.00"),
                LocalDate.of(2020, 6, 19), "hardwoods"));
        dataBase.products.add(new GrandfatherClock("Mildenhall", "Ridgeway", new BigDecimal("2700.00"),
                LocalDate.of(2022, 10, 11), "hardwoods"));
        for (int i = 0; i < dataBase.products.size(); i++) {
            dataBase.products.get(i).setDisplayType(DisplayType.UNKNOWN);
            dataBase.products.get(i).setDriveMechanism(DriveMechanism.UNKNOWN);
            dataBase.products.get(i).setMechanismType(MechanismType.UNKNOWN);
            dataBase.products.get(i).setDateOfManufacture(LocalDate.of(2021, i + 1, i + 3 / 2));
        }
    }
}
