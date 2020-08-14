
public class MorningCode13 {
	public static void main(String[] args) {
		int num = 0;
		for(int i = 0; i<10; i++) {
			if(i%2 !=0) // i를 2로 나누었을 때 0이 아닌 값/ 홀수조건인 값 출력
				continue;
			
			System.out.println(i);
		}
		
		
		int n = 0;
		while(true) {
			if(n++ == 5)
				break;
			else if (n == 3)
				continue;
			
			System.out.println("프로그램 진행중...");
		}
		
		int k = 0;
		while (k < 10) {
			int i = 0;
			while (i < 10) {
				i++;
			}

		}

		int sum = 0;
		for (int j = 0; j < 5; j++)
			for (int i = 0; i < 10; i++) {
				sum = sum + i; // sum += 1;
				System.out.println(i);
			}

		int score = 90;
		if (score >= 90) {
			if (score >= 95)
				System.out.println("95이상입니다.");
			else
				System.out.println("90이상입니다.");
		}
	}

}
