package gfgproblems;
import java.util.*;

class meeting{
    int start;
    int end;
    int pos;
    meeting(int start,int end,int pos){
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}
public class maximummeetinginoneroom {
    public static void main(String[] args) {

        Comparator<meeting> coms = new Comparator<meeting>(){
            @Override
            public int compare(meeting o1,meeting o2){
                //current finish time is greater so sort it
                if(o1.end>o2.end){
                    return 1;
                }
                //Not Sort it
                else if(o1.end < o2.end){
                    return -1;
                }
                //If both the finish time is equal then sort it by their position
                else if(o1.pos>o2.pos){
                    return 1;
                }
                //else nothing to do to sort the position
                return -1;
            }
        };

        ArrayList<meeting> meet = new ArrayList<>();
        meet.add(new meeting(1, 2, 1));
        meet.add(new meeting(3, 4, 2));
        meet.add(new meeting(0, 6,  3));
        meet.add(new meeting(5, 7, 4));
        meet.add(new meeting(8, 9,  5));
        meet.add(new meeting(5, 9,  6));

        Collections.sort(meet,coms);
        for(meeting m: meet){
            System.out.println("Start: "+m.start+" "+"End: "+m.end+" "+"Pos: "+m.pos);
        }

        ArrayList<Integer> ans = new ArrayList<Integer>();

        ans.add(meet.get(0).pos);
        int limit = meet.get(0).end;

        for(int i=1;i<6;i++){
            if(limit < meet.get(i).start){
                limit = meet.get(i).end;
                ans.add(meet.get(i).pos);
            }
        }

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }

    }
}
