public class Champion{

    private String name;
    private int life;
    private int attack;
    private int armor;

    public Champion(String name, int life, int attack, int armor){
        this.name = name;
        this.life = life;
        this.attack = attack;
        this.armor = armor;
    }

    public int getLife(){
        return this.life;
    }

    public void takeDamage(Champion other){
        //validando dano
        if(other.attack > this.armor){
            this.life -= other.attack - armor;    
        }else{
            this.life -= 1;
        }
        //validando que a vida não seja negativa
        if(this.life <= 0){
            this.life = 0;
        }

    }

    public String status(){
        if(this.life <= 0){
            return this.name + ": " + this.life + " de vida (morreu)";
        }else{
            return this.name + ": " + this.life + " de vida";
        }
    }

}