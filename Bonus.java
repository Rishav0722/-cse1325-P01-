import java.util.Stack;

public class AI {
    private Engine engine;
    private Stack<String> queryStack;

    public AI(Engine engine) {
        this.engine = engine;
        this.queryStack = new Stack<>();
    }

    // Record a query
    public String interact(String query) {
        queryStack.push(query);

        // Simulate a response
        return "Response from " + engine + ": \"" + query + "\" received.";
    }

    // Print the query stack
    public void printAllQueries() {
        System.out.println("All queries to " + engine + ":");
        for (String q : queryStack) {
            System.out.println(q);
        }
    }
}
