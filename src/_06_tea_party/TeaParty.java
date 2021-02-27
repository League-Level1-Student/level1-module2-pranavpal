package _06_tea_party;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TeaParty {
    public String welcome(String name, boolean isWoman, boolean isKnighted) {
        if (isKnighted && isWoman)
        	return "Hello Lady " + name;
        else if (isKnighted && !isWoman)
        	return "Hello Sir " + name;
        else if (!isKnighted &&isWoman)
        	return "Hello Ms. " + name;
        else 
        	return "Hello Mr. " + name;  
        	
    }
}


