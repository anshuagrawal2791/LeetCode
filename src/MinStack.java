/**
 * Created by anshu on 17/07/17.
 */
    public class MinStack {

        /** initialize your data structure here. */
        double a[] = new double[1000000];
        // int b[] = new int[Integer.MAX_VALUE];
        int size=0;
        double min= Integer.MAX_VALUE;
        public MinStack() {

        }

        public void push(int x) {
            if(size==0){
                a[size++]=x;
                min=x;
            }else{
                if(x>min){
                    a[size++]=x;
                }else{
                    a[size++] = 2*(double)x-min;
                    min=x;
                }
            }
        }

        public void pop() {
            if(size==0)
                return;
            else{
                double x = a[size-1];
                if(a[size-1]>=min){
                    size-=1;
                }else{
                    min = 2*min-a[size-1];
                    size-=1;
                }
            }
        }

        public int top() {
            if(a[size-1]<min)
                return(int) min;
            else return (int)a[size-1];
        }

        public int getMin() {
            return (int)min;
        }
    }

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */

