
public class Playertype {
	private int x,y;
	private int player, type;
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
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getName() {
		if(player==1) {
			if(type==1)
				return "A-P"+name;
			else
				return "A-H"+name;
		}
		else {
			if(type==1)
				return "B-P"+name;
			else
				return "B-H"+name;
		}
	}
	public void setName(String name) {
		this.name = name;
	}
}
