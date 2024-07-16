package abstractFactory.factory;

/**
 * 抽象的零件Item类，是Link类和Tray类的父类，这样Link类和Tray类具有可替换性了。
 */
public abstract class Item {
    protected String caption;
    public Item(String caption) {
        this.caption = caption;
    }
    public abstract String makeHTML();
}
