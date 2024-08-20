class Swap {  

    public static void main(String[] args) {  
        int num1 = 10;  
        int num2 = 20;  

        System.out.println("Before swapping: num1 = " + num1 + ", num2 = " + num2);  

        num1 = num1 + num2; // 10 + 20 = 30
        num2 = num1 - num2; // 30 - 20 = 10
        num1 = num1 - num2; // 30 - 10 = 20

        System.out.println("After swapping: num1 = " + num1 + ", num2 = " + num2);  
    }  
}