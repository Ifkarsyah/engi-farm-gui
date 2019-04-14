public class Player implements Renderable {
    private Point point;
    private LinkedList<Product> inventory;
    private int water;
    private int money;

    public Player(Point point, int water) {
        this.point = point;
        this.inventory = new LinkedList<Product>();
        this.water = water;
    }

    public LinkedList<Product> getInventory() {
        return inventory;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void interact(Well well) {
        this.water += well.getWater();
        if (water > 100) {
            water = 100;
        }
    }

    public void interact(Truck truck) {
        while (inventory.size() > 0) {
            Product prod = inventory.pop();
            money += prod.getPrice();
        }
        truck.setCooldownTime(30);
    }

    public void interact(FarmAnimal farmAnimal) {
        try {
            FarmProduct fp = farmAnimal.getProduct();
            inventory.add(fp);
        } catch (String e) {

            System.out.println("Cannot interact with this animal");
        }
    }

    public void kill(FarmAnimal farmAnimal) {
        try {
            FarmProduct fp = farmAnimal.getAnimalMeat();
            inventory.add(fp);
        } catch (String e) {
            System.out.println("Cannot kill this animal");
        }
    }

    public void talk(FarmAnimal farmAnimal) {
        System.out.println(farmAnimal.makeSound());
    }

    public void grow(Land land) {
        if (water_store > 0) {
            water_store--;
            land.setIsGrassGrown(true);
            System.out.println("Growing land..");

        } else {
            System.out.println("Not enough water!");
        }
    }

    public void move(int dx, int dy) {
        this.p.setX(this.p.getX() + dx);
        this.p.setY(this.p.getY() + dy);
    }

    public char render() {
        return 'P';
    }
}
