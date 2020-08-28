package no1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// * 2020-08-28 �ذ� �Ϸ�
		// A = �������
		// B = �������
		// C = ��Ʈ�� ����
		// n = ��Ʈ�� �������
		// ������ ����� �Ѵ� ���ͺб����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// (C-B)*n > A
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		int n = -1;
		if((C-B) > 0)
			n =  A /(C-B) +1;
		
		System.out.println(n);
	}
}
