package main.java.core;

/**
 * Created by 71903 on 2017/5/9.
 */
public class ReverseString {
    private StringBuffer sourceString;

    public StringBuffer getSourceString() {
        return sourceString;
    }

    public void setSourceString(String sourceString) {
        this.sourceString = new StringBuffer(sourceString);
    }

    public String getReverseString(){
        return this.sourceString.reverse().toString();
    }
}
