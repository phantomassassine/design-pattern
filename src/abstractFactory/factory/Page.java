package abstractFactory.factory;
import java.io.*;
import java.util.ArrayList;

/**
 * 抽象的产品Page类
 */
public abstract class Page {
    protected String title;
    protected String author;
    protected ArrayList content = new ArrayList();
    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }
    public void add(Item item) {
        content.add(item);
    }
    public void output() {
        try {
            String filename = title + ".html";
            Writer writer = new FileWriter(filename);
            // this强调是Page类自己的makeHTML方法
            writer.write(this.makeHTML());
            writer.close();
            System.out.println(filename + " Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public abstract String makeHTML();
}
