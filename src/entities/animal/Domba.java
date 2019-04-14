package entities.animal;

import entities.Renderable;
import entities.cells.lands.Land;
import entities.products.farms.DagingDomba;
import entities.products.farms.FarmProduct;

public class Domba extends FarmAnimal implements Renderable, MeatProducingAnimal {

    public Domba(String _name) {
        super(_name, 15);
    }

    public String makeSound() {
        return name + ": HopHop";
    }

    public FarmProduct getAnimalMeat() {
        DagingDomba D = new DagingDomba();
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