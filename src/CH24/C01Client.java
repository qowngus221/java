package CH24;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class C01Client {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket server = new Socket("192.168.5.60",7000);
		InputStream in = server.getInputStream();
		DataInputStream din = new DataInputStream(in);
		String recv = din.readUTF();
		System.out.println("서버 메서지 : " + recv);
		
		din.close();
		in.close();
		server.close();
	}
}

