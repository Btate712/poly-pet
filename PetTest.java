public class PetTest {
  public static void main(String[] args) {
    Dog baylee = new Dog("Baylee");
    Cat sam = new Cat("Sam");
    Fish goldie = new Fish("Goldie");
    Turtle squirt = new Turtle("Squirt");

    Pet[] pets = new Pet[4];

    pets[0] = baylee;
    pets[1] = sam;
    pets[2] = goldie;
    pets[3] = squirt;
    
    for(Pet pet : pets) {
      System.out.printf("%s says %s\n", pet.getName(), pet.speak());
    }
  }
}