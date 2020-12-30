public class Main {
    public static void main(String[] args) {

        MyTree myTree = new MyTree();
        myTree.insert(50);
        myTree.insert(20);
        myTree.insert(30);
        myTree.insert(40);
        myTree.insert(70);
        myTree.insert(80);
        myTree.insert(60);
        myTree.insert(15);
        myTree.insert(25);
        myTree.delete(15);
        myTree.outString();
        System.out.println(myTree.root.value);
    }
}
