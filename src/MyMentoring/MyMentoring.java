package MyMentoring;

public class MyMentoring {
public String h ;

public void hello(String h){
    this.h = h;
}
    public static void main(String[] args) {
        MyMentoring myMentoring = new MyMentoring();
        System.out.println(myMentoring);

        myMentoring.h = "hello";




    }

    @Override
    public String toString() {
        return "MyMentoring{" +
                "h='" + h + '\'' +
                '}';
    }
}
