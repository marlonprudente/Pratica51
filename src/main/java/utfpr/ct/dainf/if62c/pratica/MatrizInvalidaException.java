/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.pratica;

/**
 *
 * @author Marlon
 */
public class MatrizInvalidaException extends Exception{
    private final int i;
    private final int j;
    
    public MatrizInvalidaException(int i, int j){
        System.out.println("Matriz de " + i + "x" + j + " nao pode ser criada." );
        this.i = i;
        this.j = j;
    }

    public int geti(){
        return i;
    }
    public int getj(){
        return j;
    }
    
}
