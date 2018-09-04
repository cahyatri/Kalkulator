/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfx;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author MPC
 */
public class LatihanjavafxController implements Initializable {

    @FXML
    private TextField bilangan1;
    @FXML
    private TextField bilangan2;
    @FXML
    private Button buttontambah;
    @FXML
    private Button buttonkurang;
    @FXML
    private Button buttonkali;
    @FXML
    private Button buttonbagi;
    @FXML
    private TextField hasiloperasi;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void penjumlahan(ActionEvent event) {
        int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpenjumlahan = bil1+bil2;
        
        //menampilkan hasil
        hasiloperasi.setText(String.valueOf(hasilpenjumlahan));
    }

    @FXML
    private void pengurangan(ActionEvent event) {
          int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpengurangan = bil1-bil2;
        
        //menampilkan hasil
        hasiloperasi.setText(String.valueOf(hasilpengurangan));
    }

    @FXML
    private void perkalian(ActionEvent event) {
          int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilperkalian = bil1*bil2;
        
        //menampilkan hasil
        hasiloperasi.setText(String.valueOf(hasilperkalian));
    }

    @FXML
    private void pembagian(ActionEvent event) {
          int bil1 = Integer.parseInt(bilangan1.getText());
        int bil2 = Integer.parseInt(bilangan2.getText());
        int hasilpembagian = bil1/bil2;
        
        //menampilkan hasil
        hasiloperasi.setText(String.valueOf(hasilpembagian));
        
    }
    
}
