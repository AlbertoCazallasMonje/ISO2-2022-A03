import org.junit.Test;

public class TriangleTestDecisions {

    // *** *** *** *** ***
    // Tests on "side type"
    // *** *** *** *** ***

    @Test // Section 5: Test suit 1
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

    @Test // // Section 5: Test suit 2
    public void testIsoscelesTriangle() {
        int[] angles = new int[]{60, 60, 60};
        int[] sides = new int[]{40, 40, 1};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String sideType = t.sideType();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("It's Isósceles", sideType);
    }

    @Test // // Section 5: Test suit 3
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

    @Test // // Section 5: Test suit 13
    public void testIllegalSideValue() {
        try {
            int[] angles = new int[]{60, 60, 60};
            int[] sides = new int[]{-50, 40, 40};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideType();

            // this code is reached if exception was not thrown
            org.junit.Assert.fail("invalid input didn't produce expected exception");

        } catch (RuntimeException e) {
            System.out.println("Exception of type " + e.getClass().getName() + " was thrown.");
            return;
        }
    }

    // *** *** *** *** ***
    // Tests on "angle type"
    // *** *** *** *** ***

    @Test // Section 5: Test suit 6
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

    @Test // Section 5: Test suit 5
    public void testRightTriangle() {
        int[] angles = new int[]{90, 45, 45};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Rectangulo", angleType);
    }

    @Test // Section 5: Test suit 4
    public void testObtuseTriangle() {
        int[] angles = new int[]{178, 1, 1};
        int[] sides = new int[]{40, 40, 40};

        // needs to finish without throwing exception
        Triangle t = new Triangle(angles, sides);
        String angleType = t.sideAngle();

        // if exception is thrown, test fails at this point

        // checks, if returned string is as defined in source code
        org.junit.Assert.assertEquals("Osbtángulo", angleType);
    }

    @Test // // Section 5: Test suit 11
    public void testIllegalAngleValue() {
        try {
            int[] angles = new int[]{-45, 45, 180};
            int[] sides = new int[]{-50, 40, 40};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideAngle();

            // this code is reached if exception was not thrown
            org.junit.Assert.fail("invalid input didn't produce expected exception");

        } catch (RuntimeException e) {
            System.out.println("Exception of type " + e.getClass().getName() + " was thrown.");
            return;
        }
    }

    @Test // // Section 5: Test suit 12
    public void testIllegalAngleSum() {
        try {
            int[] angles = new int[]{179, 1, 1};
            int[] sides = new int[]{-50, 40, 40};

            // needs to throw exception
            Triangle t = new Triangle(angles, sides);
            String sideType = t.sideAngle();

            // this code is reached if exception was not thrown
            org.junit.Assert.fail("invalid input didn't produce expected exception");

        } catch (RuntimeException e) {
            System.out.println("Exception of type " + e.getClass().getName() + " was thrown.");
            return;
        }
    }
}
