public class Node {
    
    private boolean root;
    private Node y, x;
    private int key;
    
    public Node(int key){
        root = false;
        this.key = key;
        y = null;
        x = null;
    }
    
    public int getKey(){
        return key;
    }
    
    public boolean isRoot(){
        return root;
    }
    
    public void setRoot(){
        root = true;
    }
    
    public Node getY(){
        return y;
    }
    
    public void setY(Node n){
        y = n;
    }
    
    public Node getX(){
        return x;
    }
    
    public void setX(Node n){
        x = n;
    }
}
