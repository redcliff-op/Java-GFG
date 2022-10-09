import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Code{
    public static void main(String[] args) {
        LocalDateTime ltd = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yy || H:m:s a");
        System.out.println("Date and Time ( Time in AM/PM format ) : " + df.format(ltd));
    }
}