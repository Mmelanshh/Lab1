package NAS;

public class TT implements   Tank {
    private String name;
    private int hp;
    private int damage;
    public TT(String name,int hp,int damage) {
        this.name = name; 
        this.hp = hp;
        this.damage = damage;
    }
    @Override
    public void setName(String name){
        this.name = name;
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
    public void setDamage(int damage){
        this.damage = damage;
    }
    
    @Override
    public int getDamage() {
        return  this.damage;
    }
    @Override
    public int getDamageRandom() {
        return  this.damage+(int)(Math.random()*52-26);
    }  
    
    @Override
    public int fire() {
        return  this.damage+(int)(Math.random()*52-26);
    }  
 
    @Override
    public void info() {
        System.out.println("Названия: " + getName() + "\n" +"HP: " + getHP() + "\n" +"Damge: " + getDamage() + "\n" + "RandomDamage: " + getDamageRandom());
    }
    
}
