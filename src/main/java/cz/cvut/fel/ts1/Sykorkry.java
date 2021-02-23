package cz.cvut.fel.ts1;

public class Sykorkry {

    public int factorial (int n){
        if (n == 0) return 1;

        int result = n;
        for (int i = 1; i < n; i++){
            result = result * (n-i);
        }
        return result;
    }

}
