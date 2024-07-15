package iterator;

import java.util.ArrayList;

/**
 * 书架类
 */
public class BookShelf implements Aggregate {
    private ArrayList books;   
    public BookShelf(int initialize) {
        this.books = new ArrayList(initialize);
    }                                           
    public Book getBookAt(int index) {
        return (Book)books.get(index);          
    }
    public void appendBook(Book book) {
        books.add(book);                        
    }
    public int getLength() {
        return books.size();                    
    }

    /**
     * 实现了Aggregate接口中的iterator方法
     * @return 迭代器
     */
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
