public class Player2 {

    private String name = "Player 2";
    private int hp = 100;

    public Player2(){

    }

    public Player2(String name){
        this.name = name;
    }

    public void hit(int damage1){
        this.hp = this.hp - damage1;
    }

    public int getHp(){
        return this.hp;
    }

    public void setHp(int hp){
        this.hp = hp;
    }

}
