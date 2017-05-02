/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package westernhaikus;

/**
 *
 * @author your name
 */
public class HaikusTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String text = "This is some sample text yayay dsoffsg im an idiot wow this is dumb eieirt djdjjfur jffurjeufu";
        HaikuMaker hm = new HaikuMaker(text);
        System.out.println("" + hm.getWordList());
        System.out.println("" + hm.getHaiku());
        
    }
    
}
