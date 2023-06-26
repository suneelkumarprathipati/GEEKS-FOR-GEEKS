
class Solution
{
    public int klengthpref(String[] arr, int n, int k, String str)
    {
        int ret = 0 ;
        if (k > str.length()){
            return 0;
        }
        String temp = str.substring(0,k);
        for ( String s : arr ){
            if (temp.length() > s.length()){
                continue;
            }
            if ( s.substring(0,k).equals(temp)){
                ret++ ;
            }
        }
        return ret;
    }
}
