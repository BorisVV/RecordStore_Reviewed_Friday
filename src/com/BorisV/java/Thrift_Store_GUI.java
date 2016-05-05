package com.BorisV.java;

import javax.swing.*;
import java.util.Vector;

public class Thrift_Store_GUI extends JFrame {
    private JPanel rootPanel;
    private JTable thriftStore_table;
    private JButton exitButton;

    Thrift_Store_Table_Model dollarDealTableModel;
    Vector<Thrift_Store_Table_Model> dollarStore;


    Thrift_Store_GUI() {

        super("DOLLAR RECORD STORE");


        //this is called when the user click thriftStore button
        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);



        dollarDealTableModel = new Thrift_Store_Table_Model();   //Provide Vector of Lakes


    }


}
