
public abstract class FarmAnimal extends Render {

    protected String name;
    protected int hungryPoint;
    protected boolean isProductReady;
    protected Point p;
    protected final int HUNGERTIME;

    static int numOfFarmAnimal;

    static {
        numOfFarmAnimal = 0;
    }

    public static void deleteFarmAnimal() {
        numOfFarmAnimal--;
    }

    public static void addFarmAnimal(int _init) {
        numOfFarmAnimal = _init;
    }

    public static int getFarmAnimalNumber() {
        return numOfFarmAnimal;
    }

    public FarmAnimal() {
        HUNGERTIME = 20;
        hungryPoint = HUNGERTIME;
    }

    public FarmAnimal(String _name, int _hungerTime) {
        name = _name;
        HUNGERTIME = _hungerTime;
        hungryPoint = HUNGERTIME;
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return this.name;
    }

    public void becomeHungrier() {
        hungryPoint--;
    }

    public int getHungryPoint() {
        return hungryPoint;
    }

    public void setHungryPoint(int _hungryPoint) {
        hungryPoint = _hungryPoint;
    }

    public boolean getIsProductReady() {
        return isProductReady;
    }

    public boolean setIsProductReady(boolean _isProductReady) {
        isProductReady = _isProductReady;
    }

    public void eat(Land _land) {
        if ((!isHungry()) || (!l.getIsGrassGrown())) {
            // not hungry
        } else {
            hungryPoint = hungerTime;
            l.setIsGrassGrown(false);
            setProductReady(true);
        }
    }

    public void move(int _row, int _kol) {
        int xMinus = rand() % 2; // xMove is negative number if xMinus = 1
        int xMove = rand() % 2; // random between 0 and 1
        int yMinus = rand() % 2; // yMove is negative number if yMinus = 1
        int yMove = rand() % 2; // random between 0 and 1

        if (xMinus == 1) {
            xMove *= -1;
        }
        if (yMinus == 1) {
            yMove *= -1;
        }
        position.setX(position.getX() + xMove);
        position.setY(position.getY() + yMove);
    }

    public void setPosition(Point p) {
        position.setX(p.getX());
        position.setY(p.getY());
    }

    public Point getPosition() {
        return p;
    }

    // Abstract method
    public abstract boolean isHabitat(Land L);

    public abstract String makeSound();

    public abstract FarmProduct getProduct();

    public abstract FarmProduct getAnimalMeat();

}