package com.BorisV.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_New_AlbumsGUI extends JFrame {
    private JTextField artistTextField;
    private JTextField titleTextField;
    private JPanel rootPanel;
    private JLabel picLogoleftside;
    private JTextField priceTextField;
    private JButton addAlbumButton;
    private JComboBox <Integer> consignorIDComboBox;
    private JButton addNewConsignorButton;

    Consignors_Model consig_Model;

    public Add_New_AlbumsGUI(final Record_Store_Data_Model record_store_data_model) {
        setContentPane(rootPanel);
        setTitle("Add albums");
        pack();
        setLocation(350, 200);
        setSize(300, 250);
        setVisible(true);

        picLogoleftside.setIcon(new ImageIcon("src/Pictures/Record-Player-icon.png"));

        consignorIDComboBox.addItem(null);
        int consignor = 0;
        consig_Model.getColumnCount();

        
//        SELECT Description, ListPrice, Color FROM Product ORDER BY ListPrice DESC;



        addAlbumButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String artist = artistTextField.getText();
                if (artist == null || artist.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter name");
                    return;
                }

                String title = titleTextField.getText();
                if (title == null || title.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Missing title");
                    return;
                }


                double price;

                try {
                    price = Double.parseDouble(priceTextField.getText());
                    if (price < 0.0) {
                        throw new NumberFormatException("Enter numeric value greater than 0");
                    }
                } catch (NumberFormatException ne) {
                    JOptionPane.showMessageDialog(rootPane,"Enter album price");
                    priceTextField.setText(null);
                    return;

                }

                boolean insertRow = record_store_data_model.insertRow(artist, title, consignor, price);
                if (!insertRow) {
                    JOptionPane.showMessageDialog(rootPane, "Error adding new data");
                }

                artistTextField.setText(null);
                titleTextField.setText(null);
                priceTextField.setText(null);
            }
        });
    }
}
