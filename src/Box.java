import java.util.ArrayList;

public class Box<T extends Fruit> {
    private T obj1;
    private ArrayList appleBox;
    private ArrayList orangeBox;
    private float weight;

    public Box(T obj1) {
        this.obj1 = obj1;
        if (obj1 instanceof Apple) {
            appleBox = new ArrayList<>();
            appleBox.add(obj1);
            weight += new Apple().weight;
        } else if (obj1 instanceof Orange){
            orangeBox = new ArrayList<>();
            orangeBox.add(obj1);
            weight += new Orange().weight;
        }
    }
    public void putFruit(T obj ){
        if (obj instanceof Apple){
            try {
                appleBox.add(obj);
                weight += new Apple().weight;
            } catch (NullPointerException e){
                System.out.println("Вы пытаетесьположить яблоко в ящик с апельсинами");
            }
        } else if (obj instanceof Orange) {
            try {
                orangeBox.add(obj);
                weight += new Orange().weight;
            } catch (NullPointerException e) {
                System.out.println("Вы пытаетесьположить апельсин в ящик с яблоками");
            }
        }
    }

    public void allWeight(){
        if (this.obj1 instanceof Apple){
            System.out.println("Вес яблок в ящике равен: " + weight);
        } else if (this.obj1 instanceof Orange){
            System.out.println("Вес апельсинов в ящике равен: " + weight);
        }
    }

    public void compare(Box<T> obj){
        if (this.weight == obj.weight){
            System.out.println("Вес ящиков равен");
        } else {
            System.out.println("Вес ящиков не равен");
        }
    }

    public void shiftFruit(Box<Fruit> obj){
        ArrayList sort;
        sort = obj.getBox();
        int size = sort.size();
        if (sort.get(0) instanceof Apple ){
            for (int i = 0; i < size; i++) {
                try {
                    appleBox.add(sort.get(i));
                    weight += new Apple().weight;
                } catch (NullPointerException e){
                    System.out.println("Вы пытаетесьположить яблоко в ящик с апельсинами");
                    break;
                }
            }
        } else if (sort.get(0) instanceof Orange){
            for (int i = 0; i < size; i++) {
                try {
                    orangeBox.add(sort.get(i));
                    weight += new Orange().weight;
                } catch (NullPointerException e){
                    System.out.println("Вы пытаетесьположить апельсин в ящик с яблоками");
                    break;
                }
            }
        }
    }


    public ArrayList getBox(){
        if (obj1 instanceof Apple){
            return appleBox;
        }
            return orangeBox;
    }
}
