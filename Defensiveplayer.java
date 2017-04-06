/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Defensiveplayer extends NFLPlayer implements Celebrator {
private int tackles, sacks, interceptions;

    public Defensiveplayer(String newname, String newposition, String newteam, int newheight, int newweight, int newage, int newnumber, int newyards, int newtouchdowns, int interceptions, int tackles, int sacks) {
        super(newname, newposition, newteam, newheight, newweight, newage, newnumber, newyards, newtouchdowns);
    }
    public void setTackles(int tackles){
        this.tackles = tackles;
    }
    public void setSacks (int sacks){
        this.sacks = sacks;
    }
    public void setinterceptions(int interceptions){
	this.interceptions=interceptions;
    }
    public int getTackles(){
        return tackles;
    }
    public int getSacks(){
        return sacks;
    }
    public int getinterceptions(){
        return interceptions;
	}

    @Override
    public void celebrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
