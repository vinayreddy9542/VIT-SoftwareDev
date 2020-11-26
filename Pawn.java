
public class Pawn {
	private int x,y;
	private int player;
	private String name;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public int getPlayer() {
		return player;
	}
	public String getName() {
		if(player==1) {
			return "A-"+name;
		}
		else {
			return "B-"+name;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
