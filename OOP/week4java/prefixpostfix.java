package week4java;

public class prefixpostfix {
    public static void main(String[] args) {
        /* Prefix Operator */
        int prefixValue = 10;
        System.out.println("Prefix value updates the value in this line"+ ++prefixValue);
        System.out.println("It remains the same in next line" + prefixValue);

        /* postfix operator */
        int postfixValue = 20;
        System.out.println("Postfix value updates the value in next line" + postfixValue++);
        System.out.println("The value changes in this line" + postfixValue);
        
    }
    
}
