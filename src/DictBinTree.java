public class DictBinTree implements Dict{    
    private Node root;
    private int size;
    
    public DictBinTree(){
        root = null;
    }

    @Override
    public void insert(int k) {
        Node y = null, x = root, node = new Node(k);
        
        while(x != null){
            y = x;
            if(node.getKey() <= x.getKey()){
                x = x.getLeft();
            }
            else{
                x = x.getRight();
            }
        }
        if(y == null){
            root = node;
        }
        else if(node.getKey() < y.getKey()){
            y.setLeft(node);
        }
        else{
            y.setRight(node);
        }
        size++;
    }

    @Override
    public int[] orderedTraversal() {
        Node x = root;
        int[] numbers = new int[size];
        int i = 0;
        
        inorderTreeWalk(x, numbers, i);
        
        return numbers;
    }
    
    private void inorderTreeWalk(Node x, int[] numbers, int i){
        while(x != null){
            inorderTreeWalk(x.getLeft(), numbers, i);
            numbers[i] = x.getKey();
            i++;
            inorderTreeWalk(x.getRight(), numbers, i);
        } 
    }

    @Override
    public boolean search(int k) {
        Node y = null, x = root;
        
        while(x != null){
            y = x;
            if(k < x.getKey()){
                x = x.getLeft();
            }
            else if(k == x.getKey()){
                return true;
            }
            else{
                x = x.getRight();
            }
        }
        return false;        
    }
    
}
