package parcial10.pkg10.pkg19;

import javax.swing.JOptionPane;

public class Parcial101019 {

    public static void main(String[] args) {
         int opcion=0;
       
        do{
          try{  
            
   opcion = Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor de la operacion que quiere realizar"
                    + "\n 1. ¿Que es Commit?"
                    + "\n 2. ¿Que es un Push?"
                    + "\n 3. ¿Que es un Pull?"
                    + "\n 4. ¿Que es una clase?"
                    + "\n 5. ¿Que es un objeto?"
                    + "\n 6. Nombre estudiante"
                    + "\n 7. fecha" 
                    + "\n 8. Salir"));
       
          }catch(Exception ex){
              JOptionPane.showMessageDialog(null,"Debe ingresar solo valores numericos");
          }
            switch(opcion){
               
                case 1:
                   
                    break;
                case 2:
                    
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                   
                default:
                 
                    break;
                   }
                   }while (opcion !=8);
    }
}

    

