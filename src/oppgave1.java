public class oppgave1 {
  public static void main(String [] args){
      int [] a = {8,4,17,10,6,20,1,20,15,3,18,9,2,7,19};
      int min_index = min(a);
      int max_index = max(a);
      System.out.println("min index er"+min_index);
      System.out.println("min verdi er "+a[min_index]);
      System.out.println("max index er"+max_index);

  }
  static int min(int [] a){
      int min_value= a[0];
      int min_index = 0;
      for (int i = 1; i<a.length;i++){
          int valu = a[i];
          int index = i;
          if (valu<min_value){
              min_value = valu;
              min_index= index;
          }
      }

      return min_index;
  }
  static  int max(int [] a){
      int max_val = a[0];
      int max_index = 0;
      for (int i =1;i<a.length;i++){
          int val= a[i];
          int index = i;
          if (val>=max_val){
              max_val= val;
              max_index = index;
          }
      }
      return max_index;
  }
}
