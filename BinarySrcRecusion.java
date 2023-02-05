class BinarySrcRecusion{

boolean BinarySrcRecusion(int[]arr,int s,int e,int k ){
   if(s>e){
    return false;
    
   }

   int mid = s+(e-s)/2;

   if(arr[mid]==k){
    return true;
   }

   if(arr[mid]<k){
    return BinarySrcRecusion(arr,mid+1,e,k);
   }
   else{
    return BinarySrcRecusion(arr,s,mid-1,k);
   }
}

public static void main(String[] args) {
    BinarySrcRecusion obj=new BinarySrcRecusion();
    int arr[]={1,2,3,4,5,6};
    
  boolean result=obj.BinarySrcRecusion(arr,0,arr.length,4);
  System.out.println(result);

}
}