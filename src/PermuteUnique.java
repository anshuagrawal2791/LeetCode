import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 14/06/17.
 */
public class PermuteUnique {
    HashSet<List<Integer>> finalList = new HashSet<>();
    public List<List<Integer>> permuteUnique(int[] a) {
        permute(a,0,a.length-1);
        return new ArrayList<List<Integer>>(finalList);
    }
    void permute(int[] a,int i,int j){
        // System.out.println(a.toString()+" "+i+" "+j);
        if(i==j){
            // System.out.println(a.toString());
            List<Integer> li = new ArrayList<>();
            for(int x:a)
                li.add(x);
            finalList.add(li);
        }
        else{
            for(int k=i;k<=j;k++){
                // Collections.swap(a,i,k);
                swap(a,i,k);
                permute(a,i+1,j);
                swap(a,i,k);
            }
        }
    }
    void swap(int a[],int i,int j){
        int temp = a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
