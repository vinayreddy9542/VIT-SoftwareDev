import java.util.*;
public class Level_one_day_two {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pawn[][] arr = new Pawn[5][5];
		Pawn[] on = new Pawn[5];
		Pawn[] tw = new Pawn[5];
		//getting input from player one
		boolean t = true;
		while(t) {
			System.out.println("Enter your pawn order separated by space(Sample: 2 3 1 5 4)");
			String one = sc.nextLine();
			String[] oo = one.split(" ");
			if(oo.length!=5) {
				System.out.println("Enter exact five values separated by space");
				continue;
			}
			int i=0;
			int num = 0;
			for(i=0;i<5;i++) {
				int n = Integer.parseInt(oo[i]);
				if(n>=1 && n<=5) {
					Pawn p = new Pawn();
					p.setPlayer(1);
					p.setX(0);
					p.setY(i);
					p.setName("P"+n);
					arr[0][i]=p;
					num+=n;
					on[n-1]=p;
				}
				else {
					System.out.println("values should be between 1 and 5");
					break;
				}
			}
			if(i==5) {
				t = false;
			}
			if(i!=5 || num!=15) {
				t=true;
				on = new Pawn[5];
				arr=new Pawn[5][5];
			}
		}
		print(arr);
		//player B
		Pawn[][] temp = arr;
		t = true;
		while(t) {
			System.out.println("Enter your pawn order separated by space(Sample: 2 3 1 5 4)");
			String one = sc.nextLine();
			String[] oo = one.split(" ");
			if(oo.length!=5) {
				System.out.println("Enter exact five values separated by space");
				continue;
			}
			int i=0;
			int num=0;
			for(i=0;i<5;i++) {
				int n = Integer.parseInt(oo[i]);
				if(n>=1 && n<=5) {
					Pawn p = new Pawn();
					p.setPlayer(2);
					p.setX(4);
					p.setY(i);
					p.setName("P"+n);
					arr[4][i]=p;
					num+=n;
					tw[n-1]=p;
				}
				else {
					System.out.println("values should be between 1 and 5");
					break;
				}
			}
			if(i==5) {
				t = false;
			}
			if(i!=5 || num!=15) {
				t=true;
				tw = new Pawn[5];
				arr=temp;
			}
		}
		print(arr);
		int p1 = 5,p2=5;
		while(p1>0 && p2>0) {
			//player one plays
			System.out.println("Board status : ");
			print(arr);
			System.out.println("player A Choose your player number : ");
			int n = sc.nextInt();
			n--;
			temp = arr;
			int pp1=p1;
			boolean play = true;
			if(n<5 && on[n]!=null) {
				System.out.println("choose 1.Up 2.Down 3.Left 4.Right");
				int k = sc.nextInt();
				Pawn p = on[n];
				int x = p.getX();
				int y = p.getY();
				switch(k) {
				case 1:
					if(x==4) {
						play = false;
						System.out.println("Can't move above");
					}
					else {
						Pawn pt = arr[x+1][y];
						if(pt==null) {
							arr[x][y]=null;
							p.setX(x+1);
							arr[x+1][y]=p;
						}
						else if(pt.getPlayer()==2) {
							arr[x+1][y]=p;
							int pl = Integer.parseInt(pt.getName().charAt(2)+"");
							tw[pl-1]=null;
							p.setX(x+1);
							arr[x][y]=null;
							p2--;
						}
						else {
							play = false;
							System.out.println("Can't kill your own player");
						}
					}
					break;
				case 2:
					if(x==0) {
						play = false;
						System.out.println("Can't move above");
					}
					else {
						Pawn pt = arr[x-1][y];
						if(pt==null) {
							arr[x][y]=null;
							p.setX(x-1);
							arr[x-1][y]=p;
						}
						else if(pt.getPlayer()==2) {
							arr[x+1][y]=p;
							int pl = Integer.parseInt(pt.getName().charAt(2)+"");
							tw[pl-1]=null;
							p.setX(x+1);
							arr[x][y]=null;
							p2--;
						}
						else {
							play = false;
							System.out.println("Can't kill your own player");
						}
					}
					break;
				case 3:
					if(y==4) {
						play = false;
						System.out.println("Can't move above");
					}
					else {
						Pawn pt = arr[x][y+1];
						if(pt==null) {
							arr[x][y]=null;
							p.setY(y+1);
							arr[x][y+1]=p;
						}
						else if(pt.getPlayer()==2) {
							arr[x][y+1]=p;
							int pl = Integer.parseInt(pt.getName().charAt(2)+"");
							tw[pl-1]=null;
							p.setY(y+1);
							arr[x][y]=null;
							p2--;
						}
						else {
							play = false;
							System.out.println("Can't kill your own player");
						}
					}
					break;
				case 4:
					if(y==0) {
						play = false;
						System.out.println("Can't move above");
					}
					else {
						Pawn pt = arr[x][y-1];
						if(pt==null) {
							arr[x][y]=null;
							p.setY(y-1);
							arr[x][y-1]=p;
						}
						else if(pt.getPlayer()==2) {
							arr[x][y-1]=p;
							int pl = Integer.parseInt(pt.getName().charAt(2)+"");
							tw[pl-1]=null;
							p.setY(y-1);
							arr[x][y]=null;
							p2--;
						}
						else {
							play = false;
							System.out.println("Can't kill your own player");
						}
					}
					break;
				default : 
					play=false;
					System.out.println("Choose correct option");
					break;
				}
			}
			else {
				play=false;
				System.out.println("Choose correct player");
			}
			//player two plays
			if(play) {
				System.out.println("Board status : ");
				print(arr);
				System.out.println("player B Choose your player number : ");
				n = sc.nextInt();
				n--;
				if(n<5 && tw[n]!=null) {
					System.out.println("choose 1.Up 2.Down 3.Left 4.Right");
					int k = sc.nextInt();
					Pawn p = tw[n];
					int x = p.getX();
					int y = p.getY();
					switch(k) {
					case 1:
						if(x==0) {
							play = false;
							System.out.println("Can't move above");
						}
						else {
							Pawn pt = arr[x-1][y];
							if(pt==null) {
								arr[x][y]=null;
								p.setX(x-1);
								arr[x-1][y]=p;
							}
							else if(pt.getPlayer()==1) {
								arr[x-1][y]=p;
								int pl = Integer.parseInt(pt.getName().charAt(2)+"");
								on[pl-1]=null;
								p.setX(x-1);
								arr[x][y]=null;
								p1--;
							}
							else {
								play = false;
								System.out.println("Can't kill your own player");
							}
						}
						break;
					case 2:
						if(x==4) {
							play = false;
							System.out.println("Can't move above");
						}
						else {
							Pawn pt = arr[x+1][y];
							if(pt==null) {
								arr[x][y]=null;
								p.setX(x+1);
								arr[x+1][y]=p;
							}
							else if(pt.getPlayer()==1) {
								arr[x+1][y]=p;
								int pl = Integer.parseInt(pt.getName().charAt(2)+"");
								on[pl-1]=null;
								p.setX(x+1);
								p1--;
								arr[x][y]=null;
							}
							else {
								play = false;
								System.out.println("Can't kill your own player");
							}
						}
						break;
					case 3:
						if(y==0) {
							play = false;
							System.out.println("Can't move above");
						}
						else {
							Pawn pt = arr[x][y-1];
							if(pt==null) {
								arr[x][y]=null;
								p.setY(y-1);
								arr[x][y-1]=p;
							}
							else if(pt.getPlayer()==1) {
								arr[x][y-1]=p;
								p1--;
								int pl = Integer.parseInt(pt.getName().charAt(2)+"");
								on[pl-1]=null;
								p.setY(y-1);
								arr[x][y]=null;
							}
							else {
								play = false;
								System.out.println("Can't kill your own player");
							}
						}
						break;
					case 4:
						if(y==4) {
							play = false;
							System.out.println("Can't move above");
						}
						else {
							Pawn pt = arr[x][y+1];
							if(pt==null) {
								arr[x][y]=null;
								p.setY(y+1);
								arr[x][y+1]=p;
							}
							else if(pt.getPlayer()==1) {
								arr[x][y+1]=p;
								int pl = Integer.parseInt(pt.getName().charAt(2)+"");
								on[pl-1]=null;
								p.setY(y+1);
								arr[x][y]=null;
							}
							else {
								play = false;
								System.out.println("Can't kill your own player");
							}
						}
						break;
					default : 
						play=false;
						System.out.println("Choose correct option");
						break;
					}
				}
				else {
					play=false;
					System.out.println("Choose correct player");
				}
				
				if(!play) {
					arr=temp;
					p1=pp1;
				}
			}
		}
		print(arr);
		if(p1>p2) {
			System.out.println("Player 1 wins");
		}
		else {
			System.out.println("Player 2 wins");
		}
		sc.close();
	}
	private static void print(Pawn[][] arr){
		System.out.println("-------Player A-------");
		for(int i=0;i<5;i++) {
			for(int j=0;j<5;j++) {
				if(arr[i][j]==null) {
					System.out.print("  -  ");
				}
				else {
					System.out.print(arr[i][j].getName()+" ");
				}
			}
			System.out.println();
		}
		System.out.println("-------Player B-------");
	}
}
