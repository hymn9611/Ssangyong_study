package chap7.s5.network;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;
//1. Server 접속

//2. 1번 : 점심메뉴
//	 2번 : 저녁메뉴
//	 3번 : 종   료
public class Client2 {

	public static void main(String[] args) {
		
		Socket sc = null;
		OutputStream os = null;
		OutputStreamWriter ow = null;
		BufferedWriter bw = null;
		
		InputStream is = null;
		InputStreamReader ir = null;
		BufferedReader br = null;
		Scanner scanner = new Scanner(System.in);
		
		try {
			sc = new Socket("127.0.0.1", 8282);
			
			os = sc.getOutputStream();
			ow = new OutputStreamWriter(os);
			bw = new BufferedWriter(ow);
			
			is = sc.getInputStream();
			ir = new InputStreamReader(is);
			br = new BufferedReader(ir);
			
			boolean check=true;
			while(check) {
				//서버로 메세지 전송
				System.out.println("1. 점심 메뉴");
				System.out.println("2. 저녁 메뉴");
				System.out.println("1. 종	료");
				int select = scanner.nextInt();
				
//				if(select == 1) {
//					bw.write(select+"\r\n");
//					bw.flush();
//				} else if(select == 2) {
//					bw.write(select+"\r\n");
//					bw.flush();
//				} else {
//					bw.write(select+"\r\n");
//					bw.flush();
//					break;
//				}
				bw.write(select+"\r\n");
				bw.flush();
				if(select > 2) {
					break;
				}
				
				String str = br.readLine();
				System.out.println("메뉴 : " + str);
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
				scanner.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
