public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        Nums<String> str = new Nums<>("a","b","c","d","e","f","g");
        Nums<Integer> num = new Nums<>(1,2,3,4,5);
        str.changePosition(2,3);
        num.changePosition(1,5);
        //-----создаем новый стринговый и переделываем в ArrayList-----------
        Nums<String> merge = new Nums<>("1","12","123","1234","12345");
        System.out.println(merge.mergeToList());
        //------создаем боксы с разными классами фруктов---------------------
        Box<Fruit> boxOfApple = new Box<>(new Apple());
        Box<Fruit> boxOfOrange = new Box<>(new Orange());
        Box<Fruit> secondBoxOfApple = new Box<>(new Apple());
        //-----добавляем в существующие боксы разные фрукты------------------
        boxOfApple.putFruit(new Apple());
        boxOfOrange.putFruit(new Orange());
        boxOfApple.putFruit(new Orange());
        //-----узнаем вес боксов с фруктами----------------------------------
        boxOfApple.allWeight();
        boxOfOrange.allWeight();
        secondBoxOfApple.allWeight();
        //-----сравниваем боксы по весу--------------------------------------
        boxOfApple.compare(boxOfApple);
        //-----пытаемся высыпать бокс с апельсинами в бокс с яблоками--------
        boxOfApple.shiftFruit(boxOfOrange);
        boxOfApple.allWeight();
        //-----высыпаем бокс с яблоками в бокс с яблоками--------------------
        boxOfApple.shiftFruit(secondBoxOfApple);
        boxOfApple.allWeight();
    }
}
