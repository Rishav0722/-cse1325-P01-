import java.util.Stack;
import eliza.ElizaMain; // Ensure you import the provided Eliza class.

public class AI {
    private Engine engine;
    private Stack<String> queryStack;
    private ElizaMain eliza;

    public AI(Engine engine) {
        this.engine = engine;
        this.queryStack = new Stack<>();

        if (engine == Engine.ELIZA) {
            this.eliza = new ElizaMain();
            this.eliza.load("eliza/eliza.txt"); // Ensure you use the correct file path.
        }
    }

    public String interact(String query) {
        queryStack.push(query);

        // Simulate or delegate to Eliza if applicable
        if (engine == Engine.ELIZA) {
            return eliza.processInput(query);
        }
        return "Response from " + engine + ": \"" + query + "\" received.";
    }

    public void printAllQueries() {
        System.out.println("All queries to " + engine + ":");
        for (String q : queryStack) {
            System.out.println(q);
        }
    }
}
