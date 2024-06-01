public class largestnumber {
    public static int largest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > largest){
                largest=numbers[i];
            }
        }
        return largest;
    }
        public static void main(String[] args) {
     int numbers[]={3,5,6,7,8,9};
     System.out.println("value is " + largest(numbers));
        }
    }