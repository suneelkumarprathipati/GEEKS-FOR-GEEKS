class Solution {
    public static int distributeTicket(int N,int K)
    {  int Z=N,a=0,count=0;
       for(int i=0;i<=N/K;i++){
           if(count==0){
               if(a+K>=Z) return(Z);
               a=a+K;
               count=1;
           }
           else{
               if(Z-K<=a) return(a+1);
               count=0;
               Z=Z-K;
           }
       }
       if(count==0) return(Z);
       else return a;
    }
}
