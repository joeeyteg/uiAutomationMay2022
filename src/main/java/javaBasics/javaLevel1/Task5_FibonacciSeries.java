package javaBasics.javaLevel1;

import org.junit.jupiter.api.Test;

public class Task5_FibonacciSeries {
//    public static void main(String[] args) {

    @Test
    public void FibonacciSeries(){
        System.out.println("Counting following Fibonacci_series till 55:");
        int  i, count=10, value1 = 0, value2 = 1, next_value;
        for(i = 1; i <= count; i++)  {
            if(i <= 1) {
                next_value = i;

            }
            else  {
                next_value = value1 + value2;
                value1 = value2;
                value2 = next_value;

            }
            System.out.println(next_value);
        }
    }

    }

