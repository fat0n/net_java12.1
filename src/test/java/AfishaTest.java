import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AfishaTest {

    @Test
    public void testAdd() {
        Afisha afisha = new Afisha();

        afisha.add("Film1");
        afisha.add("Film2");
        afisha.add("Film3");

        String[] expected = {"Film1", "Film2", "Film3"};
        String[] actual = afisha.findAll();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test10last() {
        Afisha afisha = new Afisha();

        afisha.add("Film1");
        afisha.add("Film2");
        afisha.add("Film3");
        afisha.add("Film4");
        afisha.add("Film5");
        afisha.add("Film6");
        afisha.add("Film7");
        afisha.add("Film8");
        afisha.add("Film9");
        afisha.add("Film10");

        String[] expected = {"Film10", "Film9", "Film8", "Film7", "Film6", "Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5last() {
        Afisha afisha = new Afisha();

        afisha.add("Film1");
        afisha.add("Film2");
        afisha.add("Film3");
        afisha.add("Film4");
        afisha.add("Film5");


        String[] expected = {"Film5", "Film4", "Film3", "Film2", "Film1"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3last() {
        Afisha afisha = new Afisha(3);

        afisha.add("Film1");
        afisha.add("Film2");
        afisha.add("Film3");
        afisha.add("Film4");
        afisha.add("Film5");
        afisha.add("Film6");
        afisha.add("Film7");
        afisha.add("Film8");
        afisha.add("Film9");


        String[] expected = {"Film9", "Film8", "Film7"};
        String[] actual = afisha.findLast();
        Assertions.assertArrayEquals(expected, actual);
    }

}
