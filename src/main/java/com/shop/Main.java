package com.shop;

import com.shop.controller.Controller;
import com.shop.model.Model;
import com.shop.view.UserView;

public class Main {


    public static void main(String[] args) {

        Model model = new Model();
        Controller controller = new Controller(model);
        UserView userView = new UserView(controller);
        userView.start();
    }
}
