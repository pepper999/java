package 단순연결리스트;

public class SinglyLinkedList {
    // 필드로 가지고 있으면 좋은것들
    private Node head; // 노드의 시작점
    private int size; // 연결리스트의 노드의 개수 :이론상 필수는 아니지만 있으면 편함.
    // 아래의 코드는 사실 필요없어! 우리가 자바의 성질만 잘 알고 있으면
    
    public SinglyLinkedList() {
        this.head = null;
        this.size = 0;
    }
    
    // 조회
    public Node get(int idx) {
        // 인덱스는 0부터 : 아래의 상황에서 예외처리를 해줄 수도 있고.
        // 0 보다 작은 값이 들어오면 그냥 첫번째 노드 반환
        // size 이상이 들어오면 그냥 마지막 노드 반환 : 직접 작성 커스텀의 참맛
        if (idx < 0 || idx >= size) {
            return null;
        }
        Node curr = head;
        for (int i = 0; i < idx; i++) {
            curr = curr.link;
        }
        return curr;
    }
    
    // 첫번째 위치에 원소 삽입
    public void addFirst(String data) {
        // 노드를 생성한다.
        Node node = new Node(data); // 생성자를 만들어 놓았으니 인스턴스 생성 가능
        // 순서중요
        node.link = head;
        head = node; // head가 첫번째 원소를 가리키는 거니까 넣어
        size++;
    }
    
    // 마지막 위치에 원소 삽입
    public void addLast(String data) {
        // head가 null 무슨의미? size가 0이고 공백리스트
//		if(head == null)
        if (size == 0) {
            addFirst(data);
            return;
        }
        
        Node node = new Node(data);
        // 마지막 노드를 찾아가자.
        Node curr = head;
        while (curr.link != null) {
            curr = curr.link;
        }
        
        curr.link = node;
        size++;
    }
    
    // 연결리스트에 내용물을 출력하는 메서드 구현
    public void printList() {
        Node curr = head;

//		if(size == 0) {
        if (head == null) {
            System.out.println("지금은 공백리스트야 출력할건 없어");
            return;
        }
        
        // size 라는 필드를 사용하게 된다면 for문 가능
        // size 필드를 사용하지 않으면 몇번 돌릴지 몰라.
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.link;
        }
        
        System.out.println();
        
    }
    
    // 중간 원소 삽입
    public void add(int idx, String data) {
        if (idx < 0 || idx > size) {
            System.out.println("유효하지 않은 익덱스를 작성해");
            return;
        }
        if (idx == 0) {
            addFirst(data);
            return;
        }
        if (idx == size) {
            addLast(data);
            return;
        }
        Node pre = get(idx-1); // 조회 함수를 만들어 두었으니까 이전 노드를 찾는 것은 쉽다
        Node node = new Node(data);
        node.link = pre.link;
        pre.link = node;
        size++;
    }
    
    // 첫번쨰 원소 삭제 및 데이터 반환
    public String remove() {
        if (head == null) {
            return null;
        }
        String data = head.data;
        head = head.link;
        size--;
        return data;
    }
    
    public String remove(int idx) {
        if (idx == 0) return remove();
        if (idx < 0 || idx >= size) return null;
        Node pre = get(idx-1);
        Node rmNode = get(idx); // Node rmNode = pre.link;
        String data = rmNode.data; // Sring data = pre.link.data;
        pre.link = rmNode.link; // pre.link = pre.link.link;
        size--;
        return data;
    }
}
