class AirthmaticOperation{
    public static void main(String[] args){
        private int first=30;
        private int second=10;
        int sum=addition(first,second);
        int sub=subtraction(first,second);
        int mult=multiplication(first,second);
        int div=division(first ,second);
        System.out.println("Sum of numbers:"+sum);
        System.out.println("Subtraction of numbers:"+sub);
        System.out.println("Multiplication of numbers:"+mult);
        System.out.println("Division of numbers:"+div);
    }
    public int addition(int a,int b){
        return(a+b);
    }
    public int subtraction(int a,int b){
        return(a-b);
    }
    public int multiplication(int a,int b){
        return(a*b);
    }
    public static int division(int a,int b){
        return(a/b);
    }
}