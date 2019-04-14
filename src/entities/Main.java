import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true){
            showUI();
            String cmd;

            Scanner sc = new Scanner(System.in);
            cmd = sc.nextLine();

            int i = player.getPoint().getX();
            int j = player.getPoint().getY();

            int dx, dy;

            if (cmd.equalsIgnoreCase("TALK")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("INTERACT")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("KILL")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("GROW")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("MIX")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("A")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("S")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("D")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("W")) {
                System.out.print("aaaa");
            } else if (cmd.equalsIgnoreCase("EXIT")) {
                System.out.print("aaaa");
            } else {
                System.out.println( "Your command is not available");
            }
//            randomAnimalMove();
//            animalBecomeHungrier();
//            checkHungry();
//            checkIsStarving();
//            truck.reduceCooldownTime();
        }
    }

    static Land lands;
    static FarmAnimal farmAnimals;
    static Player player = new Player(new Point(1, 1), 100);


    static Truck truck = new Truck(10, 10, 30);
    static Mixer mixer = new Mixer(1, 10);
    static Well well = new Well(3, 10);

    static final int updown[] = {-1, 0, 1, 0};
    static final int leftright[] = {0, 1, 0, -1};
    static final int sizeRow = 10;
    static final int sizeCol = 11;


    static private void randomAnimalMove(){}
    static private void animalBecomeHungrier(){}
    static private void checkHungry(){}
    static private void checkIsStarving(){}
    static private void showUI(){
        System.out.println("--------------------------------------------------");
        showMap();
        System.out.println("Money: " + player.getMoney());
        System.out.println("Water: " + player.getWater());
        System.out.print("Command: ");
    }
    static private void showMap(){
        for (int i=0; i<sizeRow; i++){
            for (int j=0; j<sizeCol; j++){
                if (i == player.getPoint().getX() && j == player.getPoint().getY()){
                        System.out.print('p');
                } else {
                    System.out.print('#');
                }
            }
            System.out.println();
        }
    }
}
