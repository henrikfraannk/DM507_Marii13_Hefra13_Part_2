
import java.util.Scanner;

public class Treesort {
    public static void main(String[] args){
        Scanner scan = new Scanner( System.in );

        String[] input = scan.nextLine().split(" ");
        DictBinTree tree = new DictBinTree();
        
        for(String s : input){
            tree.insert(Integer.parseInt(s));
        }
        
        int[] numbers = tree.orderedTraversal();
        
        for(int i = 0; i <numbers.length; i++){
            System.out.println(numbers[i]);
        }
    }
}
