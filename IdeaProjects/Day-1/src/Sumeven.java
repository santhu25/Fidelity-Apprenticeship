public class Sumeven {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        int sum = 0;
        int num;
        for(int i=0; i<numbers.length; i++){
            num = numbers[i];

            if(num%2==0){
                sum += num;
            }
        }
        System.out.println("sum of even number: "+sum);
    }
}
