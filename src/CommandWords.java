import java.util.HashMap;
import java.util.Set;

/**
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 * 
 * This class holds an enumeration of all command words known to the game.
 * It is used to recognise commands as they are typed in.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2011.07.31
 */

public class CommandWords
{
    // a constant array that holds all valid command words
    /*private static final String[] validCommands = {
        "go", "quit", "look", "take", "help"
    };*/
    private HashMap<String, CommandWord> validCommands;

    /**
     * Constructor - initialise the command words.
     */
    public CommandWords()
    {
        validCommands = new HashMap<>();
        for(CommandWord cw : CommandWord.values()) {
            if(cw!=CommandWord.UNKNOWN) {
                validCommands.put(cw.getWord(), cw);
            }
        }
    }

    public CommandWord getValue(String aString) {
        if(validCommands.containsKey(aString)) {
            return validCommands.get(aString);
        }
        return CommandWord.UNKNOWN;
    }

    public String getCommandWords() {
        String ret = "";
        for(String word : validCommands.keySet()) {
            ret += word + " ";
        }
        return ret.trim();
    }
}
