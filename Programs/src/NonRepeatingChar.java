public class NonRepeatingChar {

  public static void main(String[] args){
      String string = "aabbcddeefgg";
      char ch = nonRepeating(string);
    System.out.println(ch);
  }
  
  public static char nonRepeating(String str){
      int index=-1;
      char count[] = new char[256];
      for(int i=0; i<str.length(); i++){
          count[str.charAt(i)]++;
      }
      for(int i=0; i<str.length(); i++){
          if(count[str.charAt(i)]==1){
              return str.charAt(i);
          }
      }
      
      return '0';
  }
}
