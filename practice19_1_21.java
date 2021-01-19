//to check whether a no in a range is odd or not and finding the sum of all odd number's in that range.
public class practice19_1_21 {
    public static void main(String args[]){
         sumOdd(1,5);
        // System.out.println(isOdd(45));
    }
    public static boolean isOdd(int num){
        if(num > 0)
        {
            if(num % 2 != 0){
                return true;
            }
        }
        return false;
    }

    public static int sumOdd(int start,int end){
        int sum = 0;
        if(((start < 0) && (end < 0)) || (end <= start)){
            return -1;
        }
        for(; start <= end ; start++){
            if(isOdd(start) == true){
                sum += start;
            }
        }
        System.out.println("The sum of all the odd no 's is : " + sum);
        return sum;
    }
}
