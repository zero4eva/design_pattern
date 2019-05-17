package cn.zero4eva.computer;


public abstract class ComputerBuilder {

    protected Computer computer;

    public ComputerBuilder() {

        this.computer = new Computer();
    }

    public abstract void buildMainBoard();

    public abstract void buildCPU();

    public abstract void buildHardDisk();

    public abstract void buildGPU();

    public abstract void buildRAM();

    public abstract void buildDisplay();

    public abstract void buildChassis();

    public Computer getComputer() {
        return this.computer;
    }
}
