public class StringRevRec {

    void Reverse(String s,int i,int j){
      
        //base case
        if(i>j){
            return;
        }

    char a;
    a=s.charAt(i);
    s.charAt(i)=s.charAt(j);
    s.charAt(j)=a;
    
    swap(s.charAt(i),s.charAt(j));
        i++;
        j--;

        Reverse(s, i, j);

    }
    

    public static void main(String[] args) {
        StringRevRec obj=new StringRevRec();
       String s="abcd";

       obj.Reverse(s,0,s.length()-1);
       System.out.println(s);
    }
    
}
