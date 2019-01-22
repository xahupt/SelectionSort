/**
 *
 *
 * @author percy 选择排序算法
 *
 */
public class InsertionSort {
    static int count = 10;
    static long[] longs = new long[count];
    private void InsertionSort_(){
        int temp=0;
        while(temp<count){
            long min=longs[temp];
            int position=temp;
            for (int i=temp+1;i<count;i++){
                if (min<longs[i]){
                    min = longs[i];
                    position = i;
                }
            }
            Swap(longs,temp,position);
            temp++;
        }
    }
    private void Swap(long[] list,int i,int j){
        long c= list[i];
        list[i] = list[j];
        list[j] = c;
    }
    public static void main(String[] args){

        for (int i=0;i<count;i++){
            longs[i] = Math.round(Math.random()*1000);
            System.out.print(longs[i]+" ");
        }
        System.out.println("\n");
        System.out.println("------选择排序之后的序列------");
        new InsertionSort().InsertionSort_();
        for (int i=0;i<count;i++){

            System.out.print(longs[i]+" ");
        }
    }
}
