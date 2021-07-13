public class Pangram {
    
  public static void main(String[] args){
    String str = "The quick brown Fox jumps";
      ArrayList<Character> missingChar = findMissingChar(str);
      System.out.println(missingChar);
  }
    public static ArrayList<Character> findMissingChar(String str){
        ArrayList<Character> missingChar = new ArrayList<>();
        boolean[] character = new boolean[26];
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)>= 'A' && str.charAt(i)<= 'Z')
                character[str.charAt(i) - 'A'] = true;
            else if(str.charAt(i)>= 'a' && str.charAt(i)<= 'z')
                character[str.charAt(i) - 'a'] = true;
        }
        for(int i=0; i<26; i++){
            if(character[i]==false){
                missingChar.add((char)('a'+i));
            }
        }
        return missingChar;
    }
   
}
