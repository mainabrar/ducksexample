package abr.tas.ducksexample;



import abr.tas.ducksexample.Mover;



public class Car implements Mover {
    public void move() {
        System.out.println("I am a car, I'm moving very fast on the road");
    }
    public void drive() {
        System.out.println("I am a car, I'm currently driving");
    }
}