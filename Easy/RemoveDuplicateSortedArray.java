class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
  }

  public static int removeDuplicate(int[] a){
    if(a.length==0){
      return 0;
    }
    int j=0;
    for (int i=0;i<a.length;i++){
      if(a[i]!=a[i+1]){
        a[j++] = a[i];
      }
    }
    return j;
  }
}