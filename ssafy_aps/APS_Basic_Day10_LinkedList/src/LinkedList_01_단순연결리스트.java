import 단순연결리스트.SinglyLinkedList;

//테스트 화면
public class LinkedList_01_단순연결리스트 {
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.printList();
        
        list.addFirst("박민아");
        list.printList();
        
        list.addFirst("임현승");
        list.printList();
        
        list.addFirst("안상준");
        list.printList();
        
        list.addLast("차다운");
        list.printList();
        
        System.out.println(list.get(0));
        
        list.add(2, "오화석");
        list.add(2, "이주원");
        list.add(2, "김세진");
        
        list.printList();
        
        list.remove();
        list.remove();
        list.remove();
        list.printList();
        
        
    }
}
