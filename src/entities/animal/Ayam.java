
public class Ayam extends FarmAnimal implements Renderable, EggProducingAnimal, MeatProducingAnimal {

    public Ayam(String _name) {
        super(_name, 10);
    }

    public String makeSound() {
        return name + ": Petok petok!!!";
    }

    public FarmProduct getAnimalMeat() {
        DagingAyam D = new DagingAyam();
        return D;
    }

    public FarmProduct getProduct() {
        TelurAyam T = new TelurAyam();
        setIsProductReady(false);
        return T;
    }

    public char render() {
        return 'A';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == 'o' || c == '*' || c == '-' || c == '#';
    }
}