package abstractFactory;

import abstractFactory.factory.*;

/**
 * Main类只引入了factory包，说明该类没有使用任何具体零件、产品、工厂，
 * 具体工厂的类名是由命令行决定的。
 */
public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java Main class.name.of.ConcreteFactory");
            System.out.println("Example 1: java Main listfactory.ListFactory");
            System.out.println("Example 2: java Main tablefactory.TableFactory");
            System.exit(0);
        }
        Factory factory = Factory.getFactory(args[0]);

        Link people = factory.createLink("People newspaper", "http://www.people.com.cn/");
        Link gmw = factory.createLink("Sun newspaper", "http://www.gmw.cn/");

        Link us_yahoo = factory.createLink("Yahoo!", "http://www.yahoo.com/");
        Link jp_yahoo = factory.createLink("Yahoo!Japan", "http://www.yahoo.co.jp/");
        Link excite = factory.createLink("Excite", "http://www.excite.com/");
        Link google = factory.createLink("Google", "http://www.google.com/");

        Tray traynews = factory.createTray("news");
        traynews.add(people);
        traynews.add(gmw);

        Tray trayyahoo = factory.createTray("Yahoo!");
        trayyahoo.add(us_yahoo);
        trayyahoo.add(jp_yahoo);

        Tray traysearch = factory.createTray("search engine");
        traysearch.add(trayyahoo);
        traysearch.add(excite);
        traysearch.add(google);

        Page page = factory.createPage("LinkPage", "og");
        page.add(traynews);
        page.add(traysearch);
        page.output();
    }
}
