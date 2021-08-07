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
import java.util.Scanner;

public class Server1 {

	public static void main(String[] args) {
		//Server용
		//클라이언트는 서버의 ID를 알고 있다는 가정
		
		/* 패킷(packet)
		 * 		client				server
		 * ip	1.1.1.1				2.2.2.2
		 * 
		 * client -> server 패킷
		 * SIP		DIP			SP			DP			Data
		 * 1.1.1.1:	2.2.2.2		랜덤(1)	:	80
		 * 
		 * client <- server 패킷
		 * SIP		DIP			SP			DP			Data
		 * 2.2.2.2: 1.1.1.1		80		:	1
		 */
		
		//Client 연결 요청이 오면 1:1 Socket을 생성해주는 Server Socket이 있다.
		Scanner scanner = new Scanner(System.in);
		ServerSocket ss = null;
		Socket sc = null;
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		try {
			ss = new ServerSocket(8282);
			System.out.println("Client 접속 기다리는중");
			
			sc = ss.accept();
			System.out.println("CLIENT와 연결 성공");
			
			boolean check = true;
			
			while(check) {
				is = sc.getInputStream();
				ir = new InputStreamReader(is);
				br = new BufferedReader(ir);
				
				String message = br.readLine();
				System.out.println("Client에서 보낸 메세지");
				System.out.println("Client : " + message);
				
				if(message.toUpperCase().equals("Q")) {
//					break;
					//check = !check 입력시 q를 입력받고 바로 종료되는 것이 아니라 while문 끝까지 진행하고 종료된다.
					//종료하려는 의도이지만 클라이언트에게 메세지를 보내게 된다는 의미이다.
					//그래도 false를 써야겠다면 아래와 같이 continue;를 사용하면 된다.
					check = false;
					continue;
				}
				
				System.out.println("Client에게 보낼 메세지 입력");
				message = scanner.nextLine();
				//message를 클라이언트에게 전
				
				os = sc.getOutputStream();
				ow = new OutputStreamWriter(os);
				bw = new BufferedWriter(ow);
				bw.write(message+"\r\n");
				bw.flush();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				//순서대로 잘 닫을것...
				bw.close();
				ow.close();
				os.close();
				br.close();
				ir.close();
				is.close();
				sc.close();
				ss.close();
				scanner.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
