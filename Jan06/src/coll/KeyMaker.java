package coll;

/* 시리얼키 만들기
* W269N-WFGWX-YVC9B-4J6C9-T83GX와 같은 형식으로
* n은 숫자 a는 영문자
* annna-aaaaa-aaana-nanan-annaa
* 위와 같은 패턴으로 시리얼 만들어서 리스트에 저장하기
* 40개 중복없이 저장 (set 이용)
*/
 

//다시 바꿔봤어요 
public class KeyMaker {
   private final static String pattern = "annna-aaaaa-aaana-nanan-annaa";
   private final static int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
   private final static char[] alpa = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
         'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
   
   private int number() {
	      //각 배열의 길이만큼 돌게 변경     
	      return (int) (Math.random() * number.length);
	   }

	   private char alpabet() {
	      //각 배열의 길이만큼 돌게 변경
	      return alpa[(int) (Math.random() * alpa.length)];
	   }

   public String makeKey() {
      //String key = "";
	   StringBuffer sb = new StringBuffer();
      for (int i = 0; i < pattern.length(); i++) {
         if (pattern.charAt(i) == 'a') { //charAt(i) 문자 배열 불러오기.
           sb.append(alpabet()); 
         } else if(pattern.charAt(i) == 'n'){
        	 sb.append(number()); 
         } else {
        	 sb.append("-"); 
         }
      }
      return sb.toString();
   }

   public static void main(String[] args) {
      KeyMaker key = new KeyMaker();
      String result = key.makeKey();
      System.out.println(result);
   }
}