
package examenfilm;

import java.util.HashMap;
import java.util.Scanner;

public class ExamenFilm {
    public static void main(String[] args) {
        HashMap<Integer,Pelicula> pelimap=new HashMap<>();
        pelimap=new Get_film().get();
        Catalogo catalog=new Catalogo(pelimap);
        MockFilmdisplay mockdis=new MockFilmdisplay();
        
        System.out.println("Catálogo de películas");
        System.out.println("Elija Como las quiere ver:");
        System.out.println("1º Sin Orden");
        System.out.println("2º Por Año");
        System.out.println("3º Por Género");
        Scanner scanner = new Scanner(System.in);
        
        int data=0;
        try{data=Integer.parseInt(scanner.next());}catch(Exception e){System.out.println("Escriba un valor numérico");}
        
        if(data==1){
            for(Pelicula peli: pelimap.values()){
                mockdis.display(peli.getFilm());
            }
        }else if(data==2){
        }else if(data==3){
        }else{
            System.out.println("Ese número no está en las opciones");
        }
        
    }
    
}
