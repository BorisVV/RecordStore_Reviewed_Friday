package com.BorisV.java;


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Add_New_Consignor_GUI extends JFrame {
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JTextField phoneTextField;
    private JButton saveButton;

    public Add_New_Consignor_GUI(final Consignors_Model consignors_model) {
        setContentPane(rootPanel);
        setTitle("Add albums");
        pack();
        setLocation(350, 200);
        setSize(400, 400);
        setVisible(true);






        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String artist = nameTextField.getText();
                if (artist == null || artist.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Enter name");
                    return;
                }

                String title = phoneTextField.getText();
                if (title == null || title.trim().equals("")) {
                    JOptionPane.showMessageDialog(rootPane, "Missing title");
                    return;
                }


                nameTextField.setText(null);
                phoneTextField.setText(null);

            }
        });
    }


}
