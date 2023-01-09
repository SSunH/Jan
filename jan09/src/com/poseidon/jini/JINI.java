package com.poseidon.jini;

import java.text.SimpleDateFormat;
import java.util.Calendar;

class JINI {
	boolean isQute = true;
	private String[] hi = new String[] { "1", "안녕하세요", "어서오세요", "반가워요.", "또 오셨군요.", "왔어?", "기다렸어.", "죽었는지 알았다.",
			"밥은 먹고 다니냐?", "꼴을 보니 살아는 있구나", "어서와, 여긴 처음이지?", "자 무엇을 알고 싶나?" };

	// private int count = 0;
	public void scheck(String result) {
		System.out.print("\t");
		A: if (result.equals("안녕") || result.equals("하이")) {
			if (Integer.parseInt(hi[0]) > 2) {
				System.out.println("그만 물어봐. 지치지도 않냐?");
				hi[0] = String.valueOf(Integer.parseInt(hi[0]) - 1);
				break A;
			}
			System.out.println(hi[(int) (Math.random() * (hi.length - 1) + 1)]);
			hi[0] = String.valueOf(Integer.parseInt(hi[0]) + 1);

		} else if (result.equals("날짜") || result.equals("며칠")) {
			// 날짜
			Calendar calender = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
			System.out.println("지금 시간은 " + sdf.format(calender.getTime()) + "입니다.");
		
		} else if (result.equals("시간") || result.equals("몇시")) {
			// 시간
			Calendar calender = Calendar.getInstance();
			SimpleDateFormat sdf = new SimpleDateFormat("HH시 mm분 ss초");
			System.out.println("지금 시간은 " + sdf.format(calender.getTime()) + "입니다.");
		} else if (result.equals("이름") || result.equals("네임")) {
			// 이름	
			System.out.println("지금부터 내 이야기를 하지 \n 내 이야기는 전설같은 이야기야. \n 참으로 다이나믹 하지. \n 아, 참고로 나는 \n 전설따위는 믿지 않아.");

		
		} else if (result.equals("나가기") || result.equals("꺼져")) {
			System.out.println("종료합니다. \n 사용해주셔서 감사합니다. \n 사용료는 500만원 입니다. \n 송금받습니다. \n 거절은 거절합니다.");
			isQute = false;

		} else {
			System.out.println("뭐라하는지 1도 모르겠다. 다시!");
		}
	}
}
