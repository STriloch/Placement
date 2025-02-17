class Main{
    public static void main(String[] args) {
        int[] numbers = {3, 2, 3, 1, 2, 9};
        
       
        int[] result = new int[numbers.length];
        int index = 0;

        
        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            
            for (int j = 0; j < index; j++) {
                if (result[j] == numbers[i]) {
                    isDuplicate = true;  
                    break;
                }
            }
            if (!isDuplicate) {
                result[index++] = numbers[i];
            }
        }
        System.out.print("Unique values: ");
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }
    }
}
