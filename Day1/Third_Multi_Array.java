import java.util.Scanner;

class Third_Multi_Array{
    public static void main(String args[]){

        System.out.println(" Multi Diamentional Arry : ");
        int arr[][] = {
                            {1,2,3,4},
                            {11,22,33,44},
                            {111,222,333,444}
                        };
        for (int i=0 ; i < arr.length ;i++){
            for(int j=0 ; j < arr.length ; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println("");
        }

        int arr1[][];
        arr1 = new int[3][3];
        Scanner scan = new Scanner(System.in);

        for(int i=0 ;i<3;i++){
            for(int j=0;j<3;j++){
                 arr1[i][j] = scan.nextInt();
            }
        }
        for(int i=0 ;i<3;i++){
            for(int j=0;j<3;j++){
               System.out.print(" " + arr1[i][j]);
            }
            System.out.println("");
        }

    }
    
}