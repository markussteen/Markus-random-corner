import java.util.*;

public class labexercise {

    public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int choice = 0;
        System.out.println("1. Convert to Japanese Yen");
        System.out.println("2. Convert to Canadian Dollar");
         System.out.println("3. Convert to Thai Baht");
         System.out.println("4. Exit program");
         System.out.println("Select the conversion (1-4)");
         choice = keyboard.nextInt();

if (choice == 1){
    System.out.println("How many dollars would you like to convert to Yen");
    double dollar= keyboard.nextInt();
   Double result = toYen(dollar);
   System.out.println(dollar + " USD equals " + result + " yen");
}
if (choice == 2){
    System.out.println("How many dollars would you like to convert to Canadian dollars");
    double dollar= keyboard.nextInt();
   Double result = toCan(dollar);
    System.out.println(dollar + " USD equals " + result + " canadian dollars");
}

if (choice == 3){
    System.out.println("How many dollars would you like to convert to Baht");
    double dollar= keyboard.nextInt();
   Double result = toCan(dollar);
    System.out.println(dollar + " USD equals " + result + " Thai Baht");
} //else {
    //System.out.println("Thanks for using the service");
//}
  
}

public static double toYen(Double dollar) {
 double result = dollar * 131.21;
    return result;

}

public static double toCan(Double dollar) {
    double result = dollar * 1.31;
       return result;
   
   }

   public static double toBaht(Double dollar) {
    double result = dollar * 33.483;
       return result;
   
   }

}
