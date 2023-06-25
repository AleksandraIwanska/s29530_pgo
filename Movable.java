interface Moveable {
    void start();
    void stop();
}

abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract String getType();

    public String getName() {
        return name;
    }
}

class Cat extends Animal implements Moveable {
    public Cat(String name) {
        super(name);
    }

    public void start() {
        System.out.println("Cat starts!");
    }

    public void stop() {
        System.out.println("Cat stopped!");
    }

    public String getType() {
        return "Cat";
    }
}