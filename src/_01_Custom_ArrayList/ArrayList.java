package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	private T[] list;
    
	public ArrayList() {
	    list = (T[])new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		if( loc < 0 || loc > list.length ) {
		    throw new IndexOutOfBoundsException();
		}
		return list[loc];
	}
	
	public void add(T val) {
		T[] newList = (T[])new Object[ list.length + 1 ];
		
		for( int i = 0; i < list.length; i++ ) {
            newList[i] = list[i];
        }
		newList[ newList.length - 1 ] = val;
		list = newList;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
	    if( loc < 0 || loc > list.length ) {
            throw new IndexOutOfBoundsException();
        }
	    
        T[] newList = (T[])new Object[ list.length + 1 ];
        
        int ctr = 0;
        
        for(int i = 0; i < newList.length; i++) {
            if( i == loc ) {
                newList[i] = val;
            } else {
                newList[i] = list[ctr++];
            }
        }
        list = newList;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
	    if( loc < 0 || loc > list.length ) {
            throw new IndexOutOfBoundsException();
        }
		list[ loc ] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
	    if( loc < 0 || loc > list.length ) {
            throw new IndexOutOfBoundsException();
        }
		
        T[] newList = (T[])new Object[list.length - 1];
        for(int i = 0; i < list.length; i++) {
            if( i < loc ) {
                newList[i] = list[i];
            } else if ( i > loc ) {
                newList[ i - 1 ] = list[i];
            }
        }
        
        list = newList;
	}
	
	public boolean contains(T val) {
		boolean contained = false;
		
		for( int i = 0; i < list.length; i++ ) {
            if( list[i] == val ) {
                contained = true;
                break;
            }
        }
		
		return contained;
	}
	
	public int size() {
	    return list.length;
	}
}