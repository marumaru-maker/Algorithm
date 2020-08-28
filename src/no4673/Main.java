package no4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// * 2020-08-27 해결 완료
		// 1~10000 까지의 숫자 중 셀프넘버( 자기 숫자 + 각 자리 숫자 로 만들 수 없는 숫자를 출력 )
		// 1) 1~10000 중에서 셀프넘버가 아닌 숫자를 빼기
		// 2) 셀프넘버인 숫자 바로 구해서 출력
		
		// 1) 의 경우 자기자신이 10000을 넘을 때까지 hashset 에 다 넣는다. 그리고 Treeset으로 정렬? 그리고 1부터 해당하는지 체크 후 기억 그리고 해당된다면 제외 후 확인 기준 숫자를 다음 껄로 넘긴다;
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		for(int i=1; i<=10000; i++) {
			int sum = i;
			
			String[] nums = (i + "").split("");
			
			for (String num : nums) {
				sum += Integer.parseInt(num);
			}
			
			if(sum <= 10000)
				hashSet.add(sum);
		}
		
		TreeSet<Integer> treeSet = new TreeSet<>(hashSet);
		
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=1; i<=10000; i++) {
			if(!treeSet.contains(i))
				bw.append(i+"\n");
		}
		
		bw.close();
	}
}
