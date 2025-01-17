package emotion;

public enum Idea {
    DEATH("Смерть", false),
    REVOLUTION("Революция", false),
    WIN("Победа", true),
    LOSE("Поражение", false),
    Plague("Чума", false);
    private String ru;
    private boolean isPositive;

    Idea(String ru, boolean isPositive) {
        this.ru = ru;
        this.isPositive = isPositive;
    }

    public String getRu() {
        return ru;
    }

    public void setRu(String ru) {
        this.ru = ru;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setPositive(boolean positive) {
        isPositive = positive;
    }
}
