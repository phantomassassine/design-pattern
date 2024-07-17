package composite;

/**
 * 目录条目的抽象类
 */
public abstract class Entry {
    public abstract String getName();                               // 获取名字
    public abstract int getSize();                                  // 获取大小

    /**
     * 父类中仅抛出异常，由子类进行实现
     * @param entry
     * @return
     * @throws FileTreatmentException 自定义
     */
    public Entry add(Entry entry) throws FileTreatmentException {   // 加入目录条目
        throw new FileTreatmentException();
    }
    public void printList() {                                       // 为一览加上前缀并显示目录条目一览
        printList("");
    }

    /**
     * 重载overload显示文件一览方法
     * protected类型只能被Entry类的子类调用
     * @param prefix
     */
    protected abstract void printList(String prefix);               // 为一览加上前缀

    /**
     * 定义实例标准文字显示方式
     * @return 文件名+文件大小
     */
    public String toString() {                                      // 显示代表类的文字
        return getName() + " (" + getSize() + ")";
    }
}
