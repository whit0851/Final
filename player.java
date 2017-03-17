
 class player {
	private String  name, position, team;
	private int height, weight, age, number, yards, touchdowns, interceptions;

	player(String newname, String newposition, String newteam, int newheight, int newweight, int newage, int newnumber, int newyards, int newtouchdowns, int newinterceptions){
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
	public void setheight(int newheight){
		height=newheight;
	}
	int getheight(){
		return height;
	}
	public void setweight(int newweight){
		weight=newweight;
	}
	int getweight(){
		return weight;
	}
	public void setage(int newage){
		age=newage;
	}
	int getage(){
		return age;
	}
	public void setnumber(int newnumber){
		number=newnumber;
	}
	int getnumber(){
		return number;
	}
	public void setcombine(int newyards){
		yards=newyards;
	}
	int getyards(){
		return yards;
	}
	public void settouchdowns(int newtouchdowns){
		touchdowns=newtouchdowns;
	}
	int gettouchdowns(){
		return touchdowns;
	}
	public void setinterceptions(int newinterceptions){
		interceptions=newinterceptions;
	}
	int getinterceptions(){
		return interceptions;
	}
	
}