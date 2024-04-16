package abr.tas.ducksexample;



import abr.tas.ducksexample.Mover;



public class Human implements Mover {
    public void move() {
        System.out.println("I am a human, I'm moving very fast on the field");
    }
    public void drink() {
        System.out.println("I am a human, I'm drinking water");
    }
}