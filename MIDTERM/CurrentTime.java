import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CurrentTime {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Format and display the current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d yyyy");
        String formattedDate = currentDate.format(formatter);

        System.out.println(formattedDate);
    }
}
