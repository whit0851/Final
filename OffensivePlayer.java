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
