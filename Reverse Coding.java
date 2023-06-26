class Solution {
    static int sumOfNaturals(int n) {
        return (int) ( (long) ((long)n*(n+1)/2L) %1000000007);
    }
};
