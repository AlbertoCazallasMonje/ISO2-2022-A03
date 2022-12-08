import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {

    @Test
    public void testSuit01() throws RuntimeException {
        try {
            int[] angles = new int[]{178, 0, 179};
            int[] sides = new int[]{0, 20000, 0};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideType();
        } catch (RuntimeException e) {
            return;
        }

        // exception was not thrown
        org.junit.Assert.fail("invalid input didn't produce exception");
    }

    @Test
    public void testSuit02() throws RuntimeException {
        try {
            int[] angles = new int[]{180, 179, 50};
            int[] sides = new int[]{-50, -50, 40};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideType();
        } catch (RuntimeException e) {
            return;
        }

        // exception was not thrown
        org.junit.Assert.fail("invalid input didn't produce exception");
    }

    @Test
    public void testSuit03() throws RuntimeException {
        try {
            int[] angles = new int[]{180, 45, 179};
            int[] sides = new int[]{40, 1, 1};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideType();
        } catch (RuntimeException e) {
            return;
        }

        // exception was not thrown
        org.junit.Assert.fail("invalid input didn't produce exception");
    }

    @Test
    public void testSuit04() throws RuntimeException {
        try {
            int[] angles = new int[]{0, 180, -20};
            int[] sides = new int[]{1, 40, -50};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideType();
        } catch (RuntimeException e) {
            return;
        }

        // exception was not thrown
        org.junit.Assert.fail("invalid input didn't produce exception");
    }

    @Test
    public void testSuit05() throws RuntimeException {
        try {
            int[] angles = new int[]{70, 180, 180};
            int[] sides = new int[]{1, 40, -50};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideType();
        } catch (RuntimeException e) {
            return;
        }

        // exception was not thrown
        org.junit.Assert.fail("invalid input didn't produce exception");
    }
}