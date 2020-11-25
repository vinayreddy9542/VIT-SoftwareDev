import java.util.Random;

public class Prob {
	double getprob(int sm,int bm) {
		double d = 0;
		d = (((sm-bm)*100)/sm);
		return d;
	}
	boolean possible(double p) {
		Random rand = new Random();
		int num = (int)rand.nextInt(100)+1;
		if(num>p) {
			return false;
		}
		return true;
	}
}
