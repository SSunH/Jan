package net.chat;

import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

import javax.swing.*;

public class Client02 implements ActionListener, Runnable {

	private Socket socket;
	private ObjectInputStream ois;
	private ObjectOutputStream oos;
	private JFrame jframe; // 윈도우 창
	private JTextField jtf; // 채팅 입력란
	private JTextArea jta; // 채팅 내용 보여주는 객체
	private JLabel jlb1, jlb2; // 라벨
	private JPanel jp1, jp2; // 판넬
	private static String ip; // IP 주소를 저장할 변수
	private String id; // 닉네임 저장할 변수
	private JButton jbtn; // 종료버튼

	public Client02(String argIp, String argId) {
		ip = argIp;
		id = argId;
		jframe = new JFrame("멀티 채팅 ver 1.0");
		// 아래에 붙는 코드
		jp1 = new JPanel();
		jp1.setLayout(new BorderLayout());
		jtf = new JTextField(30); // 30문자
		jbtn = new JButton("종료"); // 종료 버튼 생성
		jp1.add(jbtn, BorderLayout.EAST);
		jp1.add(jtf, BorderLayout.CENTER);
		// 위쪽에 붙이는 판넬 코드
		jp2 = new JPanel(); // 위쪽에 붙는 판넬
		jp2.setLayout(new BorderLayout());
		jlb1 = new JLabel("대화명 : [[" + id + "]]"); // IP주소 : 127.0.0.1
		jlb1.setBackground(Color.YELLOW);
		jlb2 = new JLabel("IP 주소 : " + ip); // IP주소 : 127.0.0.1
		jlb2.setBackground(Color.GREEN);
		jp2.add(jlb1, BorderLayout.CENTER);
		jp2.add(jlb2, BorderLayout.EAST);
		// 프레임에 붙이는 코드
		jta = new JTextArea("", 10, 50);
		jta.setBackground(Color.ORANGE);
		JScrollPane jsp = new JScrollPane(jta, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		jframe.add(jp1, BorderLayout.SOUTH);
		jframe.add(jp2, BorderLayout.NORTH);
		jframe.add(jsp, BorderLayout.CENTER);
		// 감지기 붙이는 코드
		jtf.addActionListener(this);
		jbtn.addActionListener(this);
		// x클릭시 처리하는 코드 등 정의
		jframe.addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				try {
					oos.writeObject(id + "#exit");
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				System.exit(0); // 프로그램종료
			} //익명함수 

			@Override
			public void windowOpened(WindowEvent e) { // 이벤트 처리
				jtf.requestFocus(); // jtf에 포커스를 놓는다.
			}
		}); // 윈도우 이벤트 처리 끝
		jta.setEditable(false); // 편집 X , 채팅 내용 보여주기만 함
		jframe.pack(); // 자동 크기 지정
		jframe.setResizable(false); // 창 크기 변경 X
		jframe.setVisible(true); // 보이기
	} // 생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource(); // 이벤트 발생 위치 열기
		String msg = jtf.getText(); // 채팅 내용 입력 받기
		if (obj == jtf) {
			if (msg == null || msg.length() == 0) {
				// 경고창
				JOptionPane.showMessageDialog(jframe, "글을 쓰세요", "경고", JOptionPane.WARNING_MESSAGE);
			} else { // 내용을 입력하고 엔터한 경우
				try {
					oos.writeObject(id + "#" + msg);
				} catch (Exception ee) {
					ee.printStackTrace();
				}
				jtf.setText(""); // jtf를 지운다.
			} // else : 내용 0
		} else if (obj == jbtn) { // 종료 버튼 클릭
			try {
				oos.writeObject(id + "#exit");
			} catch (Exception ee) {
				ee.printStackTrace();
			}
			System.exit(0);
		}
	}

	public void init() {
		try {
			socket = new Socket(ip, 7000);
			System.out.println("서버에 접속되었습니다... 주인님^^");
			oos = new ObjectOutputStream(socket.getOutputStream());
			ois = new ObjectInputStream(socket.getInputStream());
			Thread t = new Thread(this);
			t.start();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		JFrame.setDefaultLookAndFeelDecorated(true);
		Client02 cc = new Client02("172.30.1.9", "이름이뭐게");
		cc.init();
	}

	@Override
	public void run() {
		String message = null;
		String[] receiveMsg = null;
		boolean isStop = false;
		while (!isStop) {
			try {
				message = (String) ois.readObject(); // 채팅내용
				receiveMsg = message.split("#");
			} catch (Exception e) {
				e.printStackTrace();
				isStop = true; // 반복문 종료로 설정
			}
			System.out.println(receiveMsg[0] + " : " + receiveMsg[1]);
			if (receiveMsg[1].equals("exit")) {
				if (receiveMsg[0].equals(id)) {
					System.exit(0);
				} else {
					jta.append(receiveMsg[0] + "님이 종료했습니다\n");
					// 커서를 현재 채팅 내용의 자리에 보여준다.
					jta.setCaretPosition(jta.getDocument().getLength());
				}
			} else {
				jta.append(receiveMsg[0] + " : " + receiveMsg[1] + "\n"); // 홍길 : 안녕
				// 커서를 현재 채팅 내용의 자리에 보여준다.
				jta.setCaretPosition(jta.getDocument().getLength());
			}
		}
	}

}
