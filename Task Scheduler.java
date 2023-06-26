// User function Template for Java
class Solution {
    static int leastInterval(int N, int K, char tasks[]) {
        // code here
        int temp[]=new int[26];
        for(int i : tasks)
            temp[i-'A']++;
            
        int max=-1, count=0;
        
        for(int i = 0 ; i<26 ; i++){
            if(temp[i]==max)
                count++;
            else if(temp[i]>max){
                max=temp[i];
                count=1;
            }
        }
        int ans = Math.max(N, max+(max-1)*K+count-1);
        return ans;
    }
}
