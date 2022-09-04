package classe.jogador;
import java.security.SecureRandom;
import java.util.Scanner;

public class Jogadorclasse {
    
    public static void main(String[]args){
        
        Jogador j1 = new Jogador(1);
        
        float d1,d2;
        
        j1.setFor(14);
        j1.setDex(10);
        d1=j1.causarDano();
        System.out.printf("Jogador 1 For: %.2f\nDex: %.2f\nDano: %.2f \n\n",j1.getFor(),j1.getDex(),d1);

        j1.setFor(15);
        j1.setDex(10);
        d2=j1.causarDano();
        System.out.printf("Após incremento\nJogador 1 For: %.2f\nDex: %.2f\nDano: %.2f ",j1.getFor(),j1.getDex(),d2);

        /* 
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
        */
   }
}