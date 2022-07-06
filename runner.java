import java.util.Scanner;

public class runner {
    public static void main(String[] args){
        System.out.println("hello");
        Scanner scanner = new Scanner(System.in);
        int[]items ={10,8,15,13,12,14};
        BST bst = new BST();
        for(int el:items){
            bst.insert(el);

        }
//        bst.BFS(bst.getRoot());
        bst.LeftviewBFS();
//        bst.inOrder();
//        bst.leftView();bst.print();
//        System.out.println("Enter any letter to continue... or Enter to stop");
//        String option = scanner.nextLine();
//        int item = 0;//initialize
//        while (!option.equals("")){
//            System.out.println("enter item to search");
//            item =scanner.nextInt();scanner.nextLine();
//            Node found = bst.search(item);
//            if(found!=null){
//                System.out.println("found, "+found.data);
//
//        }
//            else{
//                System.out.println("Not found");
//            }
//            System.out.println("Enter any letter to continue... or Enter to stop");
//            option = scanner.nextLine();
//
//        }
    }
}
