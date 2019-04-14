public abstract class FarmAnimal {

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

    public boolean isHungry() {
        return this.hungryPoint <= 5;
    }

    public boolean isStarving() {
        return this.hungryPoint <= 0;
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

    public void setIsProductReady(boolean _isProductReady) {
        isProductReady = _isProductReady;
    }

    public void eat(Land _land) {
        if ((!isHungry()) || (!_land.getIsGrassGrown())) {
            // not hungry
        } else {
            hungryPoint = HUNGERTIME;
            _land.setIsGrassGrown(false);
            setIsProductReady(true);
        }
    }

    public void move(int _row, int _kol) {
        Random r = new Random();
        int Low = 0;
        int High = 1;
        int xMinus = r.nextInt(High - Low) + Low; // xMove is negative number if xMinus = 1
        int xMove = r.nextInt(High - Low) + Low; // random between 0 and 1
        int yMinus = r.nextInt(High - Low) + Low; // yMove is negative number if yMinus = 1
        int yMove = r.nextInt(High - Low) + Low; // random between 0 and 1

        if (xMinus == 1) {
            xMove *= -1;
        }
        if (yMinus == 1) {
            yMove *= -1;
        }
        // p.setX(p.getX() + xMove);
        // p.setY(p.getY() + yMove);
    }

    public void setPosition(Point p) {
        p.setX(p.getX());
        p.setY(p.getY());
    }

    public Point getPosition() {
        return p;
    }

    // Abstract method
    public abstract boolean isHabitat(Land L);

    public abstract String makeSound();

    // public abstract FarmProduct getProduct();

    // public abstract FarmProduct getAnimalMeat();

}