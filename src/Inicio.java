import java.util.Scanner;

public class Inicio 
{
    public static void inicio(){

        Scanner in = new Scanner(System.in);    
        Saldo saldo = new Saldo();
        
        int coin;
        int errorDoble = -1; //ocasiono un error
        int gasto = 1;//cobro por cancion
        
        Limpiar.limpiar();

        System.out.println("****REPRODUCTOR DE MUSICA*****");
        System.out.println("Valor de cada cancion: 1 euro");

        try { //Para que los valores sean enteros
        while (saldo.getSaldo()<=0)
        {
            System.out.print("\nIngrese monedas de 1 Euro para reproducir una cancion: ");
            coin = in.nextInt();
            saldo.setMonedas(coin);
        }
        } catch (Exception e) {
            saldo.setMonedas(errorDoble);
        }
        
        while (saldo.getSaldo()>0)
        {
            saldo.setGastar(gasto);
            Limpiar.limpiar();
            System.out.printf("Saldo actual: %d Euro\n\n",saldo.getSaldo());
            CrearMenu.crearmenu();;
            //Opciones.opciones();
            Limpiar.limpiar();

            if (saldo.getSaldo()==0){
                System.out.print("No dispone de Saldo.\n");
                Loop.loop();
                      
            }
        }    
    }

}   


   



       
