import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Code{
    public static void main(String[] args) {
        LocalDateTime ltd = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("EEEE, dd-MMM-yyyy");
        System.out.println(df.format(ltd));
    }
}