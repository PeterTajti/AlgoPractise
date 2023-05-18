package Interview.Webshop;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class WebshopApp {

    public static void main(String[] args) {
        List<String> payments = readFile("src/Interview/Webshop/payments.csv");

        try {
            validateFileContent(payments);
        } catch (InvalidDateException e) {
            System.err.println("Invalid Date format.");;
        }
        System.out.println(payments);
    }

    private static void validateFileContent(List<String> payments) throws InvalidDateException {

        for (String payment: payments) {
            String[] paymentData = payment.split(";");
            String date = paymentData[6];
            if (date.length() > 10) {
                throw new InvalidDateException();
            }
        }
    }

    public static List<String> readFile(String file){

        Path filePath = Paths.get(file);
        try {
            List<String> fileLines = Files.readAllLines(filePath);
            return fileLines;
        } catch (IOException e) {
            System.err.println("Unable to read file.");
            return new ArrayList<>();
        }
    }
}
