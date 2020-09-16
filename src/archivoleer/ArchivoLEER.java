/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package archivoleer;
import java.io.*;
/**
 *
 * @author Notebook
 */
public class ArchivoLEER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // LEER ARCHIVO TXT
        
        File f = new File("numeros.txt"); // f -> carga el archivo
        try{
            FileReader fr = new FileReader(f); // fr -> crea flujo hacia f
            BufferedReader br = new BufferedReader(fr); // br -> permite la lectura
            String linea = br.readLine();
            System.out.println(linea);
        
            // for while 
            while(linea!=null){
                
               linea = br.readLine();
               System.out.println(linea);
               
            }
            
            fr.close();
            
        }
        catch(IOException e){
        
            System.out.println("error");
        }
    }
    
}
