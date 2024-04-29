package week4java;

public class forloop {
    public static void main(String[] args) {
        for(int index = 0; index < 4; index ++){
            System.out.println("Looping" + index);

        }

        /* Make the table of the following */
        for(int index = 10; index >=0; index --){
            System.out.println("Looping Decrement" + index);
        }
    }
    
}

/*Intialization
 * Condition
 * Update
 */

 /* Task
  * Use loop to make multiplication table of 2
  2 x 1 = 2
  2 x 2 = 4
  ..
  2 x 10 = 20
  */

  int number = 2;

  for(int index=1; index < 11; index ++) {
    System.out.println(number + "*" + index + "=" + (number*index));
  }

  /*
   */

