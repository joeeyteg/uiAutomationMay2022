package javaBasics.javaLevel1;

public class Task5_PrimeNumbers {
    public static void main(String[] args) {
        int p, number, count;

        System.out.println("The Prime Numbers from 1 to 20 are :");
        for(number = 1; number <= 20; number++)
        {
            count = 0;
            for (p = 2; p <= number/2; p++)
            {
                if(number % p == 0)
                {
                    count++;
                    break;
                }
            }
            if(count == 0 && number != 1 )
            {
                System.out.print(number + " ");
            }
        }
    }


    }

