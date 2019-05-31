package rocks.zipcodewilmington;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import sun.util.calendar.Gregorian;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`

    AnimalFactory soullessMachine = new AnimalFactory();

    @Test
    public void createDogNameTest1(){
        String expected = "Otto, Furst von Bismarck";
        Dog otto = soullessMachine.createDog(expected, null);

        String actual = otto.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createDogNameTest2(){
        String expected = "Friedrich Wilhelm, Deutscher Kaiser";
        Calendar cal = new GregorianCalendar(1831, 10, 18);
        Dog friedrich = soullessMachine.createDog(expected, cal.getTime());

        String actual = friedrich.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createDogDateTest1(){
        Calendar cal = new GregorianCalendar(1815, 4, 1);
        Date expected = cal.getTime();
        Dog otto = soullessMachine.createDog(null, expected);

        Date actual = otto.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createDogDateTest2(){
        String name = "Fredrich Wilhelm, Deutscher Kaiser";
        Calendar cal = new GregorianCalendar(1831, 10, 18);
        Date expected = cal.getTime();
        Dog friedrich = soullessMachine.createDog(name, expected);

        Date actual = friedrich.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatNameTest1(){
        String expected = "Otto, Furst von Bismarck";
        Cat otto = soullessMachine.createCat(expected, null);

        String actual = otto.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatNameTest2(){
        String expected = "Friedrich Wilhelm, Deutscher Kaiser";
        Calendar cal = new GregorianCalendar(1831, 10, 18);
        Cat friedrich = soullessMachine.createCat(expected, cal.getTime());

        String actual = friedrich.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatDateTest1(){
        Calendar cal = new GregorianCalendar(1815, 4, 1);
        Date expected = cal.getTime();
        Cat otto = soullessMachine.createCat(null, expected);

        Date actual = otto.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createCatDateTest2(){
        String name = "Fredrich Wilhelm, Deutscher Kaiser";
        Calendar cal = new GregorianCalendar(1831, 10, 18);
        Date expected = cal.getTime();
        Cat friedrich = soullessMachine.createCat(name, expected);

        Date actual = friedrich.getBirthDate();

        Assert.assertEquals(expected, actual);
    }
}
