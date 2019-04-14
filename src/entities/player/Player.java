package entities.player;

import entities.cells.facilities.Truck;
import entities.cells.facilities.Well;
import entities.products.Products;

import java.awt.*;
import java.util.LinkedList;

public class Player {
    private Point point;
    private LinkedList<Products> inventory;
    private int water;
    private int money;

    public Player(Point point, int water) {
        this.point = point;
        this.inventory = new LinkedList<Products>();
        this.water = water;
    }


    public LinkedList<Products> getInventory() { return inventory; }
    public int getWater() { return water; }
    public void setWater(int water) { this.water = water; }
    public int getMoney() { return money; }
    public void setMoney(int money) { this.money = money; }

    public void interact(Well well){
        this.water += well.getWater();
        if (water > 100) { water = 100; }
    }

    public void interact(Truck truck){
        while ()
    }
}
