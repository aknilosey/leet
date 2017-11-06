class medianofsortedarrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

       int l=nums1.length+nums2.length;
       int i=0,j=0,k=0;
       int[] arr=new int[l];
        
           while(i<nums1.length && j<nums2.length)
           {
           if (nums1[i]<nums2[j]){
               arr[k]=nums1[i];
               i++;}
           else {
               arr[k]=nums2[j];
                j++;} 
               
               k++ ;
           }        
        while (i < nums1.length)
        {
            arr[k] = nums1[i];
            i++;
            k++;
        }
 
        
        while (j < nums2.length)
        {
            arr[k] = nums2[j];
            j++;
            k++;
        }
       /*int medA=arr[l/2];
       int medB=arr[(l/2)-1];*/
        double n;
        if(l%2==0)
            n=(double)(arr[l/2]+arr[l/2-1])/2;
        else n=arr[(l/2)];
        
            return n;
    }
}
