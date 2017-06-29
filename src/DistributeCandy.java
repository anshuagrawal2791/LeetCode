/**
 * Created by anshu on 29/06/17.
 */
public class DistributeCandy {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int a[] = new int[n];
        int counter=0;
        a[0]=1;
        int min=1;
        return fill(ratings,a,1,n,min);
        // for(int i=1;i<n;i++){
        //     if(ratings[i]<ratings[i-1]){
        //         a[i]=--counter;
        //     }else if(ratings[i]>ratings[i-1]){
        //         a[i]=++counter;
        //     }else{
        //         if(counter==min){
        //             a[i]=counter;
        //         }else {
        //             a[i]=--counter;
        //         }
        //     }
        //     min=Math.min(min,counter);
        // }
        // int toAdd=1-min;int sum=0;
        // for(int i=0;i<n;i++){
        //     sum+=toAdd+a[i];
        // }
        // return sum;

    }
    int fill(int ratings[],int a[],int i,int n,int min){
        if(i==n){
            int toAdd=1-min;
            int sum=0;
            for(int l=0;l<a.length;l++)
                sum+=toAdd+a[l];
            return sum;
        }
        if(ratings[i]>ratings[i-1]){
            a[i]=a[i-1]+1;
            return fill(ratings,a,i+1,n,min);
        }
        else if(ratings[i]<ratings[i-1]){
            a[i]=a[i-1]-1;
            return fill(ratings,a,i+1,n,Math.min(min,a[i]));
        }else{
            a[i]=a[i-1];
            int x = fill(ratings,a,i+1,n,min);
            a[i]=a[i-1]+1;
            int y = fill(ratings,a,i+1,n,min);
            a[i]=a[i-1]-1;
            int z = fill(ratings,a,i+1,n,Math.min(min,a[i]));
            return Math.min(x,Math.min(y,z));
        }
    }
}
