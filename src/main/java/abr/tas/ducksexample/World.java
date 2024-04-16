package abr.tas.ducksexample;



import java.util.ArrayList;
import java.util.List;



public class World {
    public static void main(String[] args) {
        Car car = new Car();
        Human human = new Human();
        List<Mover> listOfMovers = new ArrayList<>();
        listOfMovers.add(car);
        listOfMovers.add(human);
        for (Mover mover: listOfMovers) {
            System.out.println("After this message, the " + mover.getClass().getSimpleName() + " is going to move.");
            mover.move();
        }

    }
}