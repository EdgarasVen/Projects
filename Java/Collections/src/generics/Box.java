package generics;

public class Box<T extends Comparable<T>> {
    private T t ;
    private T t2 ;
    private boolean lock=true;

    public void lock() {
        lock=true;
    }
    public void unLock() {
        lock=false;
    }
    public boolean isLocked() {
        return lock;
    }
    public Box(T t, T t2) {
        if (t.compareTo(t2)<0){
            this.t = t;
            this.t2 =t2;
        }
        else {
            this.t = t2;
            this.t2 =t;
        }
    }

    public T getT() {
        try {
            if(!lock){
                return t;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("class is locked");
        }
        return null;
    }

    public T getT2() {
        try {
            if(!lock){
                return t2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("class is locked");
        }
        return null;
    }

    @Override
    public String toString() {
        return "Box{" +
                "t=" + t +
                ", t2=" + t2 +
                '}';
    }
}
