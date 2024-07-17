package visitor;

import java.util.Iterator;

/**
 * 访问数据结构并显示元素一览，实现visit方法
 */
public class ListVisitor extends Visitor {
    private String currentdir = "";                         // 当前访问的文件夹的名字
    public void visit(File file) {                  // 在访问文件时被调用
        System.out.println(currentdir + "/" + file);
    }

    /**
     * 访问者模式中的递归调用是accept方法与visit方法之间的相互递归调用
     * @param directory 文件夹
     */
    public void visit(Directory directory) {   // 在访问文件夹时被调用
        System.out.println(currentdir + "/" + directory);
        String savedir = currentdir;
        currentdir = currentdir + "/" + directory.getName();
        Iterator it = directory.iterator();
        while (it.hasNext()) {
            Entry entry = (Entry)it.next();
            entry.accept(this);
        }
        currentdir = savedir;
    }
}
