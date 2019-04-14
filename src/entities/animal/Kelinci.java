public class Kelinci extends FarmAnimal implements Renderable, MeatProducingAnimal {

    public Kelinci(String _name) {
        super(_name, 15);
    }

    public String makeSound() {
        return name + ": HopHop";
    }

    public FarmProduct getAnimalMeat() {
        DagingKelinci D = DagingKelinci();
        return D;
    }

    public char render() {
        return 'K';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == '-' || c == '#';
    }
}