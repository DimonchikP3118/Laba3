import character.Character;
import character.Knight;
import character.Prince;
import emotion.Idea;

public class Main {
    public static void main(String[] args) {
        Character knight = new Knight("Камелот", "Круглый стол");
        Character prince = new Prince("Энгер","Медальоны");
        knight.goThrowRoad();
        knight.thinkAbout();

        prince.goThrowRoad();
        prince.thinkAbout();
    }
}