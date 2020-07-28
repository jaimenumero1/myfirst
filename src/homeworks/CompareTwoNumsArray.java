package homeworks;

public class CompareTwoNumsArray {

    public static void main(String[] args) {

        int [] newArr = {4,2,33,44,88};
        int [] smallerArr = {4,2,33,88};

                        // if indexes are equal you move both indexes forward
                        // if indexes are not equal you move only the index of bigger
                        // array forward

        // The task is to Identify when they are equal and if not equal move only bigger index
        //forward
        
        int indexBigArray = 0;
        int indexSmallArray = 0;

        for(int i = 0; i < newArr.length;i++){
            
            if(newArr[indexBigArray] == smallerArr[indexSmallArray]){
                System.out.println("true");
                indexBigArray++;
                indexSmallArray++;
            }
            else {
                System.out.println("false");
                indexBigArray++;
            }
        }
    }
}
