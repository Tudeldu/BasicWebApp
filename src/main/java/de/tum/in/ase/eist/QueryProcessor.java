package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
           return "Joe";
        } else if(query.contains("Goethe")){
            return "Johann Wolfgang von Goethe (1771-1832) was a German writer of " +
                    "Germanic origin. Goethe is best known for his works of " +
                    "epistolary fiction, most notably his 1809 translation of " +
                    "the German Bible into English.";
        }else if(query.contains("largest")){
            query=query.replaceAll("[^0-9]+", " ");
            String[] arr=query.split(" ");
            int out=Integer.parseInt(arr[0]);
            for (String string : arr) {
                if(out<Integer.parseInt(string)){
                    out=Integer.parseInt(string);
                }   
            }
            return ""+out;

        }else if(query.contains("plus")){
            query=query.replaceAll("[^0-9]+", " ");
            String[] arr=query.split(" ");
            int sum=0;
            for (String string : arr) {
                sum+=Integer.parseInt(string);
            }
            return ""+sum;
        }else if(query.contains("square")&&query.contains("cube")){
            query=query.replaceAll("[^0-9]+", " ");
            String[] arr=query.split(" ");
            int out=0;
            for (String string : arr) {
                out=Integer.parseInt(string);
                int sqrt=(int)Math.sqrt(Math.sqrt(out));
                sqrt=(int)Math.pow(sqrt, 4);
                if(sqrt==out){
                    return ""+out;
                }
            }
            return "none";
        }else if(query.contains("multiplied")){
            query=query.replaceAll("[^0-9]+", " ");
            String[] arr=query.split(" ");
            int out=1;
            for (String string : arr) {
                out*=Integer.parseInt(string);
            }
            return ""+out;
        }
        return "";
    }
}
