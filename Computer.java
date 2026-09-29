public class Computer {

    
    private String brand;
    private int ram;
    private int storage;
    private String processor;

    
    public Computer(String brand, int ram, int storage, String processor) {
        this.brand = brand;
        this.ram = ram;
        this.storage = storage;
        this.processor = processor;
    }

    
    public String getBrand() {
        return brand;
    }

    public int getRam() {
        return ram;
    }

    public int getStorage() {
        return storage;
    }

    public String getProcessor() {
        return processor;
    }

    // Method that subclasses can inherit
    public void startComputer() {
        System.out.println(brand + " computer is starting...");
    }

    // Description of the computer
    public String toString() {
        return "Brand: " + brand + ", Processor: " + processor + ", RAM: " + ram + " GB" + ", Storage: " + storage + " GB";
    }
}