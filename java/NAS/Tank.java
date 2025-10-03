package NAS;

public interface Tank extends Vehicle {
    int fire();
    void setHP(int hp);
    int getHP();
    void setStan(int stan);
    int getStan();
    void setDamage(int damage);
    int getDamage();
    int getDamageRandom();
}
