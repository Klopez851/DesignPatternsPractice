package kl.practice.Creational.Prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public interface Enemy {
    Enemy clone();

    void setName(String name);
    void setWeapon(String weapon);
    void setArmor(String armor);

    void setHealth(int health);
    void setAttack(int attack);
    void setDefense(int defense);

    void setSpeed(double speed);


    String getName();
    String getWeapon();
    String getArmor();

    int getHealth();
    int getAttack();
    int getDefense();

    double getSpeed();

    List<String> getAbilities();
}
