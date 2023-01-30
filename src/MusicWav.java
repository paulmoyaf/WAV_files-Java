
import java.io.File;
import java.util.concurrent.TimeUnit;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JOptionPane;

public class MusicWav{

    void playMusic(String musicLocation)
    {
     
        // int i =0;
        // int ascii = 13;
        // String chr = "♪";

        try{
            File musicPath = new File(musicLocation);
            if(musicPath.exists())
            {
                
                AudioInputStream audioInput = AudioSystem.getAudioInputStream(musicPath);
                Clip clip = AudioSystem.getClip();
                clip.open(audioInput);
                //clip.start();
                //clip.loop(Clip.LOOP_CONTINUOUSLY); //SEGUIR TOCANDO
                
                // JOptionPane.showMessageDialog(null, "Presione boton para PAUSAR","Reproductor",1 );
                // long clipTimePosition =  clip.getMicrosecondPosition();
                // clip.stop();

                // JOptionPane.showMessageDialog(null, "Presione boton para REANUDAR","Reproductor",1 );
                // clip.setMicrosecondPosition(clipTimePosition);
                // clip.start();
                                       
                // JOptionPane.showMessageDialog(null, "Presione boton para Detener Reproduccion y Continuar con el programa","Reproductor",1 );
                // clip.stop();
                
                if (clip.isOpen())
                {   
                    clip.start();
                    TimeUnit.SECONDS.sleep(1);
                    while(clip.isActive())
                    {      
                            System.out.print("* ");
                            TimeUnit.SECONDS.sleep(2);                       
                    }
                    clip.stop();
                }                
                
            }
            else
            {
            System.out.println("No existe la cancion");
            }
        }
        catch(Exception ex){
        ex.printStackTrace();
        
        }
    }
  }
