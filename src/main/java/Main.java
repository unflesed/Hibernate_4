
public class Main {
    public static void main(String[] args) {
        AnimalHelper ah = new AnimalHelper();

        //------getById
        System.out.println(ah.getById(1));

        //------addAnimal
        Animal animal2 = new Animal();
        animal2.setAge(1);
        animal2.setName("Rex");
        animal2.setTail(true);
        ah.addAnimal(animal2);

        //------Remove
        ah.removeAnimal(ah.getById(4));

        //------getAll
        System.out.println("Получить всё из таблицы: ");
        System.out.println(ah.getAllAnimals());

        //------update
        Animal animal3 = ah.getById(3);
        animal3.setAge(4);
        ah.addAnimal(animal3);
    }
}
