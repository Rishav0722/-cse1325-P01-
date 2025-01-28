import java.util.LinkedList;
import java.util.Queue;

public class AI {
    private Engine engine;
    private Queue<String> recentQueries;

    public AI(Engine engine) {
        this.engine = engine;
        this.recentQueries = new LinkedList<>();
    }

    // Record a query
    public String interact(String query) {
        if (recentQueries.size() == 5) {
            recentQueries.poll(); // Remove the oldest query
        }
        recentQueries.offer(query);

        // Simulate a response
        return "Response from " + engine + ": \"" + query + "\" received.";
    }

    // Print the recent queries
    public void printRecentQueries() {
        System.out.println("Recent queries to " + engine + ":");
        for (String q : recentQueries) {
            System.out.println(q);
        }
    }
}
