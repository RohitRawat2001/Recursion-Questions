class LinearSrcRecursion{

   static boolean LinearSrcRecursion(int[]arr,int size,int k){

    if(size==0){
      return false;
    }
    if(arr[0]==k){
      return true;
    }
    else{
      boolean remainingPart=LinearSrcRecursion(arr+1,size-1,k);
      return remainingPart;

    }  
   }
    public static void main(String[] args) {

     int[]arr={2,5,6,7,8,9};
     int k=6;
     int size=6;
     

     boolean ans= LinearSrcRecursion(arr,size,k);

     if (ans)
     System.out.println( " is present at index ");
 else
     System.out.println(" is not present");
}

}
