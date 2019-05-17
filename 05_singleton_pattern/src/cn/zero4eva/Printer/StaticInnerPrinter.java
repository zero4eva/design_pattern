package cn.zero4eva.Printer;


// 懒汉式，静态内部类方法，线程安全
public class StaticInnerPrinter {

    // 将构造器私有，禁止外界通过构造器创建实例
    private StaticInnerPrinter() {
    }

    // 静态内部类中创建实例
    private static class StaticInnerPrinterHelper {
        private static final StaticInnerPrinter printer = new StaticInnerPrinter();
    }

    // 只能通过该方法获取实例
    public static final StaticInnerPrinter getInstance() {
        return StaticInnerPrinterHelper.printer;
    }

    public void print(String file) {
        System.out.println("print " + file + " now...");
    }
}
