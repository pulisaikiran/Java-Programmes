package demo2;


class numJewelsInStones1 {
    public static int JewelsInStones(String jewels, String stones) {
    	
          int counter = 0;
          for(int i = 0; i < jewels.length(); i++){
             for(int j = 0; j < stones.length(); j++){
                 if(jewels.charAt(i) == stones.charAt(j)){
                     counter++;
                 }
             }
          }

          return counter;
    }

     public static void main (String[] args) 
    { 
    	 String Jewels="aA";
     	String Stones = "aAAbbbb";
     	int result = JewelsInStones(Jewels, Stones);

        System.out.println("Output: " + result);
     	
    }
}