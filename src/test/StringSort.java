package test;

public class StringSort {
	
	public static String[] solution(String[] strings, int n) {
		
		for(int i=0; i<strings.length; i++) {
			for(int j=i+1; j<strings.length; j++) {
				if(strings[i].charAt(n)>strings[j].charAt(n)) {
					String tmp;
					tmp=strings[i];
					strings[i]=strings[j];
					strings[j]=tmp;
				}
			}
		}
		
        String[] answer = {};
        for(int i=0; i<strings.length; i++) {
        	answer[i]=strings[i];
        }
       
        return answer;
    }
	
	public static void main(String[] args) {
		String[] strings= {"sun", "bed", "car"};
		int n=1;
		
		System.out.println(solution(strings, n));
	}
	
}
