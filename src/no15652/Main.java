package no15652;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

	static int m, n;
	static int[] arr_temp;
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws IOException {
		// * 2020-09-14 해결 완료
		// In
		// 4 2
		// Out
		// 1 1
		// 1 2
		// 1 3
		// 1 4
		// 2 2
		// ... 반복
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		arr_temp = new int[m];
		
		dfs(0);
		
		br.close();
		bw.flush();
		bw.close();

	}

	private static void dfs(int cnt) throws IOException {
		
		// 재귀 종료 시점
		if(cnt == m) {
			for (int j = 0; j < m; j++) {
				
				bw.write(String.valueOf(arr_temp[j]));
				
				if(j != m-1)
					bw.write(" ");
			}
			bw.newLine();
			
			return;
		}
		
		for (int i = 1; i <= n; i++) {
			
			// 내림차순인 경우 스킵
			if(cnt != 0 && arr_temp[cnt-1] > i) {
				continue;
			}
			
			arr_temp[cnt] = i;
			dfs(cnt+1);
			
		}
		
	}

}
