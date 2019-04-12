package animal_shelter;

import java.util.*;

public class Shelter {
private ArrayList<String> a1= new ArrayList<String>();
    private ArrayList<String> t1=new ArrayList<String>();

public void addAnimal(String name, String type){
     a1.add(name);
     t1.add(type);
}


public String getAnimal(){
    String aname = a1.get(0);
    String atype = t1.get(0);
    a1.remove(0);
    t1.remove(0);
return "name: "+ aname + "; type: "+ atype;
}

public String getAnimal(String type){
 //   int x = 0;
    String aname;
    String atype;

        if (type == "dog") {
        for(int x =0; x<t1.size();x++) {
            if (t1.get(x) == "dog") {
                aname = a1.get(x);
                atype = t1.get(x);
                a1.remove(x);
                t1.remove(x);
                return "name: "+ aname + "; type:  " + atype;
            }
        }
    }
    if (type == "cat") {
        for(int x =0; x<t1.size();x++) {
            if (t1.get(x) == "cat") {
                aname = a1.get(x);
                atype = t1.get(x);
                a1.remove(x);
                t1.remove(x);
                return "name: "+  aname + "; type: " + atype;
            }
        }
    }
    return "There is no more of that animal";
}


}











