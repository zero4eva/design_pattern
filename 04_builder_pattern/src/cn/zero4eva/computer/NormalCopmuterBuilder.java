package cn.zero4eva.computer;


public class NormalCopmuterBuilder extends ComputerBuilder {

    @Override
    public void buildMainBoard() {
        super.computer.setMainBoard("Inspiron 3670-R1848S");
    }

    @Override
    public void buildCPU() {
        super.computer.setCPU("i5-8400");
    }

    @Override
    public void buildHardDisk() {
        super.computer.setHardDisk("128G SSD + 1TB");
    }

    @Override
    public void buildGPU() {
        super.computer.setGPU("Normal 2G独显");
    }

    @Override
    public void buildRAM() {
        super.computer.setRAM("8GB DDR4");
    }

    @Override
    public void buildDisplay() {
        super.computer.setDisplay("Normal 23.6");
    }

    @Override
    public void buildChassis() {
        super.computer.setChassis("Normal Dell Chassis");
    }
}
