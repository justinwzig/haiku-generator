/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package westernhaikus;

import java.util.ArrayList;

/**
 *
 * @author your name
 */
public class HaikuMaker {

    private String text;
    private String haiku;
    private String[] wordList;
    String lineA = null;
    String lineB = null;
    String lineC = null;

    public HaikuMaker(String t) {
        setText(t);
        setHaiku("");
        wordList = text.split(" ");

        this.createHaiku();
    }

    public int random(int min, int max) {
        int num = (int) (Math.random() * ((max - min) + 1) + min);
        return num;
    }

    public void setText(String t) {
        text = t;
    }

    public void setHaiku(String h) {
        haiku = h;
    }

    public String getText() {
        return text;
    }

    public String getHaiku() {
        return haiku;
    }

    public String getWordList() {
        String ans = "";
        for (int c = 0; c < wordList.length; c++) {
            ans = ans + " " + wordList[c];
        }

        return ans;
    }

    public void createHaiku() {

        int numWords = wordList.length;

        int lengthA = random(3, 4);
        int lengthB = random(3, 4);

        int wordA = random(0, numWords - lengthA);
        int wordB = random(0, numWords - lengthB);
        int wordC = random(0, numWords - lengthA);

        if (lengthA == 3) {
            lineA = wordList[wordA] + " " + wordList[wordA + 1] + " " + wordList[wordA + 2];
            lineC = wordList[wordC] + " " + wordList[wordC + 1] + " " + wordList[wordC + 2];
        } else {
            lineA = wordList[wordA] + " " + wordList[wordA + 1] + " " + wordList[wordA + 2] + " " + wordList[wordA + 3];
            lineC = wordList[wordC] + " " + wordList[wordC + 1] + " " + wordList[wordC + 2] + " " + wordList[wordC + 3];

            if (lengthB == 3) {
                lineB = wordList[wordB] + " " + wordList[wordB + 1] + " " + wordList[wordB + 2];
            } else {
                lineB = wordList[wordB] + " " + wordList[wordB + 1] + " " + wordList[wordB + 2] + " " + wordList[wordB + 3];
            }

            haiku = lineA + "\n" + lineB + "\n" + lineC;

        }
    }

    @Override
    public String toString() {
        return "HaikuMaker{" + "text=" + text + ", haiku=" + haiku + '}';
    }

}
