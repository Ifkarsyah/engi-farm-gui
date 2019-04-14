public class Bebek extends FarmAnimal implements Renderable, EggProducingAnimal, MeatProducingAnimal {

    public Bebek(String _name) {
        super(_name, 10);
    }

    public String makeSound() {
        return name + ": Wikuwiiiik";
    }

    public FarmProduct getAnimalMeat() {
        DagingBebek D = DagingBebek();
        return D;
    }

    public FarmProduct getProduct() {
        TelurBebek T = TelurBebek();
        setProductReady(false);
        return T;
    }

    public char render() {
        return 'B';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == 'o' || c == '*' || c == '-' || c == '#';
    }
}