
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

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
        ArrayList<Integer> nums = new ArrayList();
        inorderTreeWalk(root, nums);
        int[] numbers = new int[size];
        
        for(int i = 0; i < size; i++){
            numbers[i] = nums.get(i);
        }
        
        return numbers;
    }
    
    private void inorderTreeWalk(Node x, List nums){
        if(x != null){
            inorderTreeWalk(x.getLeft(), nums);
            nums.add(x.getKey());
            inorderTreeWalk(x.getRight(), nums);
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
