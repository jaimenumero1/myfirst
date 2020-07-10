package sessions.arrays;

        import java.util.Arrays;

        public class MultiDimensionalArrays {
        public static void main(String[]args){

//int[]arr=5;//incompatibletypes.

//booleanisS=10;

        int[]arr = new int[4];
        arr[0]=5;//


        int[][]mArray=new int[4][2];//=>createanarrayof4cells
//ineachcellcreatearraywithtwocells.
//mArray[0]=5;incompatibletypes
//mArray[0]=newint[]{9,0};


        int[]arrAtZero= new int[2];
        arrAtZero[0]=5;
        arrAtZero[1]=10;

        mArray[0]=arrAtZero;
        System.out.println(Arrays.toString(mArray[0]));
        System.out.println(Arrays.toString(arrAtZero));


//Task:Populatesecondcell(index)with99,22;
        int[]arrAtOne=new int[2];
        arrAtOne[0]=99;
        arrAtOne[1]=22;
        mArray[1]=arrAtOne;
        System.out.println(Arrays.toString(mArray[1]));

//32,17
        int[]arrAtTwo=new int[2];
        arrAtTwo[0]=32;
        arrAtTwo[1]=17;
        mArray[2]=arrAtTwo;

        System.out.println(Arrays.toString(mArray[2]));


//-19,8
        int[]arrAtThree=new int[2];
        arrAtThree[0]=-19;
        arrAtThree[1]=8;
        mArray[3]=arrAtThree;

        System.out.println(Arrays.toString(mArray[3]));


        System.out.println(mArray[0][0]);
        System.out.println(mArray[1][1]);


        int[][]bigTable=new int[6][];


//printoutthecontentofbigTableinatablelikefashion
//00000
//00000
//00000
//00000
//00000
//00000

        bigTable[0]=new int[5];

        bigTable[0][0]=10;
        bigTable[1][1]=10;
        bigTable[2][2]=10;
        bigTable[3][3]=10;
        bigTable[4][4]=10;
        bigTable[5][4]=10;
        bigTable[0][1]=5;
        bigTable[1][2]=5;
        bigTable[2][3]=5;
        bigTable[3][4]=5;
        bigTable[0][2]=4;
        bigTable[0][3]=12;
        bigTable[0][4]=1;
        bigTable[1][0]=1;
        bigTable[1][3]=13;
        bigTable[1][4]=2;
        bigTable[2][0]=2;
        bigTable[2][1]=1;
        bigTable[2][4]=3;
        bigTable[3][0]=0;
        bigTable[3][1]=5;
        bigTable[3][2]=1;
        bigTable[4][0]=6;
        bigTable[4][1]=2;
        bigTable[4][2]=4;
        bigTable[4][3]=1;
        bigTable[5][0]=7;
        bigTable[5][1]=8;
        bigTable[5][2]=9;
        bigTable[5][3]=3;










        System.out.println("-------------------");
        for(int row = 0;row < bigTable.length;row++){

        for(int col = 0; col < bigTable[row].length;col++){
        System.out.print(bigTable[row][col]+"|");

        }
        System.out.println();
        System.out.println("-------------------");
        }



        System.out.println(1010);//0101->workwithString
        }
        }
