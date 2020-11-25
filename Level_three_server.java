import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Level_three_server {
	public static void main(String[] args) throws IOException {
		System.out.println("Level - 3 You are in PvP mode");
		//match contains one over
		//for simplicity i am initializing two classes and client one is been playing batting in the first innings
		ServerSocket ss = new ServerSocket(9542);
		Socket s1=null,s2=null;
		DataInputStream di1=null,di2=null;
		DataOutputStream do1=null,do2=null;
		int ss1=0,ss2=0;
		int i = 0;
		while(true) {
			Socket s = null;
			try {
				s=ss.accept();
				DataInputStream dis = new DataInputStream(s.getInputStream());
				DataOutputStream dos = new DataOutputStream(s.getOutputStream());
				if(i==0) {
					s1=s;
					//batsman
					dos.writeUTF("Wait for another player... Hold your bat tight");
					di1=dis;
					do1=dos;
					i++;
				}
				else if(i==1) {
					s2=s;
					//bowler
					dos.writeUTF("Get ready with the ball...");
					di2=dis;
					do2=dos;
					play(di1,do1,di2,do2,ss1,ss2,dis,dos);
					i++;
				}
				else {
					
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	private static void play(DataInputStream di1, DataOutputStream do1, DataInputStream di2, DataOutputStream do2,
			int ss1, int ss2, DataInputStream dis, DataOutputStream dos) throws IOException {
		// TODO Auto-generated method stub
		// player one bats first
		for(int i=0;i<6;i++) {
			String ball_type = di2.readUTF();
			do1.writeUTF(ball_type);
			String ans = di1.readUTF();
			do2.writeUTF(ans);
		}
		String ans = di1.readUTF();
		do2.writeUTF(ans);
		for(int i=0;i<6;i++) {
			String ball_type = di1.readUTF();
			do1.writeUTF(ball_type);
			ans = di2.readUTF();
			do2.writeUTF(ans);
		}
		//second innings over
		ans = di2.readUTF();
		do1.writeUTF(ans);
		String score1 = di1.readUTF();
		String score2 = di1.readUTF();
		ss1 = Integer.parseInt(score1);
		ss2 = Integer.parseInt(score2);
		if(ss1>ss2) {
			do1.writeUTF("You won!!!");
			do2.writeUTF("You lost!!!");
		}
		else if(ss1==ss2) {
			do1.writeUTF("Match draw!!!");
			do2.writeUTF("Match draw!!!");
		}
		else {
			do2.writeUTF("You won!!!");
			do1.writeUTF("You lost!!!");
		}
	}
}
