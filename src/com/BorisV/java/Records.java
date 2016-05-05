package com.BorisV.java;

import java.util.ArrayList;
import java.util.Date;

public class Records {


    public static final double NO_PRICE = -1;
    private String artist_Name;
    private ArrayList<String> albums_Titles;
    private String genre;
    private double price = 0.0;
    private int num_Of_Albums;
    private int max_Num_Albums;
    private static final int MAX_DAYS_ON_SHELVES = 30;
    private static final int COUNT_DAYS = 0;
    private Date date;
    private String consignor_Name;
    private String consignor_Phone;

    public Records() {

    }

    public Records(String artist_Name) {
        this.artist_Name = artist_Name;
    }

    public Records(String consignor_Name, String consignor_Phone) {
        this.consignor_Name = consignor_Name;
        this.consignor_Phone = consignor_Phone;
    }

    public void add_Album_Title(String new_Title) {
        albums_Titles.add(new_Title);
    }


    public static double getNoPrice() {
        return NO_PRICE;
    }

    public String getArtist_Name() {
        return artist_Name;
    }

    public void setArtist_Name(String artist_Name) {
        this.artist_Name = artist_Name;
    }

    public String getConsignor_Name() {
        return consignor_Name;
    }

    public void setConsignor_Name(String consignor_Name) {
        this.consignor_Name = consignor_Name;
    }

    public String getConsignor_Phone() {
        return consignor_Phone;
    }

    public void setConsignor_Phone(String consignor_Phone) {
        this.consignor_Phone = consignor_Phone;
    }

    public int getMax_Albums() {
        return max_Num_Albums;
    }

    public void setMax_Albums(int max_Num_Albums) {
        this.max_Num_Albums = max_Num_Albums;
    }

    public static int getMaxDaysOnShelves() {
        return MAX_DAYS_ON_SHELVES;
    }

    public static int getCountDays() {
        return COUNT_DAYS;
    }

    public Date getDate() {
        return date = new Date();
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<String> getAlbums_Titles() {
        return albums_Titles;
    }

    public void setAlbums_Titles(ArrayList<String> albums_Titles) {
        this.albums_Titles = albums_Titles;
    }


    public int getNum_Of_Albums() {
        return num_Of_Albums;
    }

    public void setNum_Of_Albums(int num_Of_Albums) {
        this.num_Of_Albums = num_Of_Albums;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
