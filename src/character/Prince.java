package character;

import emotion.Emotion;
import emotion.Idea;
import exception.UnchekedException;

import java.util.Random;

public class Prince extends Character{
    private String house;

    public Prince(String name, String house) {
        super(name);
        this.house = house;
    }

    @Override
    public void goThrowRoad() {
        System.out.println("Принц " + getName() + " из дома " + house + " скачет на коне вдоль дороги");
    }

    private static Idea getRandomIdea() {
        Idea[] ideas = Idea.values();
        Random random = new Random();
        int randomIndex = random.nextInt(ideas.length);
        return ideas[randomIndex];
    }
    @Override
    public void thinkAbout() {
        Idea idea = getRandomIdea();
        System.out.println(getName() + " думает над темой: \n" + idea.getRu() + "!!!");
        try {
            setEmotion(Emotion.generateEmotion(idea));
        } catch (UnchekedException e){
            System.out.println(e.getMessage());
        }
    }
}
