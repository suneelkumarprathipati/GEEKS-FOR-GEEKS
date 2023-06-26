// insert() and findFrequency()
class Geeks{
     static void insert(Queue<Integer> q, int k){
        q.add(k);
    }
    
    // Function to find frequency of an element
    // rteturn the frequency of k
    static int findFrequency(Queue<Integer> q, int k){
        int c = 0;
        int size = q.size();
        while(size-- > 0) {
            int element = q.remove();
            if(k == element) {
                c++;
            }
            q.add(element);
        }
        return c;
    }
}
