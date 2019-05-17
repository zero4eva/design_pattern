package cn.zero4eva.computer;


public class HighComputerBuilder extends ComputerBuilder {

    @Override
    public void buildMainBoard() {
        super.computer.setMainBoard("m-ATX");
    }

    @Override
    public void buildCPU() {
        super.computer.setCPU("Core i9-9900K");
    }

    @Override
    public void buildHardDisk() {
        super.computer.setHardDisk("512G SSD + 2TB HDD");
    }

    @Override
    public void buildGPU() {
        super.computer.setGPU("RTX 2080 Ti 11G");
    }

    @Override
    public void buildRAM() {
        super.computer.setRAM("DDR4 32G");
    }

    @Override
    public void buildDisplay() {
        super.computer.setDisplay("ASUS PG27 4K/144HZ");
    }

    @Override
    public void buildChassis() {
        super.computer.setChassis("海皇戟-244");
    }
}
