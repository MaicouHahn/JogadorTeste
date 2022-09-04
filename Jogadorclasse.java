package classe.jogador;
import java.security.SecureRandom;
import java.util.Scanner;

public class Jogadorclasse {
    
    public static void main(String[]args){
        
        Jogador j1 = new Jogador(1);
        Jogador j2 = new Jogador(2);
        float d1,d2;

    
        j1.info();
        j2.info();

        d1=j1.causarDano();
        
        System.out.printf("O jogador 1 emboscou o jogador 2 causando %.2f de dano\n",d1);
        
        j2.receberDano(d1);

        if(j2.getMorto()==true){

            System.out.println("O Dano matou o jogador 2");
        }
        else
        {
            System.out.printf("O jogador 2 recebeu %.2f de dano e agora esta com %.2f de HP\n",d1,j2.getHP());

        }

   }
}