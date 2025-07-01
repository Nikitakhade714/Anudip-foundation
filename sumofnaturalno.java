import java.util.Scanner;
public class sumofnaturalno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a number");
        int n = scanner.nextInt();
        if(n<=0){
            System.out.println("enter a positive integer");
        }
        else{
            int sum = 0;
            for(int i=1;i<=n;i++){
                sum+=i;
            
            }
            System.out.println("the sum is"    +sum);

        }

    }
    
}
