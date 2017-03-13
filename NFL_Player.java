
class player {
	private String height, weight, age, number, yards, touchdowns, interceptions;
	private String name, position, team;

	player(String newname, String newposition, String newteam, String newheight, String newweight, String newage, String newnumber, String newyards, String newtouchdowns, String newinterceptions){
		name=newname;
		position=newposition;
		team=newteam;
		height=newheight;
		weight=newweight;
		age=newage;
		number=newnumber;
		yards=newyards;
		touchdowns=newtouchdowns;
		interceptions=newinterceptions;
	}
	public void setname(String newname){
		name=newname;
	}
	String getname(){
		return name;
	}
	public void setposition(String newposition){
		position=newposition;
	}
	String getposition(){
		return position;
	}
	public void setteam(String newteam){
		team=newteam;
	}
	String getteam(){
		return team;
	}
	public void setheight(String newheight){
		height=newheight;
	}
	String getheight(){
		return height;
	}
	public void setweight(String newweight){
		weight=newweight;
	}
	String getweight(){
		return weight;
	}
	public void setage(String newage){
		age=newage;
	}
	String getage(){
		return age;
	}
	public void setnumber(String newnumber){
		number=newnumber;
	}
	String getnumber(){
		return number;
	}
	public void setcombine(String newyards){
		yards=newyards;
	}
	String getyards(){
		return yards;
	}
	public void settouchdowns(String newtouchdowns){
		touchdowns=newtouchdowns;
	}
	String gettouchdowns(){
		return touchdowns;
	}
	public void setinterceptions(String newinterceptions){
		interceptions=newinterceptions;
	}
	String getinterceptions(){
		return interceptions;
	}
	
}