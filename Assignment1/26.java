class Main{
    public static void main(String[] args){
        // int arr[][] = new int[5][];
        int arr[][]={
                        {1,2,3,4,5},
                        {6,7,8},
                        {9,10,11,12},
                        {13,14,15},
                        {16,17}
                    };
        int sum=0;
        for (int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr[i].length  ; j++){
                sum = sum+arr[i][j];
            }
        }
        System.out.println("Sum of array is : " +sum);
    }
}