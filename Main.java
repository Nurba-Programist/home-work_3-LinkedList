public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.add(5);
        list.add(5);
        list.add(5);
        list.add(5);
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(5);
        list.add(3);
        list.add(8);

       int n = list.removeAll(5);
       System.out.println(n);
        list.print();

    }
}