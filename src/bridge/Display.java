package bridge;

/**
 * 负责显示一些东西
 */
public class Display {
    // 在impl字段中保存的是实现Display类的具体功能的实例，即两个类层次的桥梁
    private DisplayImpl impl;
    public Display(DisplayImpl impl) {
        this.impl = impl;
    }

    /**
     * 预处理
     */
    public void open() {
        impl.rawOpen();
    }

    /**
     * 显示
     */
    public void print() {
        impl.rawPrint();
    }

    /**
     * 后处理
     */
    public void close() {
        impl.rawClose();
    }
    public final void display() {
        open();
        print();                    
        close();
    }
}
