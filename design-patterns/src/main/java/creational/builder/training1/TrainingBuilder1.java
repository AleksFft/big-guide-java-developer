package creational.builder.training1;

public class TrainingBuilder1 {
    public static void main(String[] args) {
        Director director = new Director();
        Builder build1 = new BuildBuilder();
        director.buildBathSauna(build1);
        director.buildReception(build1);

        System.out.println(build1.getResult());

        Director director2 = new Director();
        Builder passportBuilder = new PassportBuilder();
        director2.buildShoppingCenter(passportBuilder);

        System.out.println(passportBuilder.getResult());
    }
}
