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
        System.out.println("Thread 1 status : " + t1.getState());
        t1.start();
        System.out.println("Thread 1 status : " + t1.getState());
        System.out.println("Thread 2 status : " + t2.getState());
        t2.start();
        System.out.println("Thread 2 status : " + t2.getState());
    }
}