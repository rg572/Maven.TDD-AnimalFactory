package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest1(){
        // Arrange
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog dog = new Dog(name, birthDate, -1);
        DogHouse.clear();
        Integer expected = 1;

        // Act
        DogHouse.add(dog);
        Integer actual = DogHouse.getNumberOfDogs();
        // Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest2(){
        String name = "Friedrich Wilhem, Deutscher Kaiser";
        Calendar cal = new GregorianCalendar(1831, 10, 18);
        Date birthDate = cal.getTime();
        Dog doug = new Dog(name, birthDate, 0);
        DogHouse.clear();
        Integer expected = 1;

        DogHouse.add(doug);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeIdTest1(){
        Dog dog = new Dog(null,null,-1);
        DogHouse.clear();
        Integer expected = 0;

        DogHouse.add(dog);
        DogHouse.remove(-1);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest2(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Dog friedrich = new Dog(name, birthDate, 1);
        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.add(friedrich);
        DogHouse.remove(0);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest3(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Dog friedrich = new Dog(name, birthDate, 1);
        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.add(friedrich);
        DogHouse.remove(1);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest4(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.add(otto);
        DogHouse.remove(0);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest5(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        Integer expected = 0;

        DogHouse.add(otto);
        DogHouse.add(otto);
        DogHouse.remove(0);
        DogHouse.remove(0);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest6(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        Integer expected = 2;

        DogHouse.add(otto);
        DogHouse.add(otto);
        DogHouse.remove(2);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeDogTest1(){
        Dog dog = new Dog(null, null, null);
        DogHouse.clear();
        Integer expected = 0;

        DogHouse.add(dog);
        DogHouse.remove(dog);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest2(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Dog friedrich = new Dog(name, birthDate, 1);
        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.add(friedrich);
        DogHouse.remove(friedrich);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest3(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Dog friedrich = new Dog(name, birthDate, 1);
        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.add(friedrich);
        DogHouse.remove(otto);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest4(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.add(otto);
        DogHouse.remove(otto);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest5(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        Integer expected = 0;

        DogHouse.add(otto);
        DogHouse.add(otto);
        DogHouse.remove(otto);
        DogHouse.remove(otto);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeDogTest6(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Dog friedrich = new Dog(name, birthDate, 1);
        Integer expected = 1;

        DogHouse.add(otto);
        DogHouse.remove(friedrich);
        Integer actual = DogHouse.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getDogByIdTest1(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        DogHouse.add(otto);
        Dog actual = DogHouse.getDogById(0);

        Assert.assertEquals(otto, actual);
    }


    @Test
    public void getDogByIdTest2(){
        DogHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815, 4,1);
        Date birthDate = cal.getTime();
        Dog otto = new Dog(name, birthDate, 0);

        DogHouse.add(otto);
        Dog actual = DogHouse.getDogById(1);

        Assert.assertEquals(null, actual);
    }
    /*
    public void printClear(){
        System.out.println("Number of dogs before clear: " + DogHouse.getNumberOfDogs());
        DogHouse.clear();
        System.out.println("Number of dogs after clear: " + DogHouse.getNumberOfDogs());
        System.out.println();
    }

     */
}
