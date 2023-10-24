   import java.util.Scanner;

public class OrderCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double total = 0;

        System.out.println("Menu Selection:");
        System.out.println("C1= P109.00");
        System.out.println("C2= P153.00");
        System.out.println("C3= P250.00");
        System.out.println("C4= P449.00");
        System.out.println("C5= P699.00");

        System.out.print("Enter the code of the item you want to order: ");
        String code = scanner.nextLine();

        System.out.print("Enter the quantity: ");
        int quantity = scanner.nextInt();

        switch (code) {
            case "C1":
                total = 109.00 * quantity;
                break;
            case "C2":
                total = 153.00 * quantity;
                break;
            case "C3":
                total = 250.00 * quantity;
                break;
            case "C4":
                total = 449.00 * quantity;
                break;
            case "C5":
                total = 699.00 * quantity;
                break;
            default:
                System.out.println("Invalid code!");
                return;
        }

        System.out.print("Do you want to include ads? (Y/N): ");
        String ads = scanner.next();

        if (ads.equalsIgnoreCase("Y")) {
            System.out.println("Ads on:");
            System.out.println("R1= ₱35.00");
            System.out.println("R2= ₱50.00");

            System.out.print("Enter the code of the ad you want to include: ");
            String adCode = scanner.next();

            switch (adCode) {
                case "R1":
                    total += 35.00;
                    break;
                case "R2":
                    total += 50.00;
                    break;
                default:
                    System.out.println("Invalid ad code!");
                    return;
            }
        }

        double usdTotal = total / 56.00;
        System.out.println("Total Price (PHP): " + total);
        System.out.println("Total Price (USD):" + usdTotal);
    }
}
