import java.util.*;
public class Level_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Level - 2 You are in PvE mode");
		int score = 0;
		Random rand = new Random();
		Prob p = new Prob();
		String[] bowler = {"bowler 1","bowler 2","bowler 3"};
		//level lasts for 3 overs
		for(int i=0;i<3;i++) {
			System.out.println(bowler[i] +" is bolwing");
			for(int j=0;j<6;j++) {
				int ball_type = (int)rand.nextInt(6)+1;
				switch(ball_type) {
					case 1:
						System.out.println("Full toss");
						System.out.println("Probabilities of shots select one ");
						System.out.println("1 Defend "+p.getprob(5, 4));
						System.out.println("2 Run "+p.getprob(7, 4));
						System.out.println("3 Run Fast "+p.getprob(7, 4));
						System.out.println("4 Square Cut "+p.getprob(7, 4));
						System.out.println("5 Helicopter "+p.getprob(8, 4));
						int shot = sc.nextInt();
						switch(shot) {
							case 1:
								if(p.possible(p.getprob(5,4))) {
									System.out.println("0 runs scored");
								}
								else {
									System.out.println("Shot missed");
								}
								break;
							case 2:
								if(p.possible(p.getprob(6,4))) {
									System.out.println("1 runs scored");
									score++;
								}
								else {
									System.out.println("Shot missed");
								}
								break;
							case 3:
								if(p.possible(p.getprob(7,4))) {
									System.out.println("2 runs scored");
									score+=2;
								}
								else {
									System.out.println("Shot missed");
								}
								break;
							case 4:
								if(p.possible(p.getprob(7,4))) {
									System.out.println("4 runs scored");
									score+=4;
								}
								else {
									System.out.println("Shot missed");
								}
								break;
							case 5:
								if(p.possible(p.getprob(8,4))) {
									System.out.println("6 runs scored");
									score+=6;
								}
								else {
									System.out.println("Shot missed");
								}
								break;
						}
						break;
					case 2:
						System.out.println("Yorker");
						System.out.println("Probabilities of shots select one ");
						System.out.println("1 Defend "+p.getprob(5, 3));
						System.out.println("2 Run "+p.getprob(7, 3));
						System.out.println("3 Straight Drive "+p.getprob(6, 3));
						System.out.println("4 Square Cut "+p.getprob(7, 3));
						System.out.println("5 Hook "+p.getprob(7, 3));
						shot = sc.nextInt();
						switch(shot) {
						case 1:
							if(p.possible(p.getprob(5,3))) {
								System.out.println("0 runs scored");
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 2:
							if(p.possible(p.getprob(7,3))) {
								System.out.println("1 runs scored");
								score++;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 3:
							if(p.possible(p.getprob(6,3))) {
								System.out.println("2 runs scored");
								score+=2;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 4:
							if(p.possible(p.getprob(7,3))) {
								System.out.println("4 runs scored");
								score+=4;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 5:
							if(p.possible(p.getprob(7,3))) {
								System.out.println("6 runs scored");
								score+=6;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
					}
						break;
					case 3:
						System.out.println("Out-swinger");
						System.out.println("Probabilities of shots select one ");
						System.out.println("1 Defend "+p.getprob(5, 3));
						System.out.println("2 Run "+p.getprob(7, 3));
						System.out.println("3 Cover Drive "+p.getprob(6, 3));
						System.out.println("4 Pull "+p.getprob(7, 3));
						System.out.println("5 Helicopter "+p.getprob(7, 3));
						shot = sc.nextInt();
						switch(shot) {
						case 1:
							if(p.possible(p.getprob(5,3))) {
								System.out.println("0 runs scored");
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 2:
							if(p.possible(p.getprob(7,3))) {
								System.out.println("1 runs scored");
								score++;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 3:
							if(p.possible(p.getprob(6,3))) {
								System.out.println("2 runs scored");
								score+=2;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 4:
							if(p.possible(p.getprob(7,3))) {
								System.out.println("4 runs scored");
								score+=4;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 5:
							if(p.possible(p.getprob(7,3))) {
								System.out.println("6 runs scored");
								score+=6;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
					}
						break;
					case 4:
						System.out.println("In-swinger");
						System.out.println("Probabilities of shots select one ");
						System.out.println("1 Defend "+p.getprob(5, 2));
						System.out.println("2 Run "+p.getprob(7, 2));
						System.out.println("3 On Drive "+p.getprob(5, 2));
						System.out.println("4 Pull "+p.getprob(7, 2));
						System.out.println("5 Hook "+p.getprob(7, 2));
						shot = sc.nextInt();
						switch(shot) {
						case 1:
							if(p.possible(p.getprob(5,2))) {
								System.out.println("0 runs scored");
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 2:
							if(p.possible(p.getprob(7,2))) {
								System.out.println("1 runs scored");
								score++;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 3:
							if(p.possible(p.getprob(5,2))) {
								System.out.println("2 runs scored");
								score+=2;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 4:
							if(p.possible(p.getprob(7,2))) {
								System.out.println("4 runs scored");
								score+=4;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 5:
							if(p.possible(p.getprob(7,2))) {
								System.out.println("6 runs scored");
								score+=6;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
					}
						break;
					case 5:
						System.out.println("Bouncer");
						System.out.println("Probabilities of shots select one ");
						System.out.println("1 Defend "+p.getprob(5, 4));
						System.out.println("2 Run "+p.getprob(7, 4));
						System.out.println("3 Cover Drive "+p.getprob(6, 4));
						System.out.println("4 Pull "+p.getprob(7, 4));
						System.out.println("5 Hook "+p.getprob(7, 4));
						shot = sc.nextInt();
						switch(shot) {
						case 1:
							if(p.possible(p.getprob(5,4))) {
								System.out.println("0 runs scored");
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 2:
							if(p.possible(p.getprob(7,4))) {
								System.out.println("1 runs scored");
								score++;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 3:
							if(p.possible(p.getprob(6,4))) {
								System.out.println("2 runs scored");
								score+=2;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 4:
							if(p.possible(p.getprob(7,4))) {
								System.out.println("4 runs scored");
								score+=4;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 5:
							if(p.possible(p.getprob(7,4))) {
								System.out.println("6 runs scored");
								score+=6;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
					}
						break;
					case 6:
						System.out.println("Slower Ball");
						System.out.println("Probabilities of shots select one ");
						System.out.println("1 Defend "+p.getprob(5, 2));
						System.out.println("2 Run "+p.getprob(7, 2));
						System.out.println("3 On Drive "+p.getprob(5, 2));
						System.out.println("4 Pull "+p.getprob(7, 2));
						System.out.println("5 Helicopter "+p.getprob(8, 2));
						shot = sc.nextInt();
						switch(shot) {
						case 1:
							if(p.possible(p.getprob(5,2))) {
								System.out.println("0 runs scored");
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 2:
							if(p.possible(p.getprob(7,2))) {
								System.out.println("1 runs scored");
								score++;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 3:
							if(p.possible(p.getprob(5,2))) {
								System.out.println("2 runs scored");
								score+=2;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 4:
							if(p.possible(p.getprob(7,2))) {
								System.out.println("4 runs scored");
								score+=4;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
						case 5:
							if(p.possible(p.getprob(8,2))) {
								System.out.println("6 runs scored");
								score+=6;
							}
							else {
								System.out.println("Shot missed");
							}
							break;
					}
						break;
				}
			}
			System.out.println("Score after "+(i+1)+" is "+score);
		}
		System.out.println(score);
		sc.close();
	}
}
