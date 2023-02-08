import java.util.Scanner;

public class CrearMenu {

    public static void crearmenu(){
    
    int opc;
    Scanner in = new Scanner(System.in);
    MusicWav musicObject = new MusicWav(); // Para WAV
    //musicMP3 musicObject = new musicMP3(); // PARA MP3
    //String filepath1 = "audio/audioShort.mp3";
    String filepath1 = "audio/1audio.wav";
    String filepath2 = "audio/2audio.wav";
    String filepath3 = "audio/3audio.wav";
    String filepath4 = "audio/4audio.wav";
    String filepath5 = "audio/5audio.wav";
    String filepath6 = "audio/6audio.wav";

    Canciones cancion1 = new Canciones(1, "Border Song","Elton John", 1970);
    Canciones cancion2 = new Canciones(2, "A Case Of You","John Mitchell", 1970);
    Canciones cancion3 = new Canciones(3, "Knockin' On Heaven's Door","Bob Dylan", 1970);
    Canciones cancion4 = new Canciones(4, "You Can Close Your Eyes","James Taylor", 1970);
    Canciones cancion5 = new Canciones(5, "Way Over Yonder","Carole King", 1970);
    Canciones cancion6 = new Canciones(6, "Lean On Me","Al Green", 1972);  
    
    cancion1.leerCancion();
    cancion2.leerCancion();
    cancion3.leerCancion();
    cancion4.leerCancion();
    cancion5.leerCancion();
    cancion6.leerCancion();

    System.out.print("\nIngrese opcion para reproducir: ");
    opc = in.nextInt();

    //while(true)
    //lista
    // case

        while (opc<=0||opc>6){
            System.out.print("\nIngrese una opcion correcta: ");
            opc = in.nextInt();
        }

        switch (opc) {
            case 1:
            cancion1.verReproduccion();
            musicObject.playMusic(filepath1);
            break;

            case 2:
            cancion2.verReproduccion();
            musicObject.playMusic(filepath2);
            break;

            case 3:
            cancion3.verReproduccion();
            musicObject.playMusic(filepath3);
            break;

            case 4:
            cancion4.verReproduccion();
            musicObject.playMusic(filepath4);
            break;

            case 5:
            cancion5.verReproduccion();
            musicObject.playMusic(filepath5);
            break;

            case 6:
            cancion6.verReproduccion();
            musicObject.playMusic(filepath6);
            break;

            default:        
        } 

    //System.out.printf("%d.) %s - %s (%d)\n",audio1.getLista(), audio1.getCancion(), audio1.getNombre(),audio1.getAno());
    // System.out.printf("%d.) %s - %s (%d)\n",audio2.getLista(), audio2.getCancion(), audio2.getNombre(),audio1.getAno());
    // System.out.printf("%d.) %s - %s (%d)\n",audio3.getLista(), audio3.getCancion(), audio3.getNombre(),audio1.getAno());
    // System.out.printf("%d.) %s - %s (%d)\n",audio4.getLista(), audio4.getCancion(), audio4.getNombre(),audio1.getAno());
    // System.out.printf("%d.) %s - %s (%d)\n",audio5.getLista(), audio5.getCancion(), audio5.getNombre(),audio1.getAno());
    // System.out.printf("%d.) %s - %s (%d)\n",audio6.getLista(), audio6.getCancion(), audio6.getNombre(),audio1.getAno());    

    }
}

