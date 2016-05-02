package com.BorisV.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Record_Store_Form extends JFrame{
    private JTextField artistTextField;
    private JTextField titleTextField;
    private JTextField sellingPrice$TextField;
    private JTextField newConsignorTextField;
    private JTextField phoneNumberTextField;
    private JTextField saleDateTextField;
    private JTextField soldPrice$TextField;
    private JButton addToFileButton;
    private JButton updateAndSaveButton;
    private JComboBox selectConsignorComboBox;
    private JPanel rootPanel;
    private JLabel picLogoleftside;
    private JComboBox musicGenre_comboBox1;
    private JLabel musicGenreLabel;
    private JButton saveToListButton1;
    private JLabel newMusicGenreLabel;
    private JTextField newMusicGenre_textField1;
    private JButton saveToListButton;
    private JLabel picLogolrightside;

    Record_Store_Form() {

        super("RECORD STORE APPLICATION");

        setContentPane(rootPanel);
        pack();
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        picLogoleftside.setIcon(new ImageIcon("src/Pictures/Record-Player-icon.png"));
        picLogolrightside.setIcon(new ImageIcon("src/Pictures/Record-Player-icon.png"));

        addToFileButton.addActionListener(new ActionListener() {
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

                artistTextField.setText(null);
                titleTextField.setText(null);
            }
        });
        updateAndSaveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        selectConsignorComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
