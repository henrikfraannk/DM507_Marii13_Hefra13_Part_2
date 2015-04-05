public class Node { 
    private Node left, right;
    private int key;
    
    public Node(int key){
        this.key = key;
        left = null;
        right = null;
    }
    
    public int getKey(){
        return key;
    }

    public Node getLeft(){
        return left;
    }
    
    public void setLeft(Node n){
        left = n;
    }
    
    public Node getRight(){
        return right;
    }
    
    public void setRight(Node n){
        right = n;
    }
}
