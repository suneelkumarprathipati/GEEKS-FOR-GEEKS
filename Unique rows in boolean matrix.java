
/*Complete the given function*/
class GfG
{
        public static ArrayList<ArrayList<Integer>> uniqueRow(int a[][],int r, int c)

    {

        //add code here.

        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();

        for(int i=0;i<r;i++){

            ArrayList<Integer> level=new ArrayList<>();

            for(int j=0;j<c;j++){

                level.add(a[i][j]);

            }

            if(!ans.contains(level)) ans.add(level);

        }

        return ans;

    }

}
