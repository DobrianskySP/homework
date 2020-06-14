import java.util.ArrayList;

public class Box<T extends Apple,V extends Orange> {
    private T obj1;
    private  V obj2;
    private ArrayList<T> appleBox;
    private ArrayList<V> orangeBox;

    public Box(T obj1) {
        this.obj1 = obj1;
        appleBox = new ArrayList<>();
        appleBox.add(obj1);
    }
    public Box(V obj2) {
        this.obj2 = obj2;
        orangeBox = new ArrayList<>();
        orangeBox.add(obj2);
    }
    public void putFruit(T obj ){
        try {
            appleBox.add(obj);
        } catch (NullPointerException e){
            System.out.println("Вы пытаетесьположить яблоко в ящик с апельсинами");
        }
    }
    public void putFruit(V obj){
        try {
            orangeBox.add(obj);
        } catch (NullPointerException e) {
            System.out.println("Вы пытаетесьположить апельсин в ящик с яблоками");
        }
    }

    public void allWeight(){
        if (this.obj1 instanceof Apple){
            System.out.println("Вес яблок в ящике равен: " + (appleBox.size() * new Apple().weight));
        } else if (this.obj2 instanceof Orange){
            System.out.println("Вес апельсинов в ящике равен: " + (orangeBox.size() * new Orange().weight));
        }
    }

}
