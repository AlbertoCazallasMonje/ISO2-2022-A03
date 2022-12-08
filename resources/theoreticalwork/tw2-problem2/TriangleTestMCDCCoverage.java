import org.junit.Test;

public class TriangleTestMCDCCoverage {

    // *** *** *** *** ***
    // Tests on "side type"
    // *** *** *** *** ***

    @Test
    public void testEquilateralTriangle() {
        int[] angles = new int[]{60, 60, 60};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String sideType = t.sideType();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("It's Equilatero", sideType);
    }

    @Test
    public void testIsoscelesTriangle01() {
        int[] angles = new int[]{60, 60, 60};
        int[] sides = new int[]{40, 40, 1};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String sideType = t.sideType();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("It's Isósceles", sideType);
    }

    @Test
    public void testIsoscelesTriangle02() {
        int[] angles = new int[]{60, 60, 60};
        int[] sides = new int[]{1, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String sideType = t.sideType();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("It's Isósceles", sideType);
    }

    @Test
    public void testIsoscelesTriangle03() {
        int[] angles = new int[]{60, 60, 60};
        int[] sides = new int[]{40, 1, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String sideType = t.sideType();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("It's Isósceles", sideType);
    }

    @Test
    public void testScaleneTriangle() {
        int[] angles = new int[]{60, 60, 60};
        int[] sides = new int[]{20000, 40, 1};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String sideType = t.sideType();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("It's Escaleno", sideType);
    }

    // *** *** *** *** ***
    // Tests on "angle type"
    // *** *** *** *** ***

    @Test
    public void testAcuteTriangle() {
        int[] angles = new int[]{50, 60, 70};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Acutangulo", angleType);
    }

    @Test
    public void testRightTriangle01() {
        int[] angles = new int[]{90, 45, 45};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Rectangulo", angleType);
    }

    @Test
    public void testRightTriangle02() {
        int[] angles = new int[]{45, 90, 45};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Rectangulo", angleType);
    }

    @Test
    public void testRightTriangle03() {
        int[] angles = new int[]{45, 45, 90};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Rectangulo", angleType);
    }

    @Test
    public void testObtuseTriangle01() {
        int[] angles = new int[]{178, 1, 1};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Osbtángulo", angleType);
    }

    @Test
    public void testObtuseTriangle02() {
        int[] angles = new int[]{1, 178, 1};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Osbtángulo", angleType);
    }

    @Test
    public void testObtuseTriangle03() {
        int[] angles = new int[]{1, 1, 178};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Osbtángulo", angleType);
    }
}
