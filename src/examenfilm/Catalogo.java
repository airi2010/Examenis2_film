
package examenfilm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Catalogo {
    HashMap<Integer,Pelicula> pelimap=new HashMap<>();
    
    public Catalogo(HashMap<Integer,Pelicula> pelimap){
        this.pelimap=pelimap;
    }
    
    public HashMap<Integer,Pelicula> orderbyGenero(){
        HashMap<Integer,Pelicula> mapgenero=new HashMap<>();
        ArrayList<String>genero =new ArrayList<String>();
        for(Pelicula peli: pelimap.values()){
            if(!genero.contains(peli.getGenero())){
                genero.add(peli.getGenero());
            }
        }
        Collections.sort(genero); 
        int temp=0;
        while(mapgenero.size()!= pelimap.size()){
            for(Pelicula peli: pelimap.values()){
                if(peli.getGenero().equals(genero.get(temp))){
                    mapgenero.put(mapgenero.size(),peli);
                }
            }
            temp++;
        }
        
        return mapgenero;
    }
    public HashMap<Integer,Pelicula> orderbyYear(){
        HashMap<Integer,Pelicula> mapyear=new HashMap<>();
        ArrayList<Integer>years =new ArrayList<Integer>();
        for(Pelicula peli: pelimap.values()){
            if(!years.contains(peli.getyear())){
                years.add(peli.getyear());
            }
        }
        Collections.sort(years,Collections.reverseOrder()); 
        int temp=0;
        while(mapyear.size()!= pelimap.size()){
            for(Pelicula peli: pelimap.values()){
                if(peli.getyear()==years.get(temp)){
                    mapyear.put(mapyear.size(),peli);
                }
            }
            temp++;
        }
        
        return mapyear;
    }
    
    public HashMap<Integer,Pelicula> orderbycalificacion(){
        HashMap<Integer,Pelicula> mapvalue=new HashMap<>();
        ArrayList<Integer>values =new ArrayList<Integer>();
        for(Pelicula peli: pelimap.values()){
            if(!values.contains((int)peli.getCalificacion())){
                values.add((int)peli.getCalificacion());
            }
        }
        Collections.sort(values,Collections.reverseOrder()); 
        int temp=0;
        while(mapvalue.size()!= pelimap.size()){
            for(Pelicula peli: pelimap.values()){
                if((int)peli.getCalificacion()==values.get(temp)){
                    mapvalue.put(mapvalue.size(),peli);
                }
            }
            temp++;
        }
        
        return mapvalue;
    }
    
}
