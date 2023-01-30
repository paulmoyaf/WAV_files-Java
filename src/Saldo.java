//package File.loopmusicjava;

import java.util.Scanner;

public class Saldo {

    //Propiedad de la clase
    private int saldo;

    // Para aumentar monedas  
    
    public void setMonedas(int moneda){
       
       Scanner in = new Scanner(System.in);

       try { //Para que los valores sean enteros
        while (moneda <= 0){
            System.out.print("**ERROR** Se debe ingresar monedas de 1 euro\n" + "Ingrese moneda: "); 
            moneda = in.nextInt();          
        }
        saldo = saldo + moneda;       
        
        } catch (Exception e) {
            Inicio.inicio(); 
        }
    }
        
    //Para disminuir monedas
    public void setGastar(int gastar){
        saldo = saldo - gastar;
    }

    //Getter para obtener saldo
    public int getSaldo(){
        return saldo;
    }

}
