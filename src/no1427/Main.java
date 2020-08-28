package no1427;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {

	public static void main(String[] args) throws IOException {

		// * 2020-08-28 �ذ� �Ϸ�
		//ù° �ٿ� �ڸ����� ������������ ������ ���� ����Ѵ�.
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int original_num = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		while(original_num != 0 ) {
			
			nums.add(original_num % 10);
			
			original_num /= 10;
		}
		
		nums.sort(null);
		
		
		for(int i=nums.size()-1; i>=0; i--)
			sb.append(nums.get(i));
		
		System.out.println(sb.toString());
		
		br.close();
	}
}
