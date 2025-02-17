class Main{
    public static void main(String[] args) {
        
        int[] arr = {1, 2, 3, 4, 5, 6};
        
        
        int temp;
        
        temp = arr[0];
        arr[0] = arr[2];
        arr[2] = temp;

        temp = arr[3];
        arr[3] = arr[5];
        arr[5] = temp;
  
        System.out.println("Reversed Array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}