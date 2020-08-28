package no18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// * 2020-08-28 �ذ� �Ϸ�
		/* ���� 6���� ��ɾ �����ϼ���.
		push X: ���� X�� ť�� �ִ� �����̴�.
		pop: ť���� ���� �տ� �ִ� ������ ����, �� ���� ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		size: ť�� ����ִ� ������ ������ ����Ѵ�.
		empty: ť�� ��������� 1, �ƴϸ� 0�� ����Ѵ�.
		front: ť�� ���� �տ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		back: ť�� ���� �ڿ� �ִ� ������ ����Ѵ�. ���� ť�� ����ִ� ������ ���� ��쿡�� -1�� ����Ѵ�.
		
		�Է�:
		15
		push 1
		push 2
		front
		back
		size
		empty
		pop
		pop
		pop
		size
		empty
		pop
		push 3
		empty
		front
		
		���:
		1
		2
		2
		0
		1
		2
		-1
		0
		1
		-1
		0
		3 
		
		*/
		
		StringBuilder sb = new StringBuilder();
		
		// ó���� ��ɾ� ���� �� ��ɾ� �ޱ�
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		// ť ����
		MyQueue queue = new MyQueue();
		
		// ť�� ��ɾ� ������� �Է� �� ��� �� �ױ�
		for(int i=0; i < cnt; i++) {
			String cmd = br.readLine();
			int result = queue.execute(cmd);
			
			if(result == -2)
				continue;
			
			sb.append(result+"\n");
		}
		
		// ���� �� ���
		System.out.println(sb.toString());
	}
	

}

class MyQueue{
	
	LinkedList<Integer> queue = null;
	
	public MyQueue() {

		queue = new LinkedList<>();
	
	}

	public int execute(String cmd) {
		
		int size = queue.size();
		
		if(cmd.startsWith("push")) {
			
			queue.add(Integer.parseInt(cmd.split(" ")[1]));
			
			return -2; // -2 ����̸� ����;
			
		} else if(cmd.startsWith("pop")) {
			
			if(size == 0)
				return -1;
			
			int result = queue.getFirst();
			
			queue.remove(0);
			
			return result;
			
		} else if(cmd.startsWith("front")) {
			
			if(size == 0)
				return -1;
			
			return queue.getFirst();
			
		} else if(cmd.startsWith("back")) {
			
			if(size == 0)
				return -1;
			
			return queue.getLast();
			
		} else if(cmd.startsWith("size")) {
			
			return size;
			
		} else if(cmd.startsWith("empty")) {
			
			if(size == 0)
				return 1;
			
			return 0;
			
		}
		
		return -2;
		
	}
	
}
