package people;

import javax.swing.*;

public class Visitor extends Spring {

    private int age;
    private double height;
    private double money;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    @Override
    public int getMinimumValue() {
        return 0;
    }

    @Override
    public int getPreferredValue() {
        return 0;
    }

    @Override
    public int getMaximumValue() {
        return 0;
    }

    @Override
    public int getValue() {
        return 0;
    }

    @Override
    public void setValue(int value) {

    }
}
