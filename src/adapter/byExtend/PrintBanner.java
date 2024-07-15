package adapter.byExtend;

/**
 * 适配器类
 * 继承了Banner类，实现了Print接口。
 */
public class PrintBanner extends Banner implements Print {
    public PrintBanner(String string) {
        super(string);
    }
    public void printWeak() {
        showWithParen();
    }
    public void printStrong() {
        showWithAster();
    }
}
