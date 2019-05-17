package cn.zero4eva.Printer;

// 饿汉式，线程安全
public class SimpleHungryPrinter {

    // 将构造器私有，禁止外界通过构造器创建实例
    private SimpleHungryPrinter() {
    }

    // 类加载的时候就创建该实例
    private static SimpleHungryPrinter instance = new SimpleHungryPrinter();

    // 只能通过该方法获取实例
    public static SimpleHungryPrinter getInstance() {
        return instance;
    }

    public void print(String file) {
        System.out.println("print " + file + " now...");
    }
}
