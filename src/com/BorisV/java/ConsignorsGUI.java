package com.BorisV.java;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsignorsGUI extends JFrame {

    private JTable consignorTable;
    private JButton addNewConsignorButton;
    private JPanel rootPanel;

    Consignors_Model consignors_model;
    public ConsignorsGUI(Consignors_Model consignors_model) {
        setContentPane(rootPanel);
        pack();
        setTitle("CONSIGNORS");
        setLocation(200, 200);
        setPreferredSize(new Dimension(300, 300));
//        setSize(300, 250);
        setVisible(true);
        consignorTable.setGridColor(Color.black);
        consignorTable.setModel(consignors_model);

        addNewConsignorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }

}
