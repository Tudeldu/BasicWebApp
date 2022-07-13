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
           return "MyTeam";
        } else if(query.contains("Goethe")){
            return "Johann Wolfgang von Goethe (1771-1832) was a German writer of " +
                    "Germanic origin. Goethe is best known for his works of " +
                    "epistolary fiction, most notably his 1809 translation of " +
                    "the German Bible into English.";
        }else if (query.contains("what is your name?")){
            return("Joe");
        }
        return "";
    }
}
