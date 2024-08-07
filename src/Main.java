
public class Main {
    public static void main(String[] args) {

        // Multiples of 3 or 5
        System.out.println("a soma de todos os numeros divisiveis por 3 ou 5 ate 1000 e: "+multiplesOf3Or5());

        //even fibonacci numbers
        System.out.println("a soma dos numeros pares da sequencia de fibonacci que nao exede 4 milhoes e: "+evenFibonacciNumbers());

        //largest prime factor
        System.out.println("o maior numero primo fator de 600851475143 e: "+largestPrime());

    }

    private static int multiplesOf3Or5(){
        int sum=0;
        for (int i = 0; i < 1000; i++){

            if(i%3==0 || i%5==0) {
                sum+=i;
            }

        }
        return sum;
    }

    private static int evenFibonacciNumbers(){
        final int limit=4000000;
        int a=1;
        int b=2;
        int sumOfEvens=0;

        while (a <= limit) {
            if (a%2==0){
                sumOfEvens+=a;
            }

            int next=a+b;
            a=b;
            b=next;
        }
        return sumOfEvens;
    }

    public static int largestPrime() {
        int largest;
        long number = 600851475143l ;

        for (largest = 2; largest <= number; largest++) {
            if (number % largest == 0) {
                number /= largest;
                number = number - largest;

            }
        }
        return largest;
    }
}