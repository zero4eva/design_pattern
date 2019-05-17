package cn.zero4eva.Printer;

// 懒汉式，非线程安全
public class SimpleLazyPrinter {

    // 将构造器私有，禁止外界通过构造器创建实例
    private SimpleLazyPrinter() {
    }

    private static SimpleLazyPrinter instance = null;

    // 只能通过该方法获取实例，且在用到的时候才创建该实例
    public static SimpleLazyPrinter getInstance() {
        if (null == instance)
            instance = new SimpleLazyPrinter();
        return instance;
    }

    public void print(String file) {
        System.out.println("print " + file + " now...");
    }
}
