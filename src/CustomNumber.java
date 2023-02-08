import java.util.Random;

public class CustomNumber {
	public int number;
	public CustomNumber(){
		this.number= (int) (Math.random()*(12-1+1)+1);
	}
	public void multiplicationTable(){
		for (int i = 0; i < 12; i++){
			System.out.println(number+" * "+(i+1)+" = "+((i+1)*number));
		}
	}
}
