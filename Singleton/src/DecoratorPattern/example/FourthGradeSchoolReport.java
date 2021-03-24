package DecoratorPattern.example;

public class FourthGradeSchoolReport extends SchoolReport {
    public void report() {
        System.out.println("尊敬的XXX家长:");
        System.out.println(" ......");System.out.println(" 语文 62 数学65 体育 98 自然 63");
        System.out.println(" .......");
        System.out.println(" 家长签名： ");
    }
    public void sign(String name) {
        System.out.println("家长签名为： "+name);
    }
}
