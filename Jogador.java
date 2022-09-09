package classe.jogador;

import java.security.SecureRandom;

public class Jogador {

    private float HP,For,Int,Dex,jog,Rdano,Cdano,Cura;
    private float AumD,RedD,AumC;
    private int ChEsq=0;
    
    private boolean morto=false;

    public Jogador(int n){
        
        jog=n;
        //gera um jogador aleatorio com atributos basicos
        HP=new SecureRandom().nextFloat(1,100);
        For=new SecureRandom().nextFloat(1,20);
        Int=new SecureRandom().nextFloat(1,20);
        Dex=new SecureRandom().nextFloat(1,20);
        //System.out.printf("\nJogador %d criado\nHP: %d\nForça: %d\nInt: %d\nDestreza: %d\n",n,(HP+1),For,Int,Dex);

        }
    public void info(){
        System.out.println("\nJogador "+jog);
        System.out.printf("%s",this.morto ? "Jogador morto":"");
        System.out.printf("\nVida..............: %.2f\n",this.morto ? HP=0 : HP);//caso o jogador esteja morto e só quizer conferir o estado 
        System.out.printf("Força.............: %.2f\n",For);
        System.out.printf("Inteligencia......: %.2f\n",Int);
        System.out.printf("Destreza..........: %.2f\n",Dex);


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
    public boolean getMorto(){//retorna o estado do jogador
        return this.morto;
     }  
    public boolean setMorto(boolean morto){   //criei para testar a condiçao de cura caso true ou false
        this.morto=morto;
        return this.morto;
    }
    public float setFor(float For){
        return this.For = For;
    }
    public float setDex(float Dex){
        return this.Dex = Dex;
    }
    public float setInt(float Int){
        return this.Int = Int;
    }
    public float setHP(float HP){
        return this.HP = HP;
    }
    public float causarDano(){ //calcula o dano baseado na força inicial do personagem
        
        if(For >=15){
            this.AumD=1.2f;//Aumenta dano em 20%

            this.Cdano = ((this.For+this.Dex)/2)*AumD;
        }
        else if(this.For < 15 && this.For >= 10 ){

            this.AumD=1.1f;//Aumenta dano em 10%

            this.Cdano = ((this.For+this.Dex)/2)*AumD;
        }
        else{
              this.Cdano = ((this.For+this.Dex)/2);  
        }

        return this.Cdano;
    }
    public void receberDano(float Rdano)//Calcula a reduçao de dano baseado na força
    {
        this.Rdano=Rdano;

        if(this.For >= 15){

            this.RedD = 0.7f;//Reduz o dano em 30%

            this.Rdano=this.Rdano*this.RedD;
        }
        else if(this.For >=10 && this.For < 15){
            this.RedD=0.9f;//reduuz o danoo em 10%

               this.Rdano=this.Rdano*this.RedD;
        }
             
        this.HP = this.HP - this.Rdano; //pega o dano testado e diminui no hp total

        if(this.HP <= 0){
            
            this.HP=0;
            this.morto=true; //se o jogador morrer ele retorna true e zera o hp
        }
    }
    public float Curar(){ //cura basica para usar o atributo inteligencia, segue mesma logica do causar dano

        if(this.morto==true){
            this.Cura=0;           
        }
        else if(this.Int >= 15){
            this.AumC=1.3f;
            this.Cura=(this.Int*AumC);
        }
        else if(this.Int >= 10 && this.Int < 15){
            this.AumC=1.1f;
            this.Cura=(this.Int*AumC);          
        }
        else if(this.Int < 10){
            this.Cura=(this.Int*1);           
        }
        return this.Cura;
     } 
    public float Esquiva(float dmg){

        if(this.Dex >= 15){
            

            ChEsq = new SecureRandom().nextInt(20);;

            if(ChEsq==20){           
                dmg=0;
            }

            if(ChEsq <= 5){

                dmg=(dmg*2);
            }

        }

        return dmg;
    }
    public int getChEsq(){
        return this.ChEsq;
    }

}

