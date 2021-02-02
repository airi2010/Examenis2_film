
package examenfilm;

import examenfilm.model.Catalogo;
import examenfilm.control.Get_film;
import examenfilm.mock.MockFilmdisplay;
import examenfilm.model.Pelicula;
import java.util.HashMap;
import java.util.Scanner;

public class ExamenFilm {
    public static void main(String[] args) {
        HashMap<Integer,Pelicula> pelimap=new HashMap<>();
        pelimap=new Get_film().get();
        Catalogo catalog=new Catalogo(pelimap);
        MockFilmdisplay mockdis=new MockFilmdisplay();
        mockdis.displayMenu();
        
        Scanner scanner = new Scanner(System.in);
        
        int data=0;
        try{data=Integer.parseInt(scanner.next());}catch(Exception e){System.out.println("Escriba un valor numérico");}
        
        if(data==1){
            for(Pelicula peli: pelimap.values()){
                mockdis.display(peli.getFilm());
            }
        }else if(data==2){
            for(Pelicula peli: catalog.orderbyYear().values()){
                mockdis.display(peli.getFilm());
            }
        }else if(data==3){
            for(Pelicula peli: catalog.orderbyGenero().values()){
                mockdis.display(peli.getFilm());
            }
        }else if(data==4){
            for(Pelicula peli: catalog.orderbycalificacion().values()){
                mockdis.display(peli.getFilm());
            }
        }else if(data==5){
            for(Pelicula peli: catalog.orderbyviews().values()){
                mockdis.display(peli.getFilm());
            }
        }else{
            System.out.println("Ese número no está en las opciones");
        }
        
    }
    
}
