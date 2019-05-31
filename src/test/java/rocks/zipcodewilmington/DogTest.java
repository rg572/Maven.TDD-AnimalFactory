package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void constructorTest(){
        String name = "Constantius Chlorus";
        Calendar cal = new GregorianCalendar();
        cal.set(250, 3, 31);
        Integer id = 2;
        Dog dog = new Dog(name, cal.getTime(), id);

        String retrievedName = dog.getName();
        Date retrievedDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        Assert.assertEquals(name, retrievedName);
        Assert.assertEquals(cal.getTime(), retrievedDate);
        Assert.assertEquals(id, retrievedId);
    }

    @Test
    public void speakTest(){
        Dog dog = new Dog(null, null, null);
        String expected = "bark!";

        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest1(){
        Dog dog = new Dog(null, null, null);
        Calendar cal = new GregorianCalendar();
        cal.set(410, 8, 24);

        dog.setBirthDate(cal.getTime());
        Date actual = dog.getBirthDate();

        Assert.assertEquals(cal.getTime(), actual);
    }

    @Test
    public void setBirthDateTest2(){
        Dog dog = new Dog(null, null, null);
        Calendar cal = new GregorianCalendar();
        cal.set(73, 4, 16);

        dog.setBirthDate(cal.getTime());
        Date actual = dog.getBirthDate();

        Assert.assertEquals(cal.getTime(), actual);
    }

    @Test
    public void eatTest1(){
        Dog dog = new Dog(null, null,null);
        Food myHomework = new Food();
        Integer expected = 1;

        dog.eat(myHomework);
        Integer actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatTest2(){
        Dog dog = new Dog(null, null, null);
        Food somethingValuable = new Food();
        Integer expected = 23;

        for(int i = 0; i< expected; i++){
            dog.eat(somethingValuable);
        }
        Integer actual = dog.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest1(){
        Integer expected = 567;
        Dog ego = new Dog(null, null, expected);

        Integer actual = ego.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest2(){
        Integer expected = -4;
        Dog superego = new Dog(null, null, expected);

        Integer actual = superego.getId();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void mammalInheritance(){
        Dog dog = new Dog(null,null,null);

        Assert.assertTrue(dog instanceof Mammal);
    }

    @Test
    public void animalInheritance(){
        Dog dog = new Dog(null, null, null);

        Assert.assertTrue(dog instanceof Animal);
    }


}
