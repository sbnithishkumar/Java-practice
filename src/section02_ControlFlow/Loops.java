package section02_ControlFlow;

public class Loops {
    public static void main(String[] args) {
        skipElement();
        sumOfEvenNumbers();
        stringReverse();
    }

    private static void stringReverse() {
        String str="hello";
        String reversed="";
        for(int i=str.length()-1;i>=0;i--){
            reversed +=str.charAt(i);
        }
        System.out.println(reversed);
    }

    private static void sumOfEvenNumbers() {
        int sum=0;
        for(int i=1; i<=100; i=i+2 ){
            sum+=i;
        }
        System.out.println(sum);
    }

    private static void skipElement() {
        for(int i=1;i<100;i++){
            if(i%5==0)continue;
            System.out.println(i);
        }
    }
}
