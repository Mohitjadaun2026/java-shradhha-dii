public class binarysearch {
    public static int binary(int numbers[], int key){
        int start =0, end=numbers.length-1;
        while(start<=end){
int mid=(start+end)/2;
if(numbers[mid]==key){
    return mid;
}
if(numbers[mid]<key){
    start=mid+1;
}
else{
    end=mid-1;
}
        }
return -1;}
    public static void main(String[] args) {
        int numbers[]={4,8,9,10,12,59};
        int key=59;
        System.out.println("index is"+binary(numbers,key));
    }
    
}
