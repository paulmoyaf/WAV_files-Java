//package File.loopmusicjava;


import javax.swing.JOptionPane;

public class Loop {

    public static void loop(){
        
        
        int op2 = JOptionPane.showOptionDialog(null, "Desea Ingresar Monedas o Salir del programa?", "Saldo No Disponible", 0, 1, null, new Object[] { "INGRESAR MONEDAS", "SALIR"}, null);

        if (op2 == 0)
        {
            Inicio.inicio(); 
        }
        if (op2 == 1)
        {
            System.out.println("\nESKERRIK ASKO\n");
            System.out.println("****AGUR*****");
            System.exit(op2);
             
        }

    }
}
