/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author GustavoGuanabara
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Gustavo";
        String x = "Gus";
        String y = "tavo";
        String nome2 = x + y;
        String nome3 = new String("Gustavo");
        String res1, res2;
        res1 = (nome1 == nome2)?"igual":"diferente";
        res2 = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(nome2);
        System.out.println(res1);
        System.out.println(res2);
    }
    
}
