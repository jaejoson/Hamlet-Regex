import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HamletParserTest {
    private String hamletText;
    private HamletParser hamletParser;

    @Before
    public void setUp() {
        this.hamletParser = new HamletParser();
        this.hamletText = hamletParser.getHamletData();
    }



    @Test
    public void testChangeHamletToLeon() {
        //given
        hamletParser.changeHamletToLeon();
        boolean expected = false;
        //when
        boolean actual = hamletParser.findHamlet();

        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testChangeHoratioToTariq() {
        //given
        hamletParser.changeHoratioToTariq();
        boolean expected = false;
        //when
        boolean actual = hamletParser.findHoratio();
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFindHoratio() {
    }

    @Test
    public void testFindHamlet() {
    }
}