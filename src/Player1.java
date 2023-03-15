public class Player1 {

    private String name = "Player 1";
    private int hp = 100;

    int minDamage = 1;
    int maxDamage = 10;
    int random_int = (int)Math.floor(Math.random() * (maxDamage - minDamage + 1) + minDamage);


    public Player1(){

    }

    public Player1(String name){
        this.name = name;
    }

    public void hit(int random_int){
        this.hp = this.hp - random_int;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

}
