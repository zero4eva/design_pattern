package cn.zero4eva;


import cn.zero4eva.computer.Computer;
import cn.zero4eva.computer.ComputerBuilder;
import cn.zero4eva.computer.ComputerDirector;
import cn.zero4eva.computer.HighComputerBuilder;

public class ComputerTest {
    public static void main(String[] args) {
        ComputerBuilder builder = new HighComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        Computer computer = director.Construct();
        System.out.println(computer.toString());
    }
}
