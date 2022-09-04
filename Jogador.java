package classe.jogador;

import java.security.SecureRandom;

public class Jogador {

    private int HP,For,Int,Dex,jog,dano;
    float causarDano;
    private boolean morto=false;

    public Jogador(int n){
        
        jog=n;

        HP=new SecureRandom().nextInt(100);
        For=new SecureRandom().nextInt(20);
        Int=new SecureRandom().nextInt(20);
        Dex=new SecureRandom().nextInt(20);
        
        //System.out.printf("\nJogador %d criado\nHP: %d\nForça: %d\nInt: %d\nDestreza: %d\n",n,(HP+1),For,Int,Dex);

        }

    public void info(){
        System.out.println("\nJogador "+jog);
        System.out.println(this.morto ? "Jogador morto":"");
        System.out.println("Vida..............: "+HP);
        System.out.println("Força.............: "+For);
        System.out.println("Inteligencia......: "+Int);
        System.out.println("Destreza..........: "+Dex);

    }
    public int getHP(){
        return this.HP;
    }
    public int getFor(){
        return this.For;
    }
    public int getInt(){
        return this.Int;
    }
    public int getDex(){
        return this.Dex;
    }

    public void dano(int dano)
    {
        this.dano=dano;
        
        this.HP = this.HP - dano;

        if(this.HP <= 0){
            
            this.HP=0;
            this.morto=true;
        }
        
       }

     public boolean getMorto(){
        return this.morto;
     }  
}

