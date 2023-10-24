import java.util.Scanner;

class josephusChicken{
   
  public static void main(String[] a) {
   
       final double adultMealPrice = 109.00;
       final double kiddieMealPrice = 250.00;
   
       System.out.println("Josephus Chicken: ");
   
       Scanner sc = new Scanner(System.in);
   
       /* Josephus Chicken
       AdultMeal = PHP 109.00
       KiddieMeal = PHP 250.00
       */
   
       int numberOfAdultMeal = 0;
       int numberOfKiddieMeal = 0;
   
       System.out.print("Number of Adult Meal: ");
       numberOfAdultMeal = sc.nextInt();
   
       System.out.print("Number of Kiddie Meal: ");
       numberOfKiddieMeal = sc.nextInt();
   
       double adultMealTotalPrice = numberOfAdultMeal * adultMealPrice;
       double kiddieMealTotalPrice = numberOfKiddieMeal * kiddieMealPrice;
   
       System.out.println("Total Adult Meal Price: " + adultMealTotalPrice);
       System.out.println("Total Kiddie Meal Price: " + kiddieMealTotalPrice);
   }
}