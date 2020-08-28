package no1712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// * 2020-08-28 해결 완료
		// A = 고정비용
		// B = 가변비용
		// C = 노트북 가격
		// n = 노트북 생산수량
		// 수입이 비용을 넘는 손익분기점을 구하는 프로그램을 작성하시오.
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
