package fileTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileTest {
	
//	public void test() throws IOException {
//		
//	}
	
	public static void main(String[] args) throws IOException {
		FileTest fileTest = new FileTest();
//		try {
//			fileTest.test();
//		} catch (IOException e) {;}

		
		
//		절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//		상대 경로: 현재 위치에 따라 변경되는 경로, .., ., ./a, a
		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));		
//		bufferedWriter.write("한동석");
//		bufferedWriter.close();
		
		BufferedReader bufferedReader = null; 
		
		String content = new String(Files.readAllBytes(Paths.get("test.txt")));
		System.out.println(content);													// 줄바꿈 된거
		
			try {
				bufferedReader = new BufferedReader(new FileReader("test.txt"));
				String line = null;
				bufferedReader.readLine();
				
				while((line = bufferedReader.readLine()) != null) {
					System.out.print(line);												// 줄바꿈을 가져오지 못한다.
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("파일을 찾을 수 없습니다.");
			} finally {
				try {
					if(bufferedReader != null) {
						bufferedReader.close();
					}
				} catch (IOException e) {
					throw new RuntimeException(e);
				}
			}
		
		File file = new File("text.txt");
		if(file.exists()) {
			file.delete();						// delete를 하면 지워지지가 않는다 왜? -> 파일 closed를 안햇기 떄문에			
		}
		
	}
}
