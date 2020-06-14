public class Box<T extends Apple,V extends Orange> {
    private T[] obj1;
    private  V[] obj2;

    public Box(T... obj1) {
        this.obj1 = obj1;
    }
    public Box(V... obj2) {
        this.obj2 = obj2;
    }
    public void putFruit(T[] obj){

    }
    public void putFruit(V[] obj){

    }

    @Override
    public String toString() {
        return obj1.getClass().getName();
    }
}
