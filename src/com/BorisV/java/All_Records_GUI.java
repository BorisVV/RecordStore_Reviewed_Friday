package com.BorisV.java;


import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class All_Records_GUI extends JFrame {
    private JPanel rootPanel;
    private JTable albumsTable;
    private JTextArea textArea1;
    private JButton addAlbumsButton;
    private JButton deleteButton;
    private JButton consignorsButton;

    private static Add_New_AlbumsGUI record_store_gui;
    private static ConsignorsGUI consignorTableGUI;

    public All_Records_GUI(final Record_Store_Data_Model recordStore_data_model, Consignors_Model consignors_model) {
        setLocation(200, 150);
        setPreferredSize(new DimensionUIResource(760, 500));
        setContentPane(rootPanel);
        setVisible(true);
        pack();
        setTitle("RECORD STORE");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        albumsTable.setGridColor(Color.black);
        albumsTable.setModel(recordStore_data_model);

        albumsTable.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
//        albumsTable.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

//        textArea1.setText(String.valueOf(consignors_model.getColumnCount()));
//        textArea1.setText(String.valueOf(consignors_model.getValueAt(0, 2)));
//        textArea1.setText(String.valueOf(recordStore_data_model.getValueAt(0, 3)));

        addAlbumsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                record_store_gui = new Add_New_AlbumsGUI(recordStore_data_model);
            }
        });

        deleteButton.addActionListener((e) -> {
            int currentRow = albumsTable.getSelectedRow();

            if (currentRow == -1) {      // -1 means no row is selected. Display error message.
                JOptionPane.showMessageDialog(rootPane, "Please choose an album to delete");
                return;
            }
            if (JOptionPane.OK_OPTION == JOptionPane.showConfirmDialog(All_Records_GUI.this,
                    "Are you sure?", "Delete", JOptionPane.OK_CANCEL_OPTION)) {
                boolean deleted = recordStore_data_model.deleteRow(currentRow);
                if (deleted) {
                    Record_Store_Data_Base.loadTables();
                    textArea1.setText("Album Removed = " + String.valueOf(deleted));

                } else {
                    JOptionPane.showMessageDialog(rootPane, "Error removing album");
                }
            }
        });


        consignorsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                consignorTableGUI = new ConsignorsGUI(consignors_model);

            }
        });
    }
}


/*
        textArea1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
//                albumsTable.getSelectedColumn();
                albumsTable.getCellSelectionEnabled();
                albumsTable.getAccessibleContext();

                textArea1.setText(albumsTable.getToolTipText());

            }

        });
        albumsTable.clearSelection();
    }
*/




