package no18258;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
	
		// * 2020-08-28 해결 완료
		/* 다음 6가지 명령어를 구현하세요.
		push X: 정수 X를 큐에 넣는 연산이다.
		pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		size: 큐에 들어있는 정수의 개수를 출력한다.
		empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
		front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		
		입력:
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
		
		출력:
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
		
		// 처음에 명령어 개수 및 명령어 받기
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int cnt = Integer.parseInt(br.readLine());
		
		// 큐 생성
		MyQueue queue = new MyQueue();
		
		// 큐에 명령어 순서대로 입력 후 출력 값 쌓기
		for(int i=0; i < cnt; i++) {
			String cmd = br.readLine();
			int result = queue.execute(cmd);
			
			if(result == -2)
				continue;
			
			sb.append(result+"\n");
		}
		
		// 종료 시 출력
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
			
			return -2; // -2 출력이면 무시;
			
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
