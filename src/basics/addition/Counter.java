package basics.addition;
public class Counter {
    // Static variable
    static int staticCounter = 0;

    // Instance variable
    int instanceCounter = 0;

    // Method to increment counters
    public void incrementCounters() {
        staticCounter++;
        instanceCounter++;
    }

    // Method to display counters
    public void displayCounters() {
        System.out.println("Static Counter: " + staticCounter);
        System.out.println("Instance Counter: " + instanceCounter);
    }

    public static void main(String[] args) {
        // Create first object
        Counter counter1 = new Counter();
        counter1.incrementCounters();
        counter1.displayCounters(); // Static Counter: 1, Instance Counter: 1

        // Create second object
        Counter counter2 = new Counter();
        counter2.incrementCounters();
        counter2.displayCounters(); // Static Counter: 2, Instance Counter: 1

        // Display counters using the first object again
        counter1.displayCounters(); // Static Counter: 2, Instance Counter: 1
    }
}
