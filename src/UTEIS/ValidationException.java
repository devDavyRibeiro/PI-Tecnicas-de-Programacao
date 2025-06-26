/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UTEIS;

/**
 *
 * @author MathGueff
 */
public class ValidationException extends Exception{
    private ValidationEnum tipo;
    public ValidationException (String message, ValidationEnum tipo){
        super(message);
        this.tipo = tipo;
    }
    
    public ValidationEnum getTipo(){
        return this.tipo;
    }
}
