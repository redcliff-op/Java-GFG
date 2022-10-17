class MyThread extends Thread{
    MyThread(String s){
        super(s);
    }
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Its a Daemon Thread");
        }else{
            System.out.println("Its not a Daemon Thread");
        }
    }
}
public class Code{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("t1");
        MyThread t2 = new MyThread("t2");
        t2.start();
        t1.setDaemon(true);
        t1.start();
    }
}