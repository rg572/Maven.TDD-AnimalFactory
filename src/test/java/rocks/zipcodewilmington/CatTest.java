package rocks.zipcodewilmington;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

    @Test
    public void setNameTest1(){
        // Set up the cat and the new name
        Cat cat = new Cat("Destroyer of Worlds", new Date(), 170);
        String newName = "Fluffy";

        // Call setName()
        cat.setName(newName);

        // Assert
        Assert.assertEquals(newName, cat.getName());
    }

    @Test public void setNameTest2(){
        Cat cat = new Cat("d", new Date(), 32);
        String name = "thpp";

        cat.setName(name);

        Assert.assertEquals(name,cat.getName());
    }


    @Test
    public void speakTest1(){
        Cat ballou = new Cat("cat", new Date(), 435);
        String expected = "meow!";

        String actual = ballou.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest2(){
        Date theDate = new Date(1453, 5, 29);
        Cat stevens = new Cat("Steeeeeve", theDate, 5);
        String expected = "meow!";

        String actual = stevens.speak();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void setBirthDateTest1(){
        Cat dog = new Cat("Catdog", new Date(), 1);
        Date expected = new Date(1453, 5, 29);

        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertTrue(expected.equals(actual));
    }

    @Test
    public void setBirthDateTest2(){
        Cat cat = new Cat("I'm out of \"creative\" names", new Date(), 3);
        Calendar whatWasWrongWithTheDateClass = new GregorianCalendar();
        whatWasWrongWithTheDateClass.set(1453,5,29);
        Date expected = whatWasWrongWithTheDateClass.getTime();

        cat.setBirthDate(expected);
        Date actual = cat.getBirthDate();

        Assert.assertTrue(expected.equals(actual));


    }

    @Test
    public void eatFoodTest1(){
        Food myHomework = new Food();
        Cat cat = new Cat("cat", new Date(), 4);

        Integer expected = 1;
        cat.eat(myHomework);
        Integer actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFoodTest2(){
        Food everything = new Food();
        Cat cat = new Cat("cat", new Date(), 5);

        Integer expected = 10;
        for(int i = 0; i < expected; i++){
            cat.eat(everything);
        }
        Integer actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest1(){
        Integer expected = 170;
        Cat cat = new Cat("Ego", new Date(), expected);

        Integer actual = cat.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdTest2(){
        Integer expected = 6;
        Cat sentient = new Cat("SuperEgo", new Date(), expected);

        Integer actual = sentient.getId();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void mammalInheritanceTest(){
        Cat cat = new Cat("cat", new Date(), 0);

        Assert.assertTrue(cat instanceof Mammal);
    }

    @Test
    public void animalInheritanceTest(){
        Cat cat = new Cat("creative",new Date(), -1);

        Assert.assertTrue(cat instanceof Animal);
    }


}
