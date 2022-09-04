package classe.jogador;

import java.security.SecureRandom;

public class Jogador {

    private float HP,For,Int,Dex,jog,Rdano,Cdano;
    private float AumD,RedD;
    private boolean morto=false;

    public Jogador(int n){
        
        jog=n;

        HP=new SecureRandom().nextFloat(100);
        For=new SecureRandom().nextFloat(20);
        Int=new SecureRandom().nextFloat(20);
        Dex=new SecureRandom().nextFloat(20);
        
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
    public float getHP(){
        return this.HP;
    }
    public float getFor(){
        return this.For;
    }
    public float getInt(){
        return this.Int;
    }
    public float getDex(){
        return this.Dex;
    }
    public float causarDano(){
        
        if(For >=15){
            this.AumD=1.2f;

            this.Cdano = ((this.For+this.Dex)/2)*AumD;
        }
        else if(this.For < 15 && this.For >= 10 ){

            this.AumD=1.1f;

            this.Cdano = ((this.For+this.Dex)/2)*AumD;
        }
        else{
              this.Cdano = ((this.For+this.Dex)/2)*AumD;  
        }

        return this.Cdano;
    }
    public void receberDano(int Rdano)
    {
        this.Rdano=Rdano;
        
        this.HP = this.HP - Rdano;

        if(this.HP <= 0){
            
            this.HP=0;
            this.morto=true;
        }
        
       }
    public boolean getMorto(){
        return this.morto;
     }  
    public float setFor(float For){
        return this.For=For;
    }
    public float setDex(float Dex){
        return this.Dex=Dex;
    }

    }

