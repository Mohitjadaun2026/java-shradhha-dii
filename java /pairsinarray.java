public class pairsinarray{
    public static void printpairs(int numbers[]){
        for (int i=0; i<numbers.length;i++){
            int curr=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.println("("+curr + ","+numbers[j] + ")");

            }
            System.out.println();
        }
    }
    public static void main(String[] args){
int numbers[]={4,5,6,7,8,9};
printpairs(numbers);
    }
}