/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTEIS;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;


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
    
    public static boolean validarIntervalo(String dataPublicacao, String formato){
        try{
            SimpleDateFormat sdf = new SimpleDateFormat(formato);
            Date data = sdf.parse(dataPublicacao);

            Calendar calendario = Calendar.getInstance();
            calendario.setTime(data);
            
            Calendar hoje = Calendar.getInstance();
            int anoAtual = hoje.get(Calendar.YEAR);

            int ano = calendario.get(Calendar.YEAR);
            return ano >= (anoAtual - 5) && ano <= anoAtual; //2020 a 2025
        } catch (ParseException e){
            return false;
        }
    }
}
