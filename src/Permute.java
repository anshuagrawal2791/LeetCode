import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 14/06/17.
 */
public class Permute {
    List<List<Integer>> finalList = new ArrayList<>();
    public List<List<Integer>> permute(int[] a) {
        // ArrayList<Integer> lis = new ArrayList<>();
        // for(int i=0;i<a.length;i++)
        // lis.add(a[i]);
        permute(a,0,a.length-1);
        return finalList;
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
