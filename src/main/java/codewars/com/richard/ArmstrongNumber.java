package codewars.com.richard;

/** */
public class ArmstrongNumber {

    /**
     * Constructor.
     */
    public ArmstrongNumber() {
    }

    private int order(int num) { 
        int n = 0; 
        while (num != 0) { 
            n++; 
            num = num/10; 
        } 
        return n; 
    }

    private int pow(int x, long y) { 
        if( y == 0) {return 1;}
        if (y%2 == 0) {return pow(x, y/2)*pow(x, y/2); }
        return x*pow(x, y/2)*pow(x, y/2); 
    }

    public boolean isArmstrong(int num) {
        int n = order(num); 
        int temp=num, sum=0; 
        while (temp!=0) { 
            int r = temp%10; 
            sum = sum + pow(r,n); 
            temp = temp/10; 
        }  
        // If satisfies Armstrong condition 
        return (sum == num);
    }

}