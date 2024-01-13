public class Addition {

	public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two numbers as command-line arguments.");
            return;
        }

        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);

            int sum = a + b;

            System.out.println("Sum of " + a + " and " + b + " is: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please provide valid integers.");
        }
    }
	
    public static int add(int a, int b) {
        return a + b;
    }

}
