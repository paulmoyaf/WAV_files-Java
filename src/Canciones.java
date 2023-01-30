
public class Canciones {
    
    private int lista;
    private String cancion;
    private String nombre;
    private int ano;


    public Canciones(int lista, String cancion, String nombre, int ano){
        this.lista  = lista;
        this.cancion= cancion;
        this.nombre = nombre;
        this.ano    = ano;
    }

    public void leerCancion(){
        System.out.printf("%d) %s - %s (%d)\n",lista, cancion, nombre, ano); 
    }    
    public void verReproduccion(){
        System.out.printf("Reproduciendo cancion: %s - %s (%d)\n", cancion, nombre,ano);
    }
}

    // public int getLista(){
    //     return lista;
    // }

    // public String getCancion(){
    //     return cancion;
    // }

    // public String getNombre(){
    //     return nombre;
    // }

    // public int getAno(){
    //     return ano;
    //}




    

