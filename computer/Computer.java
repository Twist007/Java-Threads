package computer;

public class Computer {

    private int year;
    private double price;
    private boolean isNotebook;
    private double memory;
    private double freeMemory;
    private String operationSystem;

    public Computer(int year, double price, boolean isNotebook, int memory, int freeMemory, String operationSystem) {
        this.year = year;
        this.price = price;
        this.isNotebook = isNotebook;
        this.memory = memory;
        this.freeMemory = freeMemory;
        this.operationSystem = operationSystem;
    }

    public void changeOperationSystem(String newOperationSystem) {
        operationSystem = newOperationSystem;
    }

    public void useMemory(double memory) {
        if (freeMemory < memory) {
            System.out.println("Not enough free memory");
            return;
        }
        freeMemory = freeMemory - memory;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isNotebook() {
        return isNotebook;
    }

    public void setNotebook(boolean notebook) {
        isNotebook = notebook;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getFreeMemory() {
        return freeMemory;
    }

    public void setFreeMemory(int freeMemory) {
        this.freeMemory = freeMemory;
    }

    public String getOperationSystem() {
        return operationSystem;
    }

    public void setOperationSystem(String operationSystem) {
        this.operationSystem = operationSystem;
    }
}
