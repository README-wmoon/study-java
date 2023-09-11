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

		
		
//		���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
//		��� ���: ���� ��ġ�� ���� ����Ǵ� ���, .., ., ./a, a
		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));		
//		bufferedWriter.write("�ѵ���");
//		bufferedWriter.close();
		
		BufferedReader bufferedReader = null; 
		
		String content = new String(Files.readAllBytes(Paths.get("test.txt")));
		System.out.println(content);													// �ٹٲ� �Ȱ�
		
			try {
				bufferedReader = new BufferedReader(new FileReader("test.txt"));
				String line = null;
				bufferedReader.readLine();
				
				while((line = bufferedReader.readLine()) != null) {
					System.out.print(line);												// �ٹٲ��� �������� ���Ѵ�.
				}
				
			} catch (FileNotFoundException e) {
				System.out.println("������ ã�� �� �����ϴ�.");
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
			file.delete();						// delete�� �ϸ� ���������� �ʴ´� ��? -> ���� closed�� ���ޱ� ������			
		}
		
	}
}
