package oops.interfaces;

public class Car implements Engine, Brake, Media{

    @Override
    public void brake() {
        System.out.println("I brake like a Normal car");
    }

    @Override
    public void start() {
        System.out.println("I start engine like a Normal car");
    }

    @Override
    public void stop() {
        System.out.println("I stop engine like a Normal car");
    }

    @Override
    public void accelerate() {
        System.out.println("I accelerate like a Normal car");
    }
}
