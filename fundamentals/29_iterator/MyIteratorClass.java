import java.util.Iterator;
import java.util.function.Consumer;

public class MyIteratorClass{

public class MyIteratorClasss implements Iterator<String> {

    @Override
    public boolean hasNext() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public String next() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

    @Override
    public void remove() {
        Iterator.super.remove(); 
    }

    @Override
    public void forEachRemaining(Consumer<? super String> action) {
        Iterator.super.forEachRemaining(action); 
    }
    
}
}