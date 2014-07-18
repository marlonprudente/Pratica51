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
public class ProdMatrizesIncompativeisException extends MatrizesIncompativeisException{
    private final Matriz m1;
    private final Matriz m2;
 public ProdMatrizesIncompativeisException(Matriz m1, Matriz m2){
       super(m1, m2, String.format(
            "Matrix of %dx%d and %dx%d cannot be added.",
            m1.getMatriz().length, m1.getMatriz()[0].length,
            m2.getMatriz().length, m2.getMatriz()[0].length));
       this.m1 = m1;
       this.m2 = m2;
    }
}
