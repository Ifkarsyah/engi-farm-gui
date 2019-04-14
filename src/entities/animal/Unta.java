package entities.animal;

public class Unta extends FarmAnimal implements Renderable, MilkProducingAnimal, MeatProducingAnimal {

    public Unta(String _name) {
        super(_name, 25);
    }

    public String makeSound() {
        return name + ": Alhamdulillah!!!";
    }

    public FarmProduct getAnimalMeat() {
        DagingUnta D = new DagingUnta();
        return D;
    }

    public FarmProduct getProduct() {
        SusuUnta T = new SusuUnta();
        setIsProductReady(false);
        return T;
    }

    public char render() {
        return 'U';
    }

    public boolean isHabitat(Land L) {
        char c = L.render();
        return c == '@' || c == 'x' || c == '-' || c == '#';
    }
}