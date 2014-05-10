/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package utfpr.ct.dainf.if62c.exemplos;

/**
 * Representa uma matriz de valores double.
 * @author Wilson Horstmeyer Bogadao <wilson@utfpr.edu.br>
 */
public class Matriz {
    
    // a matriz representada por esta classe
    private final double[][] mat;
    
    /**
     * Construtor que aloca a matriz.
     * @param m O número de linhas da matriz.
     * @param n O número de colunas da matriz.
     */
    public Matriz(int m, int n) {
        mat = new double[m][n];
    }
    
    /**
     * Retorna a matriz representada por esta classe.
     * @return A matriz representada por esta classe
     */
    public double[][] getMatriz() {
        return mat;
    }
    
    /**
     * Retorna a matriz transposta.
     * @return A matriz transposta.
     */
    public Matriz getTransposta() {
        Matriz t = new Matriz(mat[0].length, mat.length);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                t.mat[j][i] = mat[i][j];
            }
        }
        return t;
    }
    
    /**
     * Retorna a soma desta matriz com a matriz recebida como argumento.
     * @param mat A matriz a ser somada
     * @return A soma das matrizes
     */
    public Matriz soma(Matriz mat) {
        double[][] m = mat.getMatriz();
        double[][] n = mat.getMatriz();
        double[][] result = mat.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        //Matriz N
        m[2][1] = 2.1;
        n[0][0] = 0.0;
        n[0][1] = 0.1;
        n[1][0] = 1.0;
        n[1][1] = 1.1;
        n[2][0] = 2.0;
        n[2][1] = 2.1;
        for(int i = 0; i< m.length;i++){
            for(int j = 0;j<m[0].length;j++)
            {
                result[i][j] = m[i][j] + n[i][j];
            }
        }
//throw new UnsupportedOperationException("Soma de matrizes não implementada.");
        return mat;
    }

    /**
     * Retorna o produto desta matriz com a matriz recebida como argumento.
     * @param mat A matriz a ser multiplicada
     * @return O produto das matrizes
     */
    public Matriz prod(Matriz mat) {
        double[][] m = mat.getMatriz();
        m[0][0] = 0.0;
        m[0][1] = 0.1;
        m[1][0] = 1.0;
        m[1][1] = 1.1;
        m[2][0] = 2.0;
        Matriz transp = new Matriz(m[0].length,m.length);
            for (int i = 0; i < m.length; i++) {
                for (int j = 0; j < m[i].length; j++) {
                    transp.mat[j][i] = m[i][j];
            }
        }
            double aux = 0;
            double[][] n = transp.getMatriz();
            double[][] result = mat.getMatriz();
        for(int i = 0; i < m.length;i++){
            for(int j = 0;j < m[0].length;j++){
                for(int k = 0; k <m[0].length;k++){
                    aux = m[i][k]*n[k][j] + result[i][j];                    
                }
                result[i][j] = aux;
                aux=0;
            }
        }
       // throw new UnsupportedOperationException("Produto de matrizes não implementado.");
        return transp;
    }

    /**
     * Retorna uma representação textual da matriz.
     * Este método não deve ser usado com matrizes muito grandes
     * pois não gerencia adequadamente o tamanho do string e
     * poderia provocar um uso excessivo de recursos.
     * @return Uma representação textual da matriz.
     */
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (double[] linha: mat) {
            s.append("[ ");
            for (double x: linha) {
                s.append(x).append(" ");
            }
            s.append("]");
        }
        return s.toString();
    }
    
}
