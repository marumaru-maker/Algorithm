package no9461;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	static long[] arr_result;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// * 2020-08-27 해결 완료
		// 파도반 수열 P(N)은 나선에 있는 정삼각형의 변의 길이이다. P(1)부터 P(10)까지 첫 10개 숫자는 1, 1, 1, 2, 2, 3, 4, 5, 7, 9이다.
		// N이 주어졌을 때, P(N)을 구하는 프로그램을 작성하시오.
		// 첫째 줄에 테스트 케이스의 개수 T가 주어진다. 각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. (1 ≤ N ≤ 100)
		//In:
		//2
		//6
		//12
		//Out:
		//3
		//16
		
		// P(n) = P(n-2) + P(n-3) 이다; 계산해서 나온 값은 배열에 기억한다;
		arr_result = new long[101];
		arr_result[0] = 0;
		arr_result[1] = 1;
		arr_result[2] = 1;
		arr_result[3] = 1;
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringBuilder sb = new StringBuilder();

		int cnt = Integer.parseInt(br.readLine()); // 반복 횟수
		
		for(int i=0; i<cnt; i++) {
			sb.append(solute(Integer.parseInt(br.readLine()))+"\n");
		}
		
		System.out.println(sb.toString());
		
	}

	private static long solute(int num) {
		
		if(arr_result[num] != 0)
			return arr_result[num];
		
		arr_result[num] = solute(num-2) + solute(num-3);
		
		return solute(num-2) + solute(num-3);
	}

}
