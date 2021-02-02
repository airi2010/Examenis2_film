
package examenfilm;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

public class Get_film {
  
    public HashMap<Integer,Pelicula> get(){
        HashMap<Integer,Pelicula> pelimap=new HashMap<>();
        try{
           File database=new File("database.txt");
            BufferedReader br = new BufferedReader(new FileReader(database)); 
            String line;
            while((line=br.readLine())!=null){
                String[] temp= line.split(":");
                Pelicula peli=new Pelicula(temp[0],Integer.parseInt(temp[1]),temp[2],temp[3],temp[4],Integer.parseInt(temp[5]),temp[6],temp[7]);
                pelimap.put(pelimap.size(),peli);
            }
        }catch (Exception e){
            System.out.println(e);
        }
    
        
        
        return pelimap;
    }
}
