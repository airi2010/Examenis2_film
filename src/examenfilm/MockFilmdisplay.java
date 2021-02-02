
package examenfilm;

public class MockFilmdisplay {
    
    public void display(String value){
        System.out.println(value);
    }

    void displayMenu() {
        System.out.println("Catálogo de películas");
        System.out.println("Elija Como las quiere ver:");
        System.out.println("1º Sin Orden");
        System.out.println("2º Por Año");
        System.out.println("3º Por Género");
        System.out.println("4º Por calificación");
    }
}
