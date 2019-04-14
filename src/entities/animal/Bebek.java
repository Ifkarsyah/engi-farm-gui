package entities.animal;

import entities.Renderable;
import entities.cells.lands.Land;
import entities.products.farms.DagingBebek;
import entities.products.farms.FarmProduct;
import entities.products.farms.TelurBebek;

public class Bebek extends FarmAnimal implements Renderable, EggProducingAnimal, MeatProducingAnimal {

    public Bebek(String _name) {
        super(_name, 10);
    }

    public String makeSound() {
        return name + ": Wikuwiiiik";
    }

    public FarmProduct getAnimalMeat() {
        DagingBebek D = new DagingBebek();
        return D;
    }

    public FarmProduct getProduct() {
        TelurBebek T = new TelurBebek();
        setIsProductReady(false);
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