package android.example.soccerquiz;

import java.util.Arrays;
import java.util.List;

public class question {
    String question = "";
    String correctResponse = "";
    String[] choices;
    String[] responses;
    int correct = 0;
    // type Radio button questions
    public question(String question, String[] choices, int correct) {
        this.question = question;
        this.choices = choices;
        this.correct = correct;
    }
    // type check box question
    public question(String question, String[] choices, String[] correctResponses) {
        this.question = question;
        this.choices = choices;
        this.responses = correctResponses;
    }
    // type input text response
    public question(String question, String correctResponse) {
        this.question = question;
        this.correctResponse = correctResponse;
    }
    public int isCorrectRadio(int response) {
        if (this.correct == response) return 10;
        else return 0;
    }
    public int isCorrectCheckBox(String[] responses) {
        List<String> listCorrectResponses = Arrays.asList(this.responses);
        List<String> ListUserResponses = Arrays.asList(responses);
         for (String elem : responses) {
            if (!listCorrectResponses.contains(elem))
                return 0;
        }
        for (String elem : this.responses) {
            if (!ListUserResponses.contains(elem))
                return 0;
        }
        return 10;
    }
    public int isCorrectResponse(String response) {
        if (this.correctResponse.toUpperCase().equals(response.toUpperCase()))
            return 10;
        else
            return 0;
    }


}
