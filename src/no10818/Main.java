package no10818;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// *2020-08-28 �ذ� �Ϸ�
		// N ���� ������ �־��� �� �ּڰ��� �ִ��� ���϶�;
		// �Է�:
		// 5
		// 20 10 35 30 7
		// ���:
		// 7 35
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int cnt = Integer.parseInt(br.readLine());
		
		int min =1000001, max = -1000001;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0; i<cnt; i++) {
			int temp = Integer.parseInt(st.nextToken());
			
			if(temp < min)
				min = temp;
			
			if(temp > max)
				max = temp;
			
		}
		
		System.out.println(min + " " + max);

	}

}
