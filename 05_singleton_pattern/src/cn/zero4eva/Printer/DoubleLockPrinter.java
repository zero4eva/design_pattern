package cn.zero4eva.Printer;

// 懒汉式，双重锁定方法
public class DoubleLockPrinter {

    // 将构造器私有，禁止外界通过构造器创建实例
    private DoubleLockPrinter() {
    }

    private static Object object = new Object();
    private volatile static DoubleLockPrinter instance = null;

    // 只能通过该方法获取实例
    public static DoubleLockPrinter getInstance() {
        if (null == instance) {
            synchronized (object) {
                // 防止阻塞后的线程重复创建实例
                if (null == instance)
                    instance = new DoubleLockPrinter();
            }
        }
        return instance;
    }

    public void print(String file) {
        System.out.println("print " + file + " now...");
    }
}
