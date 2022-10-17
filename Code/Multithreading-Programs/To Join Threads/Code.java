class MyThread1 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hello");
        }
    }
}
class MyThread2 extends Thread{
    public void run(){
        for(int i=0;i<50;i++){
            System.out.println("Hi");
        }
    }
}
public class Code{
    public static void main(String[] args) {
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        try{
            t1.join();
        }catch(Exception e){
            e.printStackTrace();
        }
        t2.start();
    }
}