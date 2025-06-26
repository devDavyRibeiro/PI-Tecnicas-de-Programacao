/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTEIS;

/**
 *
 * @author MathGueff
 */
public class DateParser {
    /**
     * 
     * @param date - Horário no formato yyyy-MM-dd
     * @return novo horário formatado para dd-MM-yyyy
     */
    public static String parseDMA(String date){
        return date.substring(8, 10) + "/" +date.substring(5, 7) + "/" + date.substring(0, 4);
    }
}
