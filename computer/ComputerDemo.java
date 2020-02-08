package computer;

public class ComputerDemo {
    public static void main(String[] args) {
        Computer laptop = new Computer(2014, 1700, true, 8000, 7000, "Windows");
        Computer desktop = new Computer(2015, 2000, false, 16000, 8000, "Linux Mint");

        laptop.useMemory(100);
        desktop.changeOperationSystem("Ubuntu");

        System.out.println(laptop.getFreeMemory());
        System.out.println(laptop.getMemory());
        System.out.println(laptop.getOperationSystem());
        System.out.println(laptop.getPrice());
        System.out.println(laptop.getYear());

        System.out.println(desktop.getYear());
        System.out.println(desktop.getPrice());
        System.out.println(desktop.getOperationSystem());
        System.out.println(desktop.getMemory());
        System.out.println(desktop.getFreeMemory());
    }
}

