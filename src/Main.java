public class Main {
    public static void main(String[] args) {

        System.out.println(GCDRecursive(40,70));
    }

    public static int GCDRecursive(int a, int b){
        if(b==0){
            return a;
        }
        else{
            return GCDRecursive(b, a%b);
        }
    }
}