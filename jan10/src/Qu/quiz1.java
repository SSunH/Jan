package Qu;

public class quiz1 {
   char[][] map = null;
   private int createNum() {
      int num = 0;
      do {         
         num = (int)(Math.random() * 10) + 1;
      } while (num < 5);
      return num;
   }
   
   public void createMap() {
      map = new char[createNum()][createNum()]; 
      //여기서 벽을 만들어주세요.
      for (int i = 0; i < map.length; i++) {
         for (int j = 0; j < map[i].length; j++) {
            if(j == 0 || j == map[i].length - 1 ) {
               map[i][j] = '|';
            } else if(i == 0 || i == map.length - 1){
               map[i][j] = '-';
            } else {
               map[i][j] = '▒';
            }
         }
      }
      //+
      map[0][0] = map[0][map[0].length - 1] = '+';
      map[map.length - 1][0] = map[map.length - 1][map[0].length - 1] = '+';
      
      printMap();
      
      // 만들기
      int position = (int)(Math.random() * 4);
      int x, y = 0;
      do {         
         x = (int)(Math.random() * map.length - 2) + 1;
      } while (x < 1 && x < map.length - 1);
      
      do {         
         y = (int)(Math.random() * map[0].length - 2) + 1;
      } while (y < 1 && y < map[0].length - 1);
      
      System.out.println(position + ":"+ x +":"+ y);
      switch (position) {
      case 0: //북쪽
         map[0][y] = '□';
         break;
      case 1://동쪽
         map[x][map[0].length-1] = '□';
         break;
      case 2://남쪽
         map[map.length - 1][y] = '□';
         break;
      case 3://서쪽
         map[x][0] = '□';
         break;
      }
      
   }
   public void printMap() {
      for (char[] cs : map) {
         for (char c : cs) {
            System.out.print(c);
         }
         System.out.println("");
      }
   }
   
   public static void main(String[] args) {
	   quiz1 t = new quiz1();
      t.createMap();
      t.printMap();
   }
}
//던전 만들기
//랜덤 크기의 배열을 만들고 벽을 만드세요.
//벽은 아래와 같이 가장자리 부분을 막아둡니다.
//+--------+ 배열크기는 실행할 때 마다 달라집니다.
//|        | 벽은 항상 끝쪽에 존재해야 합니다.
//|        | 
//|        | 벽을 다 만들었다면 문도 만들어주세요
//|       문
//+--------+

