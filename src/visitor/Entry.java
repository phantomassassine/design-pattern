package visitor;

import java.util.Iterator;


/**
 * 实现Element接口使Entry类适用于访问者模式，
 * 但实际上实现抽象方法accept使Entry类的子类——File和Directory
 */
public abstract class Entry implements Element {
    public abstract String getName();                                   // 获取名字
    public abstract int getSize();                                      // 获取大小

    /**
     * add方法仅对Directory有效，这里设计为抛出异常
     * @param entry
     * @return
     * @throws FileTreatmentException
     */
    public Entry add(Entry entry) throws FileTreatmentException {       // 增加目录条目
        throw new FileTreatmentException();
    }
    public Iterator iterator() throws FileTreatmentException {    // 生成Iterator
        throw new FileTreatmentException();
    }
    public String toString() {                                          // 显示字符串
        return getName() + " (" + getSize() + ")";
    }
}
