package com.shop.model;

import com.shop.db.DataBase;
import com.shop.model.dao.ProductDAO;
import com.shop.model.entity.Clock;
import com.shop.model.service.Actions;
import com.shop.model.service.DefaultProductsValue;
import com.shop.model.service.ParameterBySort;
import com.shop.model.service.comparator.CreateDateComparator;
import com.shop.model.service.comparator.NameComparator;
import com.shop.model.service.comparator.PriceComparator;
import com.shop.view.ReadInformation;
import com.shop.view.ShowMessage;

import java.math.BigDecimal;
import java.time.LocalDate;

import static com.shop.model.constants.Constants.ENTER_ACTIONS;
import static com.shop.model.constants.Constants.ENTER_PARAMETER;
import static com.shop.model.constants.Constants.ENTER_PRODUCT_CREATION_ITEM_DATE;
import static com.shop.model.constants.Constants.ENTER_PRODUCT_MANUFACTURE_NAME;
import static com.shop.model.constants.Constants.ENTER_PRODUCT_NAME;
import static com.shop.model.constants.Constants.ENTER_PRODUCT_PRICE;
import static com.shop.model.constants.Constants.ENTER_PRODUCT_WATCH_CASE_MATERIAL;
import static com.shop.model.constants.Constants.YOU_MADE_MISTAKE;

public class Model {

    private final ProductDAO productDAO = new ProductDAO();
    private final DataBase dataBase = new DataBase();
    private final DefaultProductsValue defaultProductsValue = new DefaultProductsValue();

    private void addItem() {
        ReadInformation information = new ReadInformation();
        ShowMessage.showMessage(ENTER_PRODUCT_NAME);
        String name = information.readInformation();
        ShowMessage.showMessage(ENTER_PRODUCT_MANUFACTURE_NAME);
        String manufactureName = information.readInformation();
        ShowMessage.showMessage(ENTER_PRODUCT_PRICE);
        BigDecimal price = new BigDecimal(information.readInformation());
        ShowMessage.showMessage(ENTER_PRODUCT_CREATION_ITEM_DATE);
        int year = information.readDate();
        int month = information.readDate();
        int date = information.readDate();
        LocalDate creationItemDate = LocalDate.of(year, month, date);
        ShowMessage.showMessage(ENTER_PRODUCT_WATCH_CASE_MATERIAL);
        String watchCaseMaterial = information.readInformation();
        productDAO.addNewProduct(new Clock(name, manufactureName, price, creationItemDate, watchCaseMaterial), dataBase);
    }

    private void sortBy(String sortBy) {
        try {
            ParameterBySort sort = ParameterBySort.valueOf(sortBy.toUpperCase());
            switch (sort) {
                case PRICE:
                    productDAO.sortProductBy(dataBase,new PriceComparator());
                    break;
                case NAME:
                    productDAO.sortProductBy(dataBase, new NameComparator());
                    break;
                case CREATE_DATE:
                    productDAO.sortProductBy(dataBase,new CreateDateComparator());
                    break;
            }
        } catch (RuntimeException e) {
            ShowMessage.showMessage(YOU_MADE_MISTAKE);

        }
    }

    public void start() {

        defaultProductsValue.createList(dataBase);
        ReadInformation information = new ReadInformation();
        for (int i = 0; i < 1; ) {

            ShowMessage.showMessage(ENTER_ACTIONS);
            String stringAction = information.readInformation().toUpperCase();
            try {
                Actions action = Actions.valueOf(stringAction);

                switch (action) {
                    case SHOW_ALL:
                        productDAO.showAllProduct(dataBase);
                        break;
                    case SORT_BY:
                        ShowMessage.showMessage(ENTER_PARAMETER);
                        sortBy(information.readInformation().toLowerCase());
                        break;
                    case TOTAL_SUM:
                        productDAO.calculatePriceAllProduct(dataBase);
                        break;
                    case ADD_NEW_ITEM:
                        addItem();
                        break;
                    case EXIT:
                        i = 1;
                        break;
                }
            } catch (RuntimeException e) {
                ShowMessage.showMessage(YOU_MADE_MISTAKE);

            }
        }
    }
}
