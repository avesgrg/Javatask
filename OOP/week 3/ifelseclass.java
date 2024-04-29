public class ifelseclass {
    public static void main(String[] args){
        /* If statement */
        if(true){
            System.out.println("True Statement");
        }
    
    // The parenthesis takes a boolean expression 
        int num1 = 10, num2 = 20;
        if(num1 == num2){
            System.out.println("Equal");
        }else{
            System.out.println("Not Equal");
        }

        /* Note that the else statement is always optional */

        /* If else if */
        if(num1 == num2){
            System.out.println("Equal");
        }else{
            System.out.println("Lesser");
        }{
            System.out.println("Greater");
        }
        /* Note that else should be at the last when using else if */
        /* If else if ladder */
        if(num1 == num2){
            System.out.println("Equal");
        }else if(num1 > num2){
            System.out.println("Greater");
        }else if(num1 != num2){
            System.out.println("Not equal");
        }else if(num1 > 0){
            System.out.println("Positive");
        }else{
            System.out.println("Default statement");
        }
        /* When a condition is matched it will skip all the remaining statement */
        /* Nested if else */
        if(num1 > 0){
            if(num1 > num2){
                System.out.println("Positive greater");
            }else{
                System.out.println("Positive lesser");
            }
        }else{
            if(num1 > num2){
                System.out.println("Negative greater");
            }else{
                System.out.println("Negative lesser");
            }
        }
    }
}
