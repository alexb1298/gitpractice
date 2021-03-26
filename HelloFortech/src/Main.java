public class Main
{
    public static void main(String [] args)
    {
        System.out.println("Hello Fortech");

        //create a trainer
        Trainer trainer=new Trainer();
        trainer.setName("Andrea");
        trainer.setAge(24);
        trainer.setRole("Trainer");
        //printing the trainer info
        System.out.println("List of trainers");
        System.out.println(trainer.toString());

        //Crete a trainee
        Trainee trainee=new Trainee(trainer,"Alex");
        //printing the trainee info
        System.out.println(trainee.toString());
    }
}
