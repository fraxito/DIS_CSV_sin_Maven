/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacsv;

/**
 *
 * @author jorgecisneros
 */
public class PruebaCSV {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LectorCSV miLector = new LectorCSV();
        
        miLector.leeCSV("./src/datos/pokemon.csv");
    }
    
}
