package classe.jogador;
import java.security.SecureRandom;
import java.util.Scanner;

public class Jogadorclasse {
    
    public static void main(String[]args){
        
        Jogador j1 = new Jogador(1);
        
        int d1,d2;
       
        int bt;
        
        Scanner scan=new Scanner(System.in);
        

        while( j1.getMorto() != true)

        {
            System.out.println("Causar dano em j1: ");
           
            bt=scan.nextInt();
            
            if(bt==1){

                d1=new SecureRandom().nextInt(25);
                j1.dano(d1);

                if(d1>20){
                    System.out.println("j1 recebeu dano critico de "+d1);
                    System.out.println("HP: "+j1.getHP());
                }
                else
                {
                    System.out.println("j1 recebeu dano de: "+d1);
                    System.out.println("HP: "+j1.getHP());
                }
                
                

            }
            
            System.out.println(j1.getMorto() ? "Jogador Morreu" : "");


        }

        
      


      
        



   }
}