import utfpr.ct.dainf.if62c.pratica.Matriz;
import utfpr.ct.dainf.if62c.pratica.MatrizInvalidaException;
import utfpr.ct.dainf.if62c.pratica.ProdMatrizesIncompativeisException;
import utfpr.ct.dainf.if62c.pratica.SomaMatrizesIncompativeisException;

/* Autor: Marlon Prudente
* marlonmateuspr@gmail.com
*
*/
public class Pratica51 {

    public static void main(String[] args) {
        
        Matriz mA = null, mB = null, mC = null, mD, mE;
        double[][] m;
        
        // tentando criar uma matriz com 0 linhas
        try {
            mA = new Matriz(0, 3);
        } catch (MatrizInvalidaException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        try {
            mA = new Matriz(2, 3);
            m = mA.getMatriz();
            m[0][0] = 1.00;
            m[0][1] = 1.01;
            m[0][2] = 1.02;
            m[1][0] = 1.10;
            m[1][1] = 1.11;
            m[1][2] = 1.12;
            
            mB = new Matriz(2, 3);
            m = mB.getMatriz();
            m[0][0] = 2.00;
            m[0][1] = 2.01;
            m[0][2] = 2.02;
            m[1][0] = 2.10;
            m[1][1] = 2.11;
            m[1][2] = 2.12;
            
            mC = new Matriz(3, 1);
            m = mC.getMatriz();
            m[0][0] = 3.00;
            m[1][0] = 3.11;
            m[2][0] = 3.22;
        } catch (MatrizInvalidaException e) {
            System.out.println(e.getLocalizedMessage());
        }        
        // tentando somar matrizes com dimensões diferentes
        try {
            mD = mA.soma(mC);
        } catch (SomaMatrizesIncompativeisException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        // tentando multiplicar matrizes com dimensões incompatíveis
        try {
            mE = mA.prod(mB);
        } catch (ProdMatrizesIncompativeisException e) {
            System.out.println(e.getLocalizedMessage());
        }
        
        // executando as operações com matrizes de dimensoes compativeis
        mD = mA.soma(mB);
        System.out.println("mA + mB = " + mD);
        mE = mA.prod(mC);
        System.out.println("mA * mC = " + mE);
    }
}