public class LinkedListClient {
    public static void main(String args[]) throws Exception {
        LinkedlistImpl list = new LinkedlistImpl();
        list.addAtFirst(1);
        list.display();

        list.addAtFirst(2);
        list.display();

        list.addAtFirst(3);
        list.display();

        list.addAtFirst(4);
        list.display();

        list.addAtFirst(5);
        list.display();

        list.removeFromFirst();
        list.display();

        list.removeFromFirst();
        list.display();

        System.out.println(list.getIndex(2));

        list.addAtIndex(1, 55);
        list.display();
    }

}
