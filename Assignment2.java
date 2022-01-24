package assignment;

public class Assignment2 {

	public static void main(String[] args) {
		q1();
        q2();
        q3();
        q4();
        q5();
        q6();
        q7();
        q8();
        q9();
        q10();
        q11();
        q12();
        System.out.println("\n# Check Prime: " +isPrime(5));
        printEvenNumbers1to100();
        printPrimeNumbers1to100();
        printFiabnoicSeries(100);
        System.out.println(palindrome("abccba"));
        factorial(4);
        amstrongNumber(1634);
    }

    static void q1(){
        System.out.println("# Question 1");
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void q2(){
        System.out.println("\n# Question 2");
        for(int i = 0; i< 4; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print("A");
            }
            System.out.println();
        }
    }

    static void q3(){
        System.out.println("\n# Question 3");
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 5; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }

    static void q4(){
        System.out.println("\n# Question 4");
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 5-i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void q5(){
        System.out.println("\n# Question 5");
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static  void q6(){
        System.out.println("\n# Question 6");
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 5; j++) {
                if(i == 0 || i == 4){
                    System.out.print("@");
                }else{
                    if(j == 0 || j == 4){
                        System.out.print("@");
                    }else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }

    static void q7(){
        System.out.println("\n# Question 7");
        int num = 1;
        for(int i = 0; i< 10; i++){
            for (int j = 0; j < 10; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }

    static void q8(){
        System.out.println("\n# Question 8");
        int num = 1;
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 10; j++) {
                if(num%2!= 0){
                    System.out.print(num + " ");
                }
                num++;
            }
            System.out.println();
        }
    }

    static void q9(){
        System.out.println("\n# Question 9");
        int num = 1;
        for(int i = 0; i< 5; i++){
            for (int j = 0; j < 10; j++) {
                if(num%2== 0){
                    System.out.print(num + " ");
                }
                num++;
            }
            System.out.println();
        }
    }
    static void q10(){
        System.out.println("\n# Question 10");
        int num = 1;
        for(int i = 0; i< 4; i++){
            for (int j = 0; j <5; j++) {
                if(num <= 50){
                    System.out.print(num + " ");
                    num+=3;
                }
            }
            System.out.println();
        }
    }

    static void q11(){
        System.out.println("\n# Question 11");
        for (int i = 0; i < 6; i++) {
            int num = 65;
            for (int j = 0; j < 5; j++) {
                System.out.print((char)num);
                num++;
            }
            System.out.println();
        }
    }

    static void q12(){
        System.out.println("\n# Question 12");
        int num = 65;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 6; j++) {
                if(num <= 90){
                    System.out.print((char)num);
                    num++;
                }
            }
            System.out.println();
        }
    }

    static boolean isPrime(int n)
    {
        //System.out.println("\n# Check if " + n + " is prime number");
        if (n <= 1)
            return false;
        else if (n == 2){
            return true;
        }
        else if (n % 2 == 0)
            return false;

        for (int i = 3; i <= Math.sqrt(n); i += 2)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    static void printEvenNumbers1to100(){
        System.out.println("\n# Print Even Numbers 1 to 100");
        for(int i = 1; i<= 100; i++){
            if(i%2==0){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void printPrimeNumbers1to100()
    {
        System.out.println("\n# Print Prime Numbers from 1 to 100");
        for(int i = 0; i< 100; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static void printFiabnoicSeries(int max){
        System.out.println("\n# Print Fiabnoic Series");
        int fno = 0;
        int sno = 1;
        System.out.print(fno + " ");
        System.out.print(sno + " ");
        for(int i = 1; i < max; i++){
            if(i == fno + sno){
                System.out.print( i + " ");
                fno = sno;
                sno = i;
            }

        }
        System.out.println();
    }

    static boolean palindrome(String any){
        System.out.println("\n# Palindrome Check '"+any+"'");
        int len = any.length();
        for(int i = 0; i < len/2; i++){
            if(any.charAt(i) != any.charAt(len-i-1)){
                return  false;
            }
        }

        return true;
    }

    static void factorial(int num){
        System.out.println("\n# Factorial " + num);
        int result = (num == 0)? 1 : num;
        for(int i = num-1; i > 0; i--){
            result*=i;
        }
        System.out.println("Result: " + result);
    }

    static void amstrongNumber(int num){
        System.out.println("\n# Check Amstrong Number of " + num);
        int len = (num+"").length();
        int temp = num;
        int result = 0;
        for(int i = 0; i < len; i++){
            int digit = temp % 10;
            result+= Math.pow(digit, len);
            temp = temp /10;
        }

        if (num == result){
            System.out.print("True");
        }else {
            System.out.print("False");
        }
    }

}
