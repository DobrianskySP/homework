import java.util.ArrayList;

public class Nums<T> {
private T[] obj1;

    public Nums(T... obj1) {
        this.obj1 = obj1;
    }

    public void changePosition(int first, int second){
        if (first - 1 >= this.obj1.length || second - 1>= this.obj1.length){
            System.out.println("В массиме 1 или меньше элементов или места элементов указаны неправильно");
        } else {
            T objf = obj1[first - 1];
            T objs = obj1[second - 1];
            obj1[first - 1] = objs;
            obj1[second - 1] = objf;
            for (int i = 0; i < obj1.length; i++) {
                System.out.print(obj1[i] + " ");
            }
            System.out.println();
        }
    }

    public ArrayList mergeToList(){
        ArrayList<T> arr = new ArrayList<>();
        for (int i = 0; i < obj1.length; i++) {
            arr.add(obj1[i]);
        }
        return arr;
    }
}
