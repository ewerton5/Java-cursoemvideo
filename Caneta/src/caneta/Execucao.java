/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caneta;

/**
 *
 * @author Ewerton
 */
public class Execucao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Caneta c1 = new Caneta("Bic", "Azul", 0.5f, 100);
        c1.status();
        c1.destampar();
        c1.rabiscar();
        c1.setCarga(70);
        c1.status();

        Caneta c2 = new Caneta("Compactor", "Vermelha", 0.7f, 100);
        c1.status();
        c2.rabiscar();
        c1.status();
    }

}
