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
    public String getName(){
        return super.getname();
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
