package com.shop.controller;

import com.shop.model.Model;

public class Controller {
    Model model;


    public Controller(Model model) {
        this.model = model;
    }

    public void toProcess() {
        model.start();
    }
}
