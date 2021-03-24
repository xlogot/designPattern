package DecoratorPattern.example;

public class HighScoreDecorator extends Decorator {
    public HighScoreDecorator(SchoolReport sr) {
        super(sr);
    }
    private void reportHighScore(){
        System.out.println("这次考试语文最高是75， 数学是78， 自然是80");
    }
    @Override
    public void report(){
        this.reportHighScore();
        super.report();
    }

    @Override
    public void sign(String name) {
        System.out.println("我要代签");
        super.sign(name);
    }
}
