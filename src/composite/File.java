package composite;

public class File extends Entry {
    private String name;
    private int size;
    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public int getSize() {
        return size;
    }
    protected void printList(String prefix) {
        // 字符串+对象，程序会自动调用对象的toString方法
        // 相当于 prefix + "/" + this.toString()
        System.out.println(prefix + "/" + this);
    }
}
