package seasons;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Seasons {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("enter a month (all lower case)");
        String input = br.readLine();
        switch (input.toLowerCase()) {
            case "december":
            case "january":
            case "february":
                System.out.println("WINTER");
                break;
            case "march":
            case "april":
            case "may":
                System.out.println("SPRING");
                break;
            case "june":
            case "july":
            case "august":
                System.out.println("SUMMER");
                break;
            default:
                System.out.println("No this month");
        }
    }
}
