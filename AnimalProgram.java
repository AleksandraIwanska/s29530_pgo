public class AnimalProgram {
    public static void main(String[] args) {
        Lion lion = new Lion();
        Cat cat = new Cat();
        Wolf wolf = new Wolf();
        Dog dog = new Dog();

        lion.sleep();
        lion.makeNoise();
        lion.roam();

        cat.sleep();
        cat.makeNoise();
        cat.roam();

        wolf.sleep();
        wolf.makeNoise();
        wolf.roam();

        dog.sleep();
        dog.makeNoise();
        dog.roam();
    }
}
