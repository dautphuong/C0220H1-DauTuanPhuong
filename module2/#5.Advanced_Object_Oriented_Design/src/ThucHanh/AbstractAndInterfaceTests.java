package ThucHanh;
//Animal
abstract class Animal {
    public abstract String makeSound();
}
//Tiger
class Tiger extends Animal {
    @Override
    public String makeSound() {
        return "Tiger: roarrrrr!";
    }
}
//Edible
interface Edible {
    String howToEat();
}
//Chicken
class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
//Fruits
abstract class Fruits implements Edible {
}
//Apple
class Apple extends Fruits {
    @Override
    public String howToEat() {
        return "Apple could be slided";
    }
}
//Orange
class Orange extends Fruits {
    @Override
    public String howToEat() {
        return "Orange could be juiced";
    }
}


//class main
public class AbstractAndInterfaceTests {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

                if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        //-----------------
        Fruits[] fruits=new Fruits[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruits fruit : fruits) {
            System.out.println(fruit.howToEat());
        }

    }
}

