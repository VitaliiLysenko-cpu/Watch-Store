package com.shop.view;

import com.shop.controller.Controller;

public class UserView {
    private Controller controller;

    public UserView(Controller controller) {
        this.controller = controller;
    }

    public void start() {
        controller.toProcess();
    }
}
