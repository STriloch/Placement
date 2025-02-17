class Main {
    public static void main(String[] args) {
        String binaryString = "1101100101110";
        int maxCount = 0;
        int currentCount = 0;

        
        for (int i = 0; i < binaryString.length(); i++) {
            if (binaryString.charAt(i) == '1') {
                
                currentCount++;
            } else {
               
                maxCount = Math.max(maxCount, currentCount);
                currentCount = 0;
            }
        }

       
        maxCount = Math.max(maxCount, currentCount);

        System.out.println("Maximum consecutive 1's: " + maxCount);
    }
}
