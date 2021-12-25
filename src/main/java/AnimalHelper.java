import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AnimalHelper {
    EntityManagerFactory emf;
    EntityManager em;

    public AnimalHelper() {
        emf = Persistence.createEntityManagerFactory("mohr");
        em = emf.createEntityManager();
    }
    public Animal getById(int id){
        em.getTransaction().begin();
        Animal animal = em.find(Animal.class, id);
        em.getTransaction().commit();
        return animal;
    }
    public void addAnimal(Animal animal){
        em.getTransaction().begin();
        em.merge(animal);
        em.getTransaction().commit();
    }

    public void removeAnimal(Animal animal){
        em.getTransaction().begin();
        em.remove(animal);
        em.getTransaction().commit();
    }
}

