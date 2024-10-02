package CH22;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class C01inputStreamReaderMain {

	public static void main(String[] args) throws IOException {
		
		OutputStream fout = new FileOutputStream("C:\\TMP_IO\\test.exe");
		fout.write("홍길동".getBytes(StandardCharsets.UTF_8));
		fout.write('a');
		fout.write('b');
		fout.write('c');
		fout.write('d');
		fout.flush();
		fout.close();
		//
		InputStream fin = new FileInputStream("C:\\TMP_IO\\test.exe");
		InputStreamReader subIn = new InputStreamReader(fin);
		
		
		while(true) {
			int data = subIn.read();
			if(data==-1)
				break;
			System.out.print((char)data);
		}

	}

}
