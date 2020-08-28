package no2739;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) {
		// * 2020-08-27 �ذ� �Ϸ�
		//N�� �Է¹��� ��, ������ N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ��� ���Ŀ� ���缭 ����ϸ� �ȴ�.
		/* in
		2
		*/
		/* out
		2 * 1 = 2
		2 * 2 = 4
		2 * 3 = 6
		2 * 4 = 8
		2 * 5 = 10
		2 * 6 = 12
		2 * 7 = 14
		2 * 8 = 16
		2 * 9 = 18
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int in = 0;
		
		try {
			in = br.read()-48;
			for(int i=1; i<=9; i++) {
				bw.append(in + " * " + i +" = " + in*i +"\n");
			}
			
			bw.flush();
			bw.close();
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
