import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        PhoneBook pb = new PhoneBook();
        pb.AddNew("Aleksejs", "Kurako", "+32486661433");
        pb.ListAll();
        pb.ShowNumber(3);
    }
}
