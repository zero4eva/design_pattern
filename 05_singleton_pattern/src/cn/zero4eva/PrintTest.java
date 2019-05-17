package cn.zero4eva;

import cn.zero4eva.Printer.EnumPrinter;
import cn.zero4eva.Printer.SimpleLazyPrinter;

public class PrintTest {
    public static void main(String[] args) {
        String file = "xxx.doc";
        SimpleLazyPrinter printer1 = SimpleLazyPrinter.getInstance();
        printer1.print(file);

        SimpleLazyPrinter printer2 = SimpleLazyPrinter.getInstance();
        System.out.println(printer1 == printer2);
    }
}