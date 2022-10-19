/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebacsv;

import java.io.FileReader;
import com.opencsv.CSVReader;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author jorgecisneros
 */
public class LectorCSV {
    
    public void leeCSV( String nombreArchivo){
        try {
            CSVReader csvReader = new CSVReader(new FileReader(nombreArchivo));
            String[] fila = null;
            while((fila = csvReader.readNext()) != null) {
                System.out.println(fila[0]
                          + " | " + fila[1]
                          + " |  " + fila[2]);
            }
            csvReader.close();
        } catch (Exception ex) {
            System.out.print(ex.getMessage());
        }
        
    }

}
