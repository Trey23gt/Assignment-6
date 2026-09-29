public class GamingComputer extends Computer {

    // Extra attribute only GamingComputer has
    private String graphicsCard;

    // Constructor
    public GamingComputer(
            String brand,
            int ram,
            int storage,
            String processor,
            String graphicsCard) {

        super(brand, ram, storage, processor);

        this.graphicsCard = graphicsCard;
    }

    // Extra method for GamingComputer
    public void playGame(String game) {
        System.out.println("Running " + game + " using the " + graphicsCard + ".");
    }

    // Override the superclass toString method
    @Override
    public String toString() {
        return super.toString()
                + ", Graphics Card: " + graphicsCard;
    }
}