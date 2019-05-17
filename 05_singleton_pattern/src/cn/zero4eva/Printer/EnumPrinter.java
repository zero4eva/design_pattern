package cn.zero4eva.Printer;

// 枚举方法，线程安全
public enum EnumPrinter {
    instance;

    public void print(String file) {
        System.out.println("print " + file + " now...");
    }
}
