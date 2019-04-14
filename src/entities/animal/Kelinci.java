package entities.animal;

import entities.Renderable;
import entities.cells.lands.Land;
import entities.products.farms.DagingKelinci;
import entities.products.farms.FarmProduct;

public class Kelinci extends FarmAnimal implements Renderable, MeatProducingAnimal {

    public Kelinci(String _name) {
        super(_name, 15);
    }

    public String makeSound() {
        return name + ": HopHop";
    }

    public FarmProduct getAnimalMeat() {
        DagingKelinci D = new DagingKelinci();
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