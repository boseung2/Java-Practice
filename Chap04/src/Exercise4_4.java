public class Exercise4_4 {
    public static void main(String[] args) {

        int num = 1;
        int sum = 0;

        while(true){
            sum += (num % 2 ==0) ? -num : num;
            if(sum >= 100){
                break;
            }
            num++;
        }
        System.out.println(num);
    }
}
