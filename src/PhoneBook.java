import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneBook {

    final File data = new File("phonebook.data");
    List<String> list = new ArrayList<String>();

    public void AddNew(String first_name, String last_name, String phone_number) throws IOException {
        FileWriter data_write = new FileWriter(data, true);
        data_write.write(first_name + " " + last_name + " " + phone_number);
        data_write.write(System.lineSeparator());
        data_write.close();
    }

    public void ListAll() throws IOException {
        int id = 1;
        FileReader data_read = new FileReader(data);
        Scanner scan = new Scanner(data_read);
        while (scan.hasNext()) {
            list.add(scan.nextLine());
            String[] item = list.get(id - 1).split(" ");
            System.out.println(id + ". " + item[0] + " " + item[1]);
            id++;
        }
        data_read.close();
    }

    public void ShowNumber(int id) {
        System.out.println(id + "." + list.get(id - 1));
    }

}