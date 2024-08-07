package gfgproblems;
import java.util.*;

public class validateIP {
    public static void main(String[] args) {
        String ip = "01.01.01.01";

        String sd = "adf.sdf #sd?::f";
        String[] regarr = sd.split("[.]");
        for(String r:regarr){
            System.out.print(r+" ");
        }

        System.out.println();
        String[] arr = ip.split("[.]");

        if(arr.length!=4){
            System.out.println("False");
        }

        for(String s:arr){
            if(s.length()==0){
                System.out.println("In space length(..): False");
            }
            if(s.charAt(0)=='0' && s.length()>1){
                System.out.println("In 01 :False");
            }
            int value = Integer.parseInt(s);
            if(!(value >=0 && value <=255)){

                System.out.println("In greater than 255 :False");
            }
        }

        System.out.println("True");
    }
}
