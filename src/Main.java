public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Nums<String> str = new Nums<>("a","b","c","d","e","f","g");
        Nums<Integer> num = new Nums<>(1,2,3,4,5);
        str.changePosition(2,3);
        num.changePosition(1,5);
    }

}
