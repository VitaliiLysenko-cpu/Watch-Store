package com.shop.model.constants;

import com.shop.model.service.Actions;
import com.shop.model.service.ParameterBySort;

public class Constants {
    public static final String ENTER_PARAMETER = "Enter parameters for sorting.(permissible value"+
            ParameterBySort.PRICE + ", "+ ParameterBySort.NAME+", "+ ParameterBySort.CREATE_DATE+")";
    public static final String ENTER_PRODUCT_MANUFACTURE_NAME = "Enter product manufacture name";
    public static final String ENTER_PRODUCT_NAME = "Enter product name";
    public static final String ENTER_ACTIONS = "Enter action (permissible value " + Actions.SHOW_ALL + ", " +
            Actions.SORT_BY + ", " + Actions.TOTAL_SUM + ", " + Actions.ADD_NEW_ITEM + ", " + Actions.EXIT + ")";
    public static final String ENTER_PRODUCT_PRICE = "Enter product price";
    public static final String ENTER_PRODUCT_CREATION_ITEM_DATE = "Enter product creation item date (YYYY MM DD)";
    public static final String ENTER_PRODUCT_WATCH_CASE_MATERIAL = "Enter product watch case material";
    public static final String YOU_MADE_MISTAKE = "You made mistake";
    public static final String PRICE = "price";
    public static final String NAME = "Name";
    public static final String CREATE_DATE = "create_date";
    public static final String WAKE_UP = "Wake up" ;
    public static final String BOM_BOM = "bom-bom";
    public static final String TOTAL_SUM ="Total sum = ";
    public static final String PRODUCT = "product " ;
    public static final String ALARM = "wake up";

    private Constants() {
    }
}
