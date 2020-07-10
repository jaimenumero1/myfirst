package sessions.Loops;

public class OptionalLabels {
    public static void main(String[] args) {
        //print out  all number between 0 and 10 skip 7
        //optional label - name of the loop.
        //we can use the label after continue and break statement
        //to specify which exact loop we want to apply continue or break to.
       abc: for (int i = 0; i < 10; i++) {
                  if (i == 7){
                        continue abc;
                    }
                  System.out.println(i);
        }
        num: for (int i = 1; i<100; i++) {
                if (i % 13 == 0) {
                    System.out.println(i);
                    break num;
                }
        }
        
        
    }
}
