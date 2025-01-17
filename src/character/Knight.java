package character;

import emotion.Emotion;
import emotion.Idea;
import exception.UnchekedException;

import java.util.Random;

public class Knight extends Character{
    private String order;

    public Knight(String name, String order) {
        super(name);
        this.order = order;
    }

    @Override
    public void goThrowRoad() {
        System.out.println("Рыцарь " + getName() + " ордена " + order + " идет в доспехах после боя вдоль проселочной дороги");
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
