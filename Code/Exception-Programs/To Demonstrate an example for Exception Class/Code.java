import java.util.Scanner;

class MyException extends Exception{
    public String toString(){
        return "Number cannot be less than 50";
    }
    public String getMessage(){
        return "Please enter a number greater than 50";
    }
}
public class Code{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num :  ");
        int x = sc.nextInt();
        sc.close();
        try{
            if(x<50){
                throw new MyException();
            }
        }catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}