/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASSES;

import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.text.ParseException;


/**
 *
 * @author SaneaSP
 */
public class DataValidation {
    
    public static boolean validarData(String dataPublicacao, String formato) {
        SimpleDateFormat sdf = new SimpleDateFormat(formato);
        sdf.setLenient(false);
        try {
            sdf.parse(dataPublicacao);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
    
}
