import java.util.*;
public class NFL_Player {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//All of the following are met: Code has proper standards, 
//class has at least 10 properties, class has at least three property types, 
//and properties are documented.
	}

}

class player {
	private double height, weight, age, number, combine, touchdowns, interceptions;
	private String name, position, team;

	player(String newname, String newposition, String newteam, double newheight, double newweight, double newage, double newnumber, double newcombine, double newtouchdowns, double newinterceptions){
		name=newname;
		position=newposition;
		team=newteam;
		height=newheight;
		weight=newweight;
		age=newage;
		number=newnumber;
		combine=newcombine;
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
	public void setheight(double newheight){
		height=newheight;
	}
	double getheight(){
		return height;
	}
	public void setweight(double newweight){
		weight=newweight;
	}
	double getweight(){
		return weight;
	}
	public void setage(double newage){
		age=newage;
	}
	double getage(){
		return age;
	}
	public void setnumber(double newnumber){
		number=newnumber;
	}
	double getnumber(){
		return number;
	}
	public void setcombine(double newcombine){
		combine=newcombine;
	}
	double getcombine(){
		return combine;
	}
	public void settouchdowns(double newtouchdowns){
		touchdowns=newtouchdowns;
	}
	double gettouchdowns(){
		return touchdowns;
	}
	public void setinterceptions(double newinterceptions){
		interceptions=newinterceptions;
	}
	double getinterceptions(){
		return interceptions;
	}
	
}