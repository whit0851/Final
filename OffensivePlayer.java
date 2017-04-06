/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class OffensivePlayer extends NFLPlayer implements Celebrator {
private int passingyrds, rushingyrds;
    public OffensivePlayer(String newname, String newposition, String newteam, int newheight, int newweight, int newage, int newnumber, int newyards, int newtouchdowns, int newinterceptions, int passingyrds, int rushingyrds) {
        super(newname, newposition, newteam, newheight, newweight, newage, newnumber, newyards, newtouchdowns);
    }
    public void setPassingyrds(int passingyrds){
        this.passingyrds = passingyrds;
    }
    public void setRushingyrds(int rushingyrds){
        this.rushingyrds = rushingyrds;
    }
    public int getPassingyrds(){
        return passingyrds;
    }
    public int getRushingyrds(){
        return rushingyrds;
    }

    @Override
    public void celebrate() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
