package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`

    @Test
    public void testGetNumberOfCats() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Cat animal = AnimalFactory.createCat(name, birthDate);
        CatHouse.clear();

        // When
        CatHouse.add(animal);

        // Then
        CatHouse.getNumberOfCats();
    }

    @Test
    public void addTest1(){
        // Arrange
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat cat = new Cat(name, birthDate, -1);
        CatHouse.clear();
        Integer expected = 1;

        // Act
        CatHouse.add(cat);
        Integer actual = CatHouse.getNumberOfCats();
        // Assert
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void addTest2(){
        String name = "Friedrich Wilhem, Deutscher Kaiser";
        Calendar cal = new GregorianCalendar(1831, 10, 18);
        Date birthDate = cal.getTime();
        Cat doug = new Cat(name, birthDate, 0);
        CatHouse.clear();
        Integer expected = 1;

        CatHouse.add(doug);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected,actual);
    }

    @Test
    public void removeIdTest1(){
        Cat cat = new Cat(null,null,null);
        CatHouse.clear();
    }

    @Test
    public void removeIdTest2(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Cat friedrich = new Cat(name, birthDate, 1);
        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.add(friedrich);
        CatHouse.remove(0);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest3(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Cat friedrich = new Cat(name, birthDate, 1);
        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.add(friedrich);
        CatHouse.remove(1);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest4(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.add(otto);
        CatHouse.remove(0);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest5(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        Integer expected = 0;

        CatHouse.add(otto);
        CatHouse.add(otto);
        CatHouse.remove(0);
        CatHouse.remove(0);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeIdTest6(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        Integer expected = 2;

        CatHouse.add(otto);
        CatHouse.add(otto);
        CatHouse.remove(2);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeCatTest1(){
        Cat cat = new Cat(null, null, null);
        CatHouse.clear();
        Integer expected = 0;

        CatHouse.add(cat);
        CatHouse.remove(cat);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest2(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Cat friedrich = new Cat(name, birthDate, 1);
        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.add(friedrich);
        CatHouse.remove(friedrich);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest3(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Cat friedrich = new Cat(name, birthDate, 1);
        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.add(friedrich);
        CatHouse.remove(otto);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest4(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.add(otto);
        CatHouse.remove(otto);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest5(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        Integer expected = 0;

        CatHouse.add(otto);
        CatHouse.add(otto);
        CatHouse.remove(otto);
        CatHouse.remove(otto);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest6(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);
        name = "Friedrich Wilhem, Deutscher Kaiser";
        cal.set(1831, 10, 18);
        birthDate = cal.getTime();
        Cat friedrich = new Cat(name, birthDate, 1);
        Integer expected = 1;

        CatHouse.add(otto);
        CatHouse.remove(friedrich);
        Integer actual = CatHouse.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIdTest1(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        CatHouse.add(otto);
        Cat actual = CatHouse.getCatById(0);

        Assert.assertEquals(otto, actual);
    }


    @Test
    public void getCatByIdTest2(){
        CatHouse.clear();
        String name = "Otto, Furst von Bismarck";
        Calendar cal = new GregorianCalendar(1815,4,1);
        Date birthDate = cal.getTime();
        Cat otto = new Cat(name, birthDate, 0);

        CatHouse.add(otto);
        Cat actual = CatHouse.getCatById(1);

        Assert.assertEquals(null, actual);
    }
}
