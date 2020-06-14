public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Nums<String> str = new Nums<>("a","b","c","d","e","f","g");
        Nums<Integer> num = new Nums<>(1,2,3,4,5);
        str.changePosition(2,3);
        num.changePosition(1,5);

        Nums<String> merge = new Nums<>("1","12","123","1234","12345");
        System.out.println(merge.mergeToList());
        //--------------------------------------------------
        Box<Fruit> boxOfApple = new Box<>(new Apple());
        Box<Fruit> boxOfOrange = new Box<>(new Orange());
        Box<Fruit> secondBoxOfApple = new Box<>(new Apple());

        boxOfApple.putFruit(new Apple());
        boxOfOrange.putFruit(new Orange());
        boxOfApple.putFruit(new Orange());
        boxOfApple.allWeight();
        boxOfOrange.allWeight();
        secondBoxOfApple.allWeight();

        boxOfApple.compare(boxOfApple);

        boxOfApple.shiftFruit(boxOfOrange);
        boxOfApple.allWeight();

        boxOfApple.shiftFruit(secondBoxOfApple);
        boxOfApple.allWeight();
    }

}
