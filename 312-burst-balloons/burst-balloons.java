class Solution {    
     public int maxCoins(int[] nums) {        
         if (nums==null || nums.length==0) return 0;        
          int n = nums.length;         
          int[] ball=new int[n + 2];         
          ball[0]=1;         
          ball[n + 1]=1;         
          System.arraycopy(nums, 0, ball, 1, n);         
          int size=n+2;         
          int[] flatMemo=new int[size * size];         
          for(int len=1;len<=n;len++){             
            for(int left=1;left<=n-len+1;left++){                 
                int right=left+len-1;                 
                int maxCoins=0;                 
                for(int i=left;i<=right;i++){                     
                    int coins=flatMemo[(left)*size+(i-1)]                                
                    +flatMemo[(i+1)*size+(right)]                                
                    +ball[left-1]*ball[i]*ball[right+1];                     
                    if (coins>maxCoins) {                         maxCoins=coins;                     }                 }                 flatMemo[left*size+right]=maxCoins;             }         }        
                     return flatMemo[1*size+n];     
                     } 
                    }