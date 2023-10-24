import java.util.Scanner;

class DecisionMakingActivity{
public static void main(String[]a)
{
Scanner sc = new Scanner(System.in);

System.out.println("Route to Moalboal\n");
System.out.print("You're currently at Cebu City");

 while (true) {
            System.out.print("Would you like to proceed? (Y/N): ");
            String input = sc.next();
            
            if (input.equals("Y")) {
                System.out.println("You're now at Minglanilla.");
                break; 
            } else if (input.equals("N")) {
                System.out.println("There's no turning back!");
                break;
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }        while (true) {
            System.out.print("Would you like to proceed to next Route? (Y/N): ");
            String answer = sc.next();
        
                     if (answer == "Y") {
                System.out.println("You're now at San Fernando.");
                break; 
            } else {
            System.out.println("There's no turning back!");
                break;
            }
            }
        System.out.println("You're Now in Carcar!");
        System.out.println("To Proceed, choose route that you want to go");
        System.out.println("1. Barili");
        System.out.println("2. Sibunga");
        System.out.print("Enter your choice (1/2): ");

        int choice = sc.nextInt();
        sc.nextLine(); 

        if (choice == 1) {        
            System.out.println("You're now in Barili");
            int choice1=sc.nextInt();
        switch (choice1){
            case 1:
            System.out.println("You're now at Dumanjug!");
            System.out.println("Press 1 to proceed to the next destination!:");
            break;
            case 2:
            System.out.println("You're now at Alcantara!");
            System.out.println("Press 1 to proceed to the next destination!:");
            break;
            case 3:
            System.out.println("You have reached your destination!");
            System.out.println("You're now at Moalboal!");
             break;

                       
            System.out.println("You're now in Sibonga");
            System.out.println("Select route you want to take: 1 or 2");
            System.out.println("1. Dumanjug");
            System.out.println("2. Argao");
            System.out.print("Enter your choice (1/2): ");
            

         int choice2=sc.nextInt();
         sc.nextLine(); 
         
            switch (choice2){
            case 1:
            System.out.println("You're now at Dumanjug!");
            System.out.println("Press 1 to proceed to the next destination!:");
            break;
            case 2:
            System.out.println("You're now at Alcantara!");
            System.out.println("Press 1 to proceed to the next destination!:");
            break;
            case 3:
            System.out.println("You have reached your destination!");
            System.out.println("You're now at Moalboal!");
             break;
        }
       
}

}
