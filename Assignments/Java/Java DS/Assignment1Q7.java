class SearchArray{    
    public static boolean searchArray(int[] arr,int toCheckValue){
        for(int i=0;i<15;i++){
            if(arr[i]==toCheckValue)
                return true;            
        }
        return false;
    }
}
public class Assignment1Q7 extends SearchArray{
    public static void main(String[] args) {
        
        int arr[] = { 5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int toCheckValue = 19;
        System.out.println(searchArray(arr,toCheckValue));
}
}