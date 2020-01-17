package book.java7.chapter4;
public class AssertionSample {
    private int score;
    private void printScore() {
        assert (score >= 0) : "成績錯誤 ! score = " + score;
        if(score >= 60) {
            System.out.println(score + " 是及格的分數 !");
        }
        else {
            System.out.println(score + " 是不及格的分數 !");
        }
    }
    public void setScore(int score) {
        this.score = score;
    }    
    public static void main(String[] args) {
        AssertionSample score = new AssertionSample();
        score.setScore(-170);
        score.printScore();
    }
}
