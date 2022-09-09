package classe.jogador;
import java.security.SecureRandom;
import java.util.Scanner;

public class Jogadorclasse {
    
    public static void main(String[]args){
        
        Jogador j1 = new Jogador(1);
        Jogador j2 = new Jogador(2);
        float d1,d2,c1,HP;

        j1.info();

        j2.info();

        d1=j1.causarDano();
        
        System.out.printf("O jogador 1 emboscou o jogador 2 causando %.2f de dano\n",d1);
        
        j2.receberDano(d1);
        
        if(j2.getMorto()==true){

            System.out.printf("O Dano de %.2f matou o jogador 2",d1);
        }
        else
        {
            System.out.printf("O jogador 2 recebeu %.2f de dano e agora esta com %.2f de HP\n",d1,j2.getHP());
            
            c1=j2.Curar();
            
            System.out.printf("O jogador 2 conseguiu correr e se esconder. Fez um curativo que recuperou %.2f de seu HP\nHP Total agora é de %.2f",c1,c1+j2.getHP());

            System.out.printf("\nO jogador 1 ataca novamente\n");

            d1=j2.Esquiva(d1);
            
            if(j2.getChEsq()<=5){
                System.out.printf("O jogador 2 falhou catastroficamente em esquivar e recebeu dano dobrado");
            }
            if(j2.getHP()-d1 <= 0){
                
                System.out.printf("\nJogador 2 morreu com essa nova emboscada que causou %.2f de dano",d1);
            }
            else
            {
                if(d1!=0){
                    System.out.printf("\nO jogador 2 recebeu %.2f de dano e esta com %.2f de HP",d1,(c1+j2.getHP()-d1));
                }
                else{
                    System.out.printf("\nO jogador 2 conseguiu se esquivar e esta com %.2f de HP",c1+j2.getHP());
                }
            }
              
        } 

}

}