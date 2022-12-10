import java.io.*;
import java.util.*; 
public class Principal {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {

        try {
            int [] sides = input_sides();
            System.out.println("Array sides: ");
            for (int i=0;i<sides.length;i++) {
                System.out.print(sides[i]+", ");
            }

            int [] angles = input_angles();

            System.out.println("Array angles: ");
            for (int i=0;i<angles.length;i++) {
                System.out.print(angles[i]+", ");
            }
            Triangle triangle = new Triangle (angles,sides);

            System.out.println ("Triangle type depending on side is: "+triangle.sideType()+", and depending on angle is "+triangle.sideAngle());
            
        } catch (IOException e) {
            
        }
    }

    
    /**
     * This function takes three integer values from the user and stores them in an array, so we create the angles of the triangle array.
     * 
     * @return The method is returning an array of integers.
     */
    public static int [] input_angles(){
        System.out.println("\nIntroduce values for angles");
        String aux;
        int angles [] = new int [3]; 
        int sum = 0;
        try {

            while (sum != 180){
                sum = 0;
                for (int i = 0; i < angles.length; i++) {
                    System.out.println("Introduce a value for the angles in position [" + i + "]");
                    aux = sc.next();
                    while (isNumeric(aux)) {
                        System.out.println("Introduce a correct option:");
                        aux = sc.next();
                    }
                    angles[i] = Integer.parseInt(aux);
                    sum += angles[i];

                }
                System.out.println(sum);
            }
        }catch (IOException e){

        }

        return angles;
    }

    /**
    * This function takes three integer values from the user and stores them in an array, so we create the sides of the triangle array.
    * 
    * @return The method returns an array of integers.
    */

    public static int[] input_sides() throws IOException{
        System.out.println("Introduce values of sides");
        int sides[] = new int[3];
        String aux;
        try{
            for (int i = 0; i < sides.length; i++) {
                System.out.println("Introduce a value for the sides in position [" + i + "]");
                aux = sc.next();
                while (isNumeric(aux)) {
                    System.out.println("Introduce a correct option:");
                    aux = sc.next();
                }
                while(Integer.parseInt(aux) <= 0) {
                    while (isNumeric(aux)) {
                        System.out.println("Introduce a correct option:");
                        aux = sc.next();
                    }
                }
                sides[i] = Integer.parseInt(aux);
            }

        }catch (IOException ex){

        }
        return sides;
    }


    // Supportive method to see if a string is a valid numeric value
    public static boolean isNumeric(String aux) throws IOException{
        try {
            Integer.parseInt(aux);
            return false;
        } catch (NumberFormatException exc) {
            return true;
        }
    }

}




