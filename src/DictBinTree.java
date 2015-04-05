public class DictBinTree implements Dict{
    
    private Node root;
    
    public DictBinTree(){
        root = null;
    }

    @Override
    public void insert(int k) {
        Node node = new Node(k);
        
        node.setY(null);
        node.setX(root);
        while(node.getX() != null){
            node.setY(node.getX());
            if(node.getKey() < node.getX().getKey()){
                
            }
            else{
                
            }
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
