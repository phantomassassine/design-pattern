package adapter.byExtend;

/**
 * Main中使用Print接口进行编程，即调用Print.printWeak和Print.printStrong方法。
 * 对Main而言Banner类的showWithParen和showWithAster方法都被完全隐藏起来了。
 */
public class Main {
    public static void main(String[] args) {
        Print p = new PrintBanner("Hello");
        p.printWeak();
        p.printStrong();
    }
}
