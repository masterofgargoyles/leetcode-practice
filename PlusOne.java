class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static int[] plusOne ( int [] digits){
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
      }
    }return digits;}}