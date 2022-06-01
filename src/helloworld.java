public class helloworld{
	public static int[] calculate(int times) {//caculate라는 배열을 만듬, times로 입력받고 int[]로 출력한다.
		int[] result = new int[9];
		for(int i=0; i < result.length; i++) {
			result[i] = times * (i + 1);
		}
		return result;
	}
	
	public static void print(int[] result){//출력은 없고 입력만 있는 것이다.
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 2; i < 10; i++) {
			int[] result = calculate(i);
			print(result);
		}
	}
}