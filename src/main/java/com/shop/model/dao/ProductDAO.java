package com.shop.model.dao;

import com.shop.controller.Controller;
import com.shop.db.DataBase;
import com.shop.model.entity.Clock;

import java.math.BigDecimal;
import java.util.Comparator;

import static com.shop.model.constants.Constants.PRODUCT;
import static com.shop.model.constants.Constants.TOTAL_SUM;

public class ProductDAO {

    Controller controller;

    public void addNewProduct(Clock clock, DataBase db) {
        controller.add(clock, db);
        showAllProduct(db);
    }

    public void showAllProduct(DataBase db) {
        for (int i = 0; i < db.products.size(); i++) {
            String message = PRODUCT + (i + 1) + ": " + db.products.get(i);
            Controller.show(message);
        }
    }

    public void sortProductBy(DataBase db, Comparator<Clock> comparator) {
        controller.sort(db, comparator);
        for (int i = 0; i < db.products.size(); i++) {
            String message = PRODUCT + (i + 1) + ": " + db.products.get(i);
            Controller.show(message);
        }
    }

    public void calculatePriceAllProduct(DataBase db) {
        BigDecimal sumPrices = new BigDecimal("0");
        for (int i = 0; i < db.products.size(); i++) {
            sumPrices = sumPrices.add(db.products.get(i).getPrice());
        }
        String message = TOTAL_SUM + sumPrices;
        Controller.show(message);
    }
}
