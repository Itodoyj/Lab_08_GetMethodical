import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int favInteger = SafeInput.getInt(in,"enter your favorite integer");
        double favDouble = SafeInput.getDouble(in,"enter your favorite double");
        System.out.println("your favorite integer: "+favInteger);
        System.out.println("your favorite double: "+favDouble);
        in.close();
    }
}
