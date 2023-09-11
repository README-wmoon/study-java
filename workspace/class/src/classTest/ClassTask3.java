package classTest;

import java.util.Scanner;

class Student {
	int stuNum;
	int speakNum;
	int engNum;
	int mathNum;
	
	public Student() {
	}
	
	public Student(int stuNum, int speakNum, int engNum, int mathNum) {
		this.stuNum = stuNum;
		this.speakNum = speakNum;
		this.engNum = engNum;
		this.mathNum = mathNum;
	}



	double Sum(int stuNum, int speakNum, int engNum, int mathNum) {
		int sum;
		double avg;
		this.stuNum = stuNum;
		this.speakNum = speakNum;
		this.engNum = engNum;
		this.mathNum = mathNum;
		sum = speakNum + engNum + mathNum;
		avg = sum / 3.0;
		System.out.println(avg);
		
		return avg;
	}
	
}

public class ClassTask3 {
	public static void main(String[] args) {
		Student std1 = new Student();
		std1.Sum(1, 30, 30, 30);
	}
}
