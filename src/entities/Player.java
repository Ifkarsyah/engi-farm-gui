package entities;

import entities.Point;
import entities.Truck;
import entities.Well;
import entities.Product;


import java.util.LinkedList;

public class Player {
    private Point point;
    private LinkedList<Product> inventory;
    private int water;
    private int money;

    public Player(Point point, int water) {
        this.point = point;
        this.inventory = new LinkedList<Product>();
        this.water = water;
    }


    public LinkedList<Product> getInventory() { return inventory; }
    public int getWater() { return water; }
    public void setWater(int water) { this.water = water; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }

    public void interact(Well well){
        this.water += well.getWater();
        if (water > 100) { water = 100; }
    }

    public void interact(Truck truck){
        while (inventory.size() > 0) {
            Product prod = inventory.pop();
            money += prod.getPrice();
        }
        truck.setCooldownTime(30);
    }

    public void interact(){}

    public void kill(){}

    public void talk(){}

    public void grow(){}

    public void moveUp(){}
}
