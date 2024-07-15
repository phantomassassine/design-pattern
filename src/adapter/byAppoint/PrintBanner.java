package adapter.byAppoint;

/**
 * 保存Banner类的实例，通过字段来调用个方法，形成一种委托关系。
 * 当PrintBanner类的printWeak被调用时，PrintBanner类自己不处理，而是交给Banner实例的方法进行处理。
 */
public class PrintBanner extends Print {
    private Banner banner;
    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }
    public void printWeak() {
        banner.showWithParen();
    }
    public void printStrong() {
        banner.showWithAster();
    }
}
