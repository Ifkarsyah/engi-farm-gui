package entities.cells.facilities;

public class Truck extends Facility {
    private int cooldown_time;

    // Constructor with parameter
    public Truck(int _x, int _y, int _cooldown_time){
        super(_x,_y);
        cooldown_time = _cooldown_time;
    }
    // Getter
    public int getCooldownTime() { return cooldown_time; }

    // Setter
    public void setCooldownTime(int cooldown_time) {
        this.cooldown_time = cooldown_time;
    }

    public void reduceCooldownTime() {
        if (cooldown_time > 0) cooldown_time--;
    }

    // render
    public char render() { return 'T'; }
}