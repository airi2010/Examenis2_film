package examenfilm;

public class Pelicula {
    private String Titulo;
    private int year;
    private String director;
    private String actores;
    private String genero;
    private double calificacion;
    private String duracion;
    private String imagen;

    public Pelicula(String Titulo, int year, String director, String actores, String genero, double calificacion, String duracion, String imagen) {
        this.Titulo = Titulo;
        this.year = year;
        this.director = director;
        this.actores = actores;
        this.genero = genero;
        this.calificacion = calificacion;
        this.duracion = duracion;
        this.imagen = imagen;
    }
    
    
    public String getGenero(){
        return genero;
    }
    
    public int getyear(){
        return year;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    public String getFilm(){
        return imagen+" : "+Titulo+" "+year+" "+director+" "+genero+" "+calificacion+" "+duracion+" "+actores;
    }
}
