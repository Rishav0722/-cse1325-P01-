import java.util.Scanner;

public class Query {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please specify an AI engine (e.g., GPT3, WATSON, ELIZA).");
            return;
        }

        Engine engine;
        try {
            engine = Engine.valueOf(args[0].toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid AI engine. Valid options: GPT3, WATSON, ELIZA.");
            return;
        }

        AI ai = new AI(engine);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Interacting with " + engine + " AI. Type 'exit' to quit.");

        while (true) {
            System.out.print("Enter a query: ");
            String query = scanner.nextLine();

            if (query.equalsIgnoreCase("exit")) {
                break;
            }

            String response = ai.interact(query);
            System.out.println(response);
        }

        System.out.println("\nSession Summary:");
        ai.printRecentQueries();
        scanner.close();
    }
}
