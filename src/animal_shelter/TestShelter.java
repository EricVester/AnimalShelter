package animal_shelter;

public class TestShelter {
    public static void main(String[] args) {

        Shelter s = new Shelter();

        //add animals to the system
        s.addAnimal("Tiger", "cat");
        s.addAnimal("Max", "dog");
        s.addAnimal("Coco", "dog");
        s.addAnimal("Lucy", "cat");

        //request for a dog; must return the oldest dog
        System.out.println(s.getAnimal("dog"));

        //request for any animal;
        //must return the oldest animal (could be either a cat or a dog)
        System.out.println(s.getAnimal());

        //request for a cat; must return the oldest cat.
        System.out.println(s.getAnimal("cat"));
    }
}
