public abstract class HogwartsStudents {

    private String name;
    private int magic;
    private int transgression;

    public HogwartsStudents(String name, int magic, int transgression) {
        this.name = name;
        this.magic = magic;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    public int ability() {
        return magic + transgression;
    }

    public void compareHogwarts(HogwartsStudents hogwartsStudents) {
        int ability1 = ability();
        int ability2 = hogwartsStudents.ability();
        if (ability1 > ability2) {
            System.out.println("Студент %s лучше, чем студент %s: %d VS %d%n", getName(),);
        }
    }
}
