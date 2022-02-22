package com.shop.model.dao;

import com.shop.db.DataBase;
import com.shop.model.entity.Clock;
import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.util.Comparator;

import static com.shop.model.constants.Constants.PRODUCT;
import static com.shop.model.constants.Constants.TOTAL_SUM;

public class ProductDAO {
    public void addNewProduct(Clock clock, DataBase db) {
        db.products.add(clock);
        showAllProduct(db);
    }

    public void showAllProduct(DataBase db) {
        for (int i = 0; i < db.products.size(); i++) {
            String message = PRODUCT + (i + 1) + ": " + db.products.get(i);
            ShowMessage.showMessage(message);
        }
    }

    public void sortProductBy(DataBase db, Comparator<Clock> comparator) {
        db.products.sort(comparator);
        for (int i = 0; i < db.products.size(); i++) {
            String message = PRODUCT + (i + 1) + ": " + db.products.get(i);
            ShowMessage.showMessage(message);
        }
    }

    public void calculatePriceAllProduct(DataBase db) {
        BigDecimal sumPrices = new BigDecimal("0");
        for (int i = 0; i < db.products.size(); i++) {
            sumPrices = sumPrices.add(db.products.get(i).getPrice());
        }
        String message = TOTAL_SUM + sumPrices;
        ShowMessage.showMessage(message);
    }
}
