import java.io.*;
import java.net.Socket;
import java.util.*;

public class Level_three_client_one {
	public static void main(String[] sai) throws IOException{
        try{
            DataInputStream dis;
            DataOutputStream dos;
            Prob p = new Prob();
            try (Scanner scn = new Scanner(System.in)) {
                String send;
                Socket s = new Socket("localhost", 9542);
                Scanner sc = new Scanner(System.in);
                dis = new DataInputStream(s.getInputStream());
                dos = new DataOutputStream(s.getOutputStream());
                int score=0;
                int prev = 0;
                while (true) {
                    String msg = dis.readUTF();
                    System.out.println(msg);
                    for(int i=0;i<6;i++) {
                    	String bt = dis.readUTF();
                    	int b = Integer.parseInt(bt);
                    	switch(b) {
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
                    	dos.writeUTF(score-prev+" runs scored");
                    	prev = score;
                    }
                    //batting over
                    dos.writeUTF("Target is "+score);
                    printtypesofballs();
                    for(int i=0;i<6;i++) {
                    	System.out.println("Select the type ball you wish to bowl");
                    	int type = sc.nextInt();
                    	send = type+"";
                    	dos.writeUTF(send);
                    	msg = dis.readUTF();
                    	System.out.println(msg);
                    }
                    //match over
                    msg = dis.readUTF();
                    System.out.println(msg);
                    dos.writeUTF(score+"");
                    msg = dis.readUTF();
                    System.out.println(msg);
                }
            } 
        }
        catch(IOException | NumberFormatException e){
            System.out.println(e);
        }
	}
	
	private static void printtypesofballs() {
		// TODO Auto-generated method stub
		System.out.println("1 Full toss");
		System.out.println("2 Yorker");
		System.out.println("3 Out-swinger");
		System.out.println("4 In-swinger");
		System.out.println("5 Bouncer");
		System.out.println("6 Slower Ball");
	}
}
