
public class Sapi extends FarmAnimal implements Renderable, MilkProducingAnimal, MeatProducingAnimal {

    public Sapi(String _name) {
        super(_name, 25);
    }

    public String makeSound() {
        return name + ": Moooo!!!";
    }

    public FarmProduct getAnimalMeat() {
        DagingSapi D = DagingSapi();
        return D;
    }

    public FarmProduct getProduct() {
        SusuSapi T = SusuSapi();
        setProductReady(false);
        return T;
    }

    public char render() {
        return 'S';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == '@' || c == 'x' || c == '-' || c == '#';
    }
}