import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class CollectionSequence
        implements Collection<Pet>{
    private Pet[] pets = Pets.createArray(8);

    public int size() {
        return pets.length;
    }

    public Iterator<Pet> iterator() {
        return new Iterator<Pet>() {
            private int index = 0;

            public boolean hasNext() {
                return index < pets.length;
            }

            public Pet next() {
                return pets[index++];
            }

            public void remove() { // Not implemented
                throw new UnsupportedOperationException();
            }
        };
    }

    @Override
    public boolean isEmpty() {
    
        return false;
    }

    @Override
    public boolean contains(Object o) {
       
        return Arrays.asList(pets).contains(o);
    }

    @Override
    public Object[] toArray() {
       
        return null;
    }

    @Override
    public <T> T[] toArray(T[] a) {
      
        return null;
    }

    @Override
    public boolean add(Pet e) {
      
        return false;
    }

    @Override
    public boolean remove(Object o) {
       
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
       
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Pet> c) {
        
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
       
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        
        return false;
    }

    @Override
    public void clear() {
     
        
    }
    public static void main(String[] args) {
        CollectionSequence c = new CollectionSequence();
        InterfaceVsIterator.display(c);
        InterfaceVsIterator.display(c.iterator());
    }
}