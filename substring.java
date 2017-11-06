class substring {
    public int lengthOfLongestSubstring(String s) {
        int static count=0;
        int n=s.length();
        int arr[ ]=new int[n];
        Character[] arr=new Character[s.length()]
        for(int i=0;i<n;i++)
        {
            arr[i]=s.charAt(i);
        }
        
        for(int i=0;i<n;i++)
        {
            if(arr[i]!=arr[i+1])
                count++;
            else
                count=0;
        }
        
    }
}