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
            if(node.getKey() < x.getKey()){
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
    }

    @Override
    public int[] orderedTraversal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean search(int k) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
