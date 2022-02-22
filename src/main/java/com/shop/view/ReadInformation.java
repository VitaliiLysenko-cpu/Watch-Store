package com.shop.view;

import java.util.Scanner;

public class ReadInformation {
    Scanner scanner = new Scanner(System.in);

    public String readInformation() {
        return scanner.next();
    }

    public Integer readDate() {
        return scanner.nextInt();
    }
}
