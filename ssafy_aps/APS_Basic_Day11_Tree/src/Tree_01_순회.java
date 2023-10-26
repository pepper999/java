public class Tree_01_순회 {
    public static char[] arr = new char[]{'\u0000', 'A', 'B', 'C', 'D', 'E', 'F', 'G', ' ', ' ', 'H', 'I'};
    public static int N = arr.length;
    
    public static void main(String[] args) {
        preorder(1);
        System.out.println();
        inorder(1);
        System.out.println();
        postorder(1);
    }
    
    public static void preorder(int i) {
        if (i < N) {
            if (arr[i] != ' ') {
                System.out.print(arr[i] + " ");
            }
            preorder(i * 2);
            preorder(i * 2 + 1);
        }
    }
    
    public static void inorder(int i) {
        if (i < N) {
            inorder(i * 2);
            if (arr[i] != ' ') {
                System.out.print(arr[i] + " ");
            }
            inorder(i * 2 + 1);
        }
    }
    
    public static void postorder(int i) {
        if (i < N) {
            postorder(i * 2);
            postorder(i * 2 + 1);
            if (arr[i] != ' ') {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
