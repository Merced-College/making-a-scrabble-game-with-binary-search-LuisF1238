//luis FLores Taichi Ite, Hemant Kulkarni, Word Scrabble game

public class Word {
    private String word; 
    //setters and constructors 
    public Word(String word) {
        this.word = word;
    }
    
    public Word() {
        this.word = "no word";
    }
    
    public String getWord(){
        return word; 
    }
}