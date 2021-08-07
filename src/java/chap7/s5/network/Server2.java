package java.chap7.s5.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Random;

//2. 클라이언트와 접속 성공

//3. 클라이언트로 메세지 수신
//	1 : 점심 메뉴 중에서 하나를 전송
//	2 : 저녁 메뉴 중에서 하나를 전송
//	3 : 프로그램 종료
public class Server2 {

	public static void main(String[] args) {
		//점심메뉴들을 모아넣어보자!!
		ArrayList<String> lunch = new ArrayList<String>();
		lunch.add("김치찌개");
		lunch.add("오므라이스");
		lunch.add("샌드위치");
		lunch.add("치즈라면");
		lunch.add("먹다남은 치킨");
		lunch.add("비빔밥");
		
		//저녁메뉴들을 모아넣어보자!!
		String[] dinner = {"내장탕", "삼겹살", "선지국", "소고기", "곱창", "다이어트"};
		
		//1. 클라이언트 접속 준비
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		Random random = new Random(0);
		
		try {
			System.out.println("==========SERVER==========");
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 기다리는중");
			
			sc = ss.accept();
			System.out.println("Client와 연결 성공");
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			boolean check = true;
			while(check) {
				Calendar calendar = Calendar.getInstance();
				random = new Random(calendar.getTimeInMillis());
				
				String select = br.readLine();
				System.out.println("CLIENT : " + select);
				int num = Integer.parseInt(select);
				String menu = null;
				if(select.equals("1")) {
					int i = random.nextInt(lunch.size());
					menu = lunch.get(i); //ArrayList
				} else if(select.equals("2")) {
					int i = random.nextInt(dinner.length);
					menu = dinner[i]; //Array
				} else {
					break;
				}
				
				bw.write(menu+"\r\n");
				bw.flush();
			}//while
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				ir.close();
				is.close();
				bw.close();
				ow.close();
				os.close();
				sc.close();
				ss.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
