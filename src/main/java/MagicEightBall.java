public class MagicEightBall {

    private String[] answers;

    public MagicEightBall() { this.answers = new String[3]; }

    public int getAnswerCount()  {
        return this.answers.length;
    }

    public void add(String answer) { this.answers[0] = answer; }

}
//
//    public void addAnswer(String answer) {
//        this.answers.add(answer);
//    }
//
//    public String getAnswerAtIndex(String index){
//        return this.answers.get(index);
//    }
//
//    public String getRandomAnswer() {
//        Collections.shuffle(this.answers);
//        return getAnswerAtIndex(0);
//    }
//
//}
