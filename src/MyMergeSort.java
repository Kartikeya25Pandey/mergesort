public class MyMergeSort {
    int arr1[];
    public MyMergeSort(int size)
    {
        arr1=new int[size];
    }
    public void mergesort(int arr[],int lb,int ub)
    {
        if (lb<ub)
        {
            int mid=(lb+ub)/2;
            //left side array
            mergesort(arr,lb,mid);
            //right side array
            mergesort(arr,mid+1,ub);
            merge(arr,lb,mid,ub);
        }
    }//end of mergesort method
    public void merge(int arr[],int lb,int mid,int ub)
    {
        int i=lb;
        int j=mid+1;
        int k=lb;
        while(i<=mid && j<=ub)
        {
            if(arr[i]<=arr[j])
            {
                arr1[k]=arr[i];
                i++;
            }
            else
            {
                arr1[k]=arr[j];
                j++;
            }
            k++;
        }
        if(i>mid)
        {
            while(j<=ub)
            {
                arr1[k]=arr[j];
                j++;
                k++;
            }
        }
        else
        {
            while (i<=mid)
            {
                arr1[k]=arr[i];
                i++;
                k++;
            }
        }
        for (k=lb;k<=ub;k++)
        {
            arr[k]=arr1[k];
        }
    }
}
