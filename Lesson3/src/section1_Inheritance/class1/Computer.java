package section1_Inheritance.class1;

public class Computer {


    protected String manufacturer;
    protected String processor;
    protected int ramSize;
    protected int diskSize;
    protected double processorSpeed;


    public Computer(String man, String proc, int ram, int disk, double procSpeed)
    {
        manufacturer = man;
        this.processor = proc;
        ramSize = ram;
        diskSize = disk;
        processorSpeed = procSpeed;
    }

    public String getProcessor() {
        return processor;
    }

    public double computePower() {
        return ramSize * processorSpeed;
    }
    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    public double getRamSize() { return ramSize; }
    public double getProcessorSpeed() { return processorSpeed; }
    public int getDiskSize() { return diskSize; }
    public String toString() {
        String result = "Manufacturer: " + manufacturer +
                "\nCPU: " + processor +
                "\nRAM: " + ramSize + " megabytes" +
                "\nDisk: " + diskSize + " gigabytes" +
                "\nProcessor speed: " + processorSpeed +
                " gigahertz";
        return result;
    }
}
