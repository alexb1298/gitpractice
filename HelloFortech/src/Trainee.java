public class Trainee {
    private Trainer trainer;
    private String name;

    public Trainee(Trainer trainer, String name) {
        this.trainer = trainer;
        this.name = name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "List of trainees \n"+"Trainee{" +
                "trainer=" + trainer +
                ", name='" + name + '\'' +
                '}'+"\n";
    }
}
