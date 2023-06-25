abstract class Animal {
    public void sleep() {
        System.out.println("Zzz...");
    }

    public abstract void makeNoise();

    public abstract void roam();
}

abstract class Feline extends Animal {
    @Override
    public void roam() {
        System.out.println("Feline is roaming.");
    }
}

abstract class Canine extends Animal {
    @Override
    public void roam() {
        System.out.println("Canine is roaming.");
    }
}

class Lion extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Lion: Roar!");
    }
}

class Cat extends Feline {
    @Override
    public void makeNoise() {
        System.out.println("Cat: Meow!");
    }
}

class Wolf extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Wolf: Howl!");
    }
}

class Dog extends Canine {
    @Override
    public void makeNoise() {
        System.out.println("Dog: Woof!");
    }
}