class Mat{
    int [][] arr;
    int n;
    int t;
    Mat(int ar[][]){
        arr = ar;
    }
    public int normal(){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                n += Math.pow(arr[i][j], 2);
            }
        }
        return (int)(Math.sqrt(n));
    }
    public int trace(){
        for(int i=0,j=0;i<arr.length;i++,j++){
            t += arr[i][j];
        }
        return t;
    }
}

public class Code{
    public static void main(String[] args) {
        int test[][] = {{ 2, 3, 5, 6, 7 },      
                        { 8, 9, 10, 11, 12 },
                        { 13, 14, 15, 16, 17 }, 
                        { 18, 1, 3, 0, 6 },
                        { 7, 8, 11, 8, 11 },};
        Mat m = new Mat(test);
        System.out.println("Normal is : " + m.normal());
        System.out.println("trace is : " + m.trace());
    }
}