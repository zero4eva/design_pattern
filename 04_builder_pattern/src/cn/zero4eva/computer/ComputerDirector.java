package cn.zero4eva.computer;


public class ComputerDirector {

    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder) {
        this.builder = builder;
    }

    public Computer Construct() {
        builder.buildMainBoard();
        builder.buildCPU();
        builder.buildHardDisk();
        builder.buildGPU();
        builder.buildRAM();
        builder.buildDisplay();
        builder.buildChassis();
        return builder.getComputer();
    }
}
