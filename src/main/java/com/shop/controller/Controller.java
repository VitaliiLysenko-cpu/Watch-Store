package com.shop.controller;

import com.shop.db.DataBase;
import com.shop.model.Model;
import com.shop.model.entity.Clock;
import com.shop.view.ShowMessage;

import java.util.Comparator;

public class Controller {

    Model model;

    public Controller(Model model) {
        this.model = model;
    }

    public static void show(String message) {
        ShowMessage.showMessage(message);
    }

    public void toProcess() {
        model.start();
    }

    public void add(Clock clock, DataBase db) {
        db.products.add(clock);
    }

    public void sort(DataBase db, Comparator<Clock> comparator) {
        db.products.sort(comparator);
    }
}
