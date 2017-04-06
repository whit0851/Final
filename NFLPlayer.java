/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author charlesw
 */
public abstract class NFLPlayer implements Celebrator{
	private String  name, position, team;
	private int height, weight, age, number, yards, touchdowns;

	NFLPlayer(String newname, String newposition, String newteam, int newheight, int newweight, int newage, int newnumber, int newyards, int newtouchdowns){
		name=newname;
		position=newposition;
		team=newteam;
		height=newheight;
		weight=newweight;
		age=newage;
		number=newnumber;
		yards=newyards;
		touchdowns=newtouchdowns;
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
	@Override
        public String celebrate() {
        int random = (int)( 4 * Math.random() + 1);
        String celebration;
        switch (random){
            case 1: celebration = " dances to celebrate his draft."; break;
            case 2: celebration = " backflips to celebrate his draft."; break;
            case 3: celebration = " hoots in joy to celebrate his draft."; break;
            case 4: celebration = " highfives himself to celebrate his draft."; break;
            default : celebration = " weeps tears of happiness to celebrate his draft."; break;
        }
        return celebration;   
    }
}

