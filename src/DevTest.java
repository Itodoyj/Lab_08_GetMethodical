import java.util.Scanner;
public class DevTest {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        /**
         * Test for getNonZeroLenString
        String bestFood = "";
        bestFood = SafeInput.getNonZeroLenString(in,"Enter your favorite meal");
        System.out.println("\nYour favorite meal is:"+bestFood);
         */
        /**
         * Test for getInt and getDouble
         *
        int shoeSize = SafeInput.getInt(in,"enter your shoe size");
        double weight = SafeInput.getDouble(in,"enter your weight");
        System.out.println("your shoe size is: "+shoeSize);
        System.out.println("your weight is: "+weight);
        int bMonth = SafeInput.getRangedInt(in,"enter your birth month",1, 12);
        double babyWeight = SafeInput.getRangedDouble(in,"baby weight",2.5,4.5);
        System.out.println("your birth month is: "+bMonth);
        System.out.println("your baby weigth is: "+babyWeight);
         */
        boolean userResp = SafeInput.getYesNoInput(in,"are you happy?");
        System.out.println("your response is:" +userResp);
    }
}