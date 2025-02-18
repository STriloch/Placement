class Main {
    public static void main(String[] args) {
       
        String input = "xyzzyxz";
        
        boolean[] seen = new boolean[256]; 
        
        int distinctCount = 0;
        
       
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            if (!seen[ch]) {
                seen[ch] = true;
                distinctCount++;
            }
        }
        
        System.out.println("Number of distinct characters: " + distinctCount);
    }
}
