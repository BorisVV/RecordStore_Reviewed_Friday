package com.BorisV.java;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Record_Store_Data_Base {

    private static String DB_CONNECTION_URL = "jdbc:mysql://localhost:3306/";
    private static final String DB_NAME = "recordStoreData";
    private static final String USER = "root";
    private static final String PASS = "primero";


    static Statement statement = null;
    static Connection conn = null;
    static ResultSet rs = null;

    public final static String RECSTORE_DATA_TABLE = "Record Store";
    public final static String PK_COLUMN = "Index";

    public final static String ARTIST_NAME   = "Name";
    public final static String ALBUM_NAME = "Title";
    public final static String CATEGORY = "Category";
    public final static String PRICE = "Price";
    public final static String newDate = "Date";

    private static Record_Store_Data_Model recordStore_data_model;

    public static void main(String[] args) {
        Record_Store_GUI record_store_form = new Record_Store_GUI();

    }


}
