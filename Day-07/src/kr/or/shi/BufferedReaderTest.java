package kr.or.shi;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//BufferedReader
//보조스트림(필터스트림)
public class BufferedReaderTest {

	public static void main(String[] args) {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("fileReader.txt");
			br = new BufferedReader(fr);
			
			String msg = null;
			while((msg = br.readLine()) != null) {
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
		finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
