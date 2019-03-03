

public class Main {
    public static void main(String[] args) {
    	Animal[] animals = new Animal[2];
    	animals[0] = new Tiger();
    	animals[1] = new Chicken();

    	for (Animal animal : animals)
    	{
    		System.out.println(animal.makeSound());
    		if (animal instanceof Chicken)
    		{
    			Edibler edibler = (Chicken) animal;
    			System.out.println(edibler.howToEat());
    		}
    	}
    	Fruit[] fruits = new Fruit[2];
    	fruits[0] = new Apple();
    	fruits[1] = new Orange();
    	for (Fruit fruit : fruits )
    	{
    		if ( fruit instanceof Apple)
    		{
    			Edibler edibler = (Apple) fruit;
    			System.out.println(edibler.howToEat());
    		}
    	}
    }
}
