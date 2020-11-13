import java.text.ChoiceFormat;

public class ChoiceFormatEx1 {
    public static void main(String[] args) {
        double[] limits = {60, 70, 80, 90};//경곗값은 반드시 낮은값부터 큰값순서로, double형으로 적어야함 아니면 오류남 ㅠㅠ
        String[] grades = {"D", "C", "B", "A"};

        int[] scores = {100, 95, 88, 70, 52, 60, 70};

        ChoiceFormat form = new ChoiceFormat(limits, grades);

        for(int i=0; i<scores.length; i++){
            System.out.println(scores[i] + ":" + form.format(scores[i]));
        }

    }
}
