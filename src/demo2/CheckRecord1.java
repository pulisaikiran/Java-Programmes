package demo2;

class checkRecord1 {
    public static boolean checkRecord(String s) {
    
   int A=0,L=0;
    for (int i=0;i<s.length();i++){
    if (s.charAt(i)=='A') {
    A++;
    L=0;
    }
    else if (s.charAt(i)=='L'){
    L++;
    }
    else {
        L=0;

    }

    if(A>=2 || L>=3){
        return false;
    }
}

    return true;
    
    


    
}
    public static void main (String[] args) 
    { 
    	
    	//String s="PPALLP" This input for true outcome
    	 String s="PPALLL";
    	 boolean result = checkRecord(s);

         System.out.println("Output: " + result);
    }
}
