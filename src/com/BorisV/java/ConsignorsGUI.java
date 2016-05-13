package com.BorisV.java;


import javafx.scene.control.SelectionModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConsignorsGUI extends JFrame {

    private JTable consignorTable;
    private JButton addNewConsignorButton;
    private JPanel rootPanel;
    private JButton deleteButton;
    private JLabel massageDel;

    Consignors_Model consignors_model;
    Add_New_Consignor_GUI add_new_consignor_gui;

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

        consignorTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        addNewConsignorButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                add_new_consignor_gui = new Add_New_Consignor_GUI(consignors_model);
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int currentRow = consignorTable.getSelectedRow();

                if (currentRow == -1) {      // -1 means no row is selected. Display error message.
                    JOptionPane.showMessageDialog(rootPane, "Please choose a Consignor to delete");
                    return;
                }


                if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(ConsignorsGUI.this,
                        "Are you sure?", "Delete", JOptionPane.OK_CANCEL_OPTION)) {
                    boolean deleted = consignors_model.deleteRowConsig(currentRow);

                    if (deleted) {
                        Record_Store_Data_Base.loadTables();
                        massageDel.setText("Consignor deleted");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Error deleting consignor");
                    }
                }
            }
        });

    }

}
