package NAS;

public class Arta implements  Tank {
    private String name;
    private int hp;
    private int stan;
    public Arta(String name,int hp,int stan ) {
        this.name = name; 
        this.hp = hp;
        this.stan = stan;
    }
    @Override
    public void setName(String name){
        this.name = name;
    }
        
    @Override
    public int getStan() {
        return  this.stan;
    }
    @Override
    public void setStan(int stan){
        this.stan = stan;
    }

    @Override
    public int getHP() {
        return  this.hp;
    }
    @Override
    public void setHP(int hp){
        this.hp = hp;
    }
    
    @Override
    public String getName() {
        return  this.name;
    }
    

    @Override
    public void info() {
        System.out.println("Названия: " + getName() + "\n" +"HP: " + getHP() + "\n" + "Стан: " + getStan());
    }

    


}
