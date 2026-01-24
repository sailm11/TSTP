package com.kavya;

import java.util.Scanner;
//using Sieve of Eratosthenes
public class countPrimes{

    public static int CountPrimes(int n){
        if(n <= 2) return 0;
        boolean[] composites = new boolean[n];
        int limit = (int)Math.sqrt(n);

        
        for(int i = 2; i<= limit; i++){
            if(!composites[i]);{
                for(int j = i*i; j<n; j+=i){
                    composites[j] = true;
                }
            }
        }
        int primeCount = 0;
        for(int i = 2; i<n; i++){
            if (!composites[i]){
                primeCount++;
            }
        }
        return primeCount;

    }


    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Number of primes less than" + n + " = " + CountPrimes(n));
    }
}
