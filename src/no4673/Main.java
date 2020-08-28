package no4673;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) throws IOException {
		// * 2020-08-27 �ذ� �Ϸ�
		// 1~10000 ������ ���� �� �����ѹ�( �ڱ� ���� + �� �ڸ� ���� �� ���� �� ���� ���ڸ� ��� )
		// 1) 1~10000 �߿��� �����ѹ��� �ƴ� ���ڸ� ����
		// 2) �����ѹ��� ���� �ٷ� ���ؼ� ���
		
		// 1) �� ��� �ڱ��ڽ��� 10000�� ���� ������ hashset �� �� �ִ´�. �׸��� Treeset���� ����? �׸��� 1���� �ش��ϴ��� üũ �� ��� �׸��� �ش�ȴٸ� ���� �� Ȯ�� ���� ���ڸ� ���� ���� �ѱ��;
		
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
