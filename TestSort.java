import java.util.Comparator;
import java.io.IOException;
import java.util.Arrays;;

public class TestSort
{
    public static void main(String args[])throws IOException
    {
        int arr[][]=new int[][] {{7,2,9,12},{8,7,9,36},{98,58,99,65},{5,16,8,12}};
        TwoDArray ar[]=new TwoDArray[arr.length*arr[0].length];
        int k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                ar[k++]=new TwoDArray((arr[i][j]), i, j);
            }
        }
        Arrays.sort(ar,new SortByKey());
        
        // for(k=0;k<ar.length;k++)
        // {
        //     arr[ar[k].row][ar[k].col]=ar[k].key;
        // }
        k=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                arr[i][j]=ar[k++].key;
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
class TwoDArray{
    int key;
    int row;
    int col;
    TwoDArray(int k,int r,int c)
    {
        key=k;
        row=r;
        col=c;
    }
}
class SortByKey implements Comparator<TwoDArray>{
    public int compare(TwoDArray a,TwoDArray b)
    {
        return a.key-b.key;
    }
    
}


