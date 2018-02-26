import static org.junit.Assert.*;

/**
 * Created by karol on 26.02.2018.
 */
public class MainTest {
    @org.junit.Test
    public void add() throws Exception {

        assertEquals(0, Main.Add(""));
        assertEquals(3, Main.Add("1,2"));
        assertEquals(12, Main.Add("1,2,3,4,2"));
        assertEquals(12,Main.Add("1\n2\n3,4\n2"));
        assertEquals(5, Main.Add("//[;aa]\n2;aa3"));
        assertEquals(3, Main.Add("1001,3"));
        assertEquals(4, Main.Add("//[a][b][x]\n1a1b1x1"));

    }
}