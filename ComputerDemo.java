import java.util.ArrayList;

public class ComputerDemo {

    public static void main(String[] args) {

        // ArrayList that stores Computer objects
        ArrayList<Computer> computers = new ArrayList<Computer>();

        // Create multiple objects
        Computer computer1 =
                new Computer(
                        "Dell",
                        16,
                        512,
                        "Intel i5"
                );

        GamingComputer computer2 =
                new GamingComputer(
                        "Gigabyte",
                        32,
                        1000,
                        "Ryzen 7",
                        "RTX 3070"
                );

        GamingComputer computer3 =
                new GamingComputer(
                        "ASUS",
                        16,
                        2000,
                        "Intel i7",
                        "RTX 4060"
                );

        // Add objects to the ArrayList
        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);

        System.out.println("Computer Inventory");
        System.out.println("------------------");

        // Loop through the computers
        for (int i = 0; i < computers.size(); i++) {

            Computer currentComputer = computers.get(i);

            System.out.println();
            System.out.println("Computer " + (i + 1));

            // Calls toString()
            System.out.println(currentComputer);

            // Inherited method
            currentComputer.startComputer();
        }

        System.out.println();
        System.out.println("Gaming Computer Test");
        System.out.println("--------------------");

        // Method that only GamingComputer has
        computer2.playGame("Monster Hunter Wilds");
    }
}