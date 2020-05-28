import java.util.Scanner;

// create a class named Input that has a private property named scanner.
public class Input {
    // Creating fields (properties)
    private Scanner scanner = new Scanner(System.in);

    public String getString() {
        return this.getString("Type some message: ");
    }

    public String getString (String prompt) {
        System.out.println(prompt);
        return scanner.nextLine();
    }

    // Do you want to continue? Yes or No 할수있다. 이거 들고가서
    public boolean yesNo() {
        System.out.println("Select [y/n]");
        String answer = scanner.nextLine();
        return (answer.equals("y") ? true : false);
    }

    public int getInt(int min, int max) {
        int userNumber;
        try {
            userNumber = Integer.valueOf(this.getString("Give me a number between " + min + " and " + max));
            // do NOT use nextInt();
        } catch (NumberFormatException e) {
            return getInt(min, max);
        }
        if (userNumber < min || userNumber > max) {
            // recursion or use FOR Loop to give user opportunity
            System.out.println("Please try again keep in the range");
            return getInt(min, max);
        }
        return userNumber;
    }

    public int getInt() {
        try {
            return Integer.valueOf(this.getString("Give me an integer"));
        } catch (NumberFormatException e) {
            return getInt();
        }
    }

    public double getDouble(double min, double max) {
        double userNumber;
        try {
            userNumber = Double.valueOf(this.getString("Give me a decimal between " + min + " and " + max));
            // do NOT use nextInt();
        } catch (NumberFormatException e) {
            return getDouble(min, max); // try getDouble() execution again
        }
        if (userNumber < min || userNumber > max) {
            // recursion or use FOR Loop to give user opportunity
            System.out.println("Please try again keep in the range");
            return getDouble(min, max);
        }
        return userNumber;
    }

    public double getDouble() {
        try {
            return Double.valueOf(this.getString("Give me an decimal: "));
        } catch (NumberFormatException e) {
            return getDouble(); // try getDouble() execution again
        }
    }

//    public double getDouble(String prompt) {
//        System.out.println(prompt);
//        try {
//            return Double.valueOf(scanner.nextLine());
//        } catch (NumberFormatException e) {
//            return getDouble(); // try getDouble() execution again
//        }
//    }

}

