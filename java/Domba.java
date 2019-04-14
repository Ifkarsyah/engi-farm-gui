public class Domba extends FarmAnimal implements Renderable, MeatProducingAnimal {

    public Domba(String _name) {
        super(_name, 15);
    }

    public String makeSound() {
        return name + ": HopHop";
    }

    public FarmProduct getAnimalMeat() {
        DagingDomba D = DagingDomba();
        return D;
    }

    public char render() {
        return 'D';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == '-' || c == '#';
    }
}