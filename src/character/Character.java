package character;

import emotion.Emotion;
import emotion.Idea;
import exception.NoWordForLetterException;
import interfaces.Goable;
import word.Word;

public abstract class Character implements Goable {
    private String name;
    private Emotion emotion;

    public Character(String name) {
        this.name = name;
    }
    public abstract void thinkAbout();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Emotion getEmotion() {
        return emotion;
    }

    void setEmotion(Emotion emotion) {
        this.emotion = emotion;
        if (emotion.power() > 5){
            System.out.println(name + " испытывает сильное " + emotion.description());
            for (int i=0; i<emotion.description().length(); i++){
                char letter = emotion.description().charAt(i);
                try {
                    System.out.println(letter + " - " + Word.getWordForLetter(letter));
                } catch (NoWordForLetterException e){
                    System.out.println(e.getMessage());
                }
            }
        } else {
            System.out.println(name + " испытывает " + emotion.description());
        }
    }
}
