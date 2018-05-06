package org.JavaHillel2.task33;

public class StringAlg {

    public int getNumberParts(String s) {

        DoOnlyAction <Integer> doOnlyAction = (str) ->{
            char [] chars = str.toCharArray();
            int counter = 0;
            for (char ch: chars) {
                if (ch==','){
                    counter++;
                }
            }
            return counter+1;
        };
       return StringWorker.act(doOnlyAction, s);

    }

}
