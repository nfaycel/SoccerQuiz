package android.example.soccerquiz;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView txtViewQ1;
    TextView txtViewQ2;
    TextView txtViewQ3;
    TextView txtViewQ4;
    TextView txtViewQ5;
    TextView txtViewQ6;
    TextView txtViewQ7;
    TextView txtViewQ8;
    TextView txtViewQ9;
    TextView txtViewQ10;
    EditText q9_response;
    EditText q10_response;
    RadioGroup radioGroupQ1;
    RadioGroup radioGroupQ2;
    RadioGroup radioGroupQ3;
    RadioGroup radioGroupQ4;
    CheckBox q5_response1;
    CheckBox q5_response2;
    CheckBox q5_response3;
    CheckBox q5_response4;
    CheckBox q6_response1;
    CheckBox q6_response2;
    CheckBox q6_response3;
    CheckBox q6_response4;
    CheckBox q7_response1;
    CheckBox q7_response2;
    CheckBox q7_response3;
    CheckBox q7_response4;
    CheckBox q8_response1;
    CheckBox q8_response2;
    CheckBox q8_response3;
    CheckBox q8_response4;
    question question1, question2, question3, question4;
    question question5;
    question question6;
    question question7;
    question question8;
    String[] choices5 = {"France", "Egypt", "Algeria", "Sudan"};
    String[] choices6 = {"Italy", "France", "England", "Brazil"};
    String[] choices7 = {"Maradona", "Messi", "Maldini", "Salah"};
    String[] choices8 = {"Riyad Mahrez", "Zidane", "Sadio Mané", "Pelli"};
    String[] userResponses5 = {"", "", "", ""};
    String[] userResponses6 = {"", "", "", ""};
    String[] userResponses7 = {"", "", "", ""};
    String[] userResponses8 = {"", "", "", ""};
    private int score = 0;
    private question question9;
    private question question10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtViewQ1 = findViewById(R.id.question1);
        txtViewQ2 = findViewById(R.id.question2);
        txtViewQ3 = findViewById(R.id.question3);
        txtViewQ4 = findViewById(R.id.question4);
        txtViewQ5 = findViewById(R.id.question5);
        txtViewQ6 = findViewById(R.id.question6);
        txtViewQ7 = findViewById(R.id.question7);
        txtViewQ8 = findViewById(R.id.question8);
        txtViewQ9 = findViewById(R.id.question9);
        txtViewQ10 = findViewById(R.id.question10);
        q5_response1 = findViewById(R.id.q5_response1);
        q5_response2 = findViewById(R.id.q5_response2);
        q5_response3 = findViewById(R.id.q5_response3);
        q5_response4 = findViewById(R.id.q5_response4);
        q6_response1 = findViewById(R.id.q6_response1);
        q6_response2 = findViewById(R.id.q6_response2);
        q6_response3 = findViewById(R.id.q6_response3);
        q6_response4 = findViewById(R.id.q6_response4);
        q7_response1 = findViewById(R.id.q7_response1);
        q7_response2 = findViewById(R.id.q7_response2);
        q7_response3 = findViewById(R.id.q7_response3);
        q7_response4 = findViewById(R.id.q7_response4);
        q8_response1 = findViewById(R.id.q8_response1);
        q8_response2 = findViewById(R.id.q8_response2);
        q8_response3 = findViewById(R.id.q8_response3);
        q8_response4 = findViewById(R.id.q8_response4);
        q9_response = findViewById(R.id.q9_response);
        q10_response = findViewById(R.id.q10_response);
        // Radio button questions type
        String[] choices1 = {"Algeria", "France", "Portugal", "Tunisia"};
        question1 = new question("Cristiano Ronaldo nationality", choices1, 3);
        txtViewQ1.setText(question1.question);
        radioGroupQ1 = findViewById(R.id.q1_responses);
        score = score + question1.isCorrectRadio((radioGroupQ1.indexOfChild(findViewById(radioGroupQ1.getCheckedRadioButtonId())) + 1));
        for (int i = 0; i < choices1.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(String.valueOf(choices1[i]));
            radioGroupQ1.addView(radioButton);
        }
        String[] choices2 = {"Morocco", "Algeria", "South Africa", "Egypt"};
        question2 = new question("Which country won the Afcon 2019?", choices2, 2);
        txtViewQ2.setText(question2.question);
        radioGroupQ2 = findViewById(R.id.q2_responses);
        for (int i = 0; i < choices2.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(String.valueOf(choices2[i]));
            radioGroupQ2.addView(radioButton);
        }
        String[] choices3 = {"Zidane", "Fabio Cannavaro", "Diego Forlan", "Ronaldo"};
        question3 = new question("Who won the Golden Boot in 1998 World Cup?", choices3, 4);
        txtViewQ3.setText(question3.question);
        radioGroupQ3 = findViewById(R.id.q3_responses);
        for (int i = 0; i < choices3.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(String.valueOf(choices3[i]));
            radioGroupQ3.addView(radioButton);
        }
        String[] choices4 = {"Roberto Baggio", "Romario", "Stoichkov", "Andersson"};
        question4 = new question("1994 FIFA World Player of the Year", choices4, 2);
        txtViewQ4.setText(question4.question);
        radioGroupQ4 = findViewById(R.id.q4_responses);
        for (int i = 0; i < choices4.length; i++) {
            RadioButton radioButton = new RadioButton(this);
            radioButton.setText(String.valueOf(choices4[i]));
            radioGroupQ4.addView(radioButton);
        }
        // check boxes questions type
        String[] correctResponses5 = {"Egypt", "Algeria", "", ""};
        question5 = new question("Which countries qualified for African Cup of Nations 2019?", choices5, correctResponses5);
        txtViewQ5.setText(question5.question);
        q5_response1.setText(choices5[0]);
        q5_response2.setText(choices5[1]);
        q5_response3.setText(choices5[2]);
        q5_response4.setText(choices5[3]);
        String[] correctResponses6 = {"France", "Brazil", "", ""};
        question6 = new question("Who was in the 1998 World Cup final?", choices6, correctResponses6);
        txtViewQ6.setText(question6.question);
        q6_response1.setText(choices6[0]);
        q6_response2.setText(choices6[1]);
        q6_response3.setText(choices6[2]);
        q6_response4.setText(choices6[3]);
        String[] correctResponses7 = {"Messi", "Salah", "", ""};
        question7 = new question("Ballon d'Or 2018 nominees ", choices7, correctResponses7);
        txtViewQ7.setText(question7.question);
        q7_response1.setText(choices7[0]);
        q7_response2.setText(choices7[1]);
        q7_response3.setText(choices7[2]);
        q7_response4.setText(choices7[3]);
        String[] correctResponses8 = {"Riyad Mahrez", "", "Sadio Mané", ""};
        question8 = new question("African players", choices8, correctResponses8);
        txtViewQ8.setText(question8.question);
        q8_response1.setText(choices8[0]);
        q8_response2.setText(choices8[1]);
        q8_response3.setText(choices8[2]);
        q8_response4.setText(choices8[3]);
        // input Text questions type
        question9 = new question("When was the World Cup football (year)?", "1930");
        txtViewQ9.setText(question9.question);
        question10 = new question("Who won the world cup 2002?", "Brazil");
        txtViewQ10.setText(question10.question);
        Button btnSubmit = (Button) findViewById(R.id.submitAndCheck);
        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q5_response1.isChecked()) userResponses5[0] = choices5[0];
                else userResponses5[0] = "";
                if (q5_response2.isChecked()) userResponses5[1] = choices5[1];
                else userResponses5[1] = "";
                if (q5_response3.isChecked()) userResponses5[2] = choices5[2];
                else userResponses5[2] = "";
                if (q5_response4.isChecked()) userResponses5[3] = choices5[3];
                else userResponses5[3] = "";
                if (q6_response1.isChecked()) userResponses6[0] = choices6[0];
                else userResponses6[0] = "";
                if (q6_response2.isChecked()) userResponses6[1] = choices6[1];
                else userResponses6[1] = "";
                if (q6_response3.isChecked()) userResponses6[2] = choices6[2];
                else userResponses6[2] = "";
                if (q6_response4.isChecked()) userResponses6[3] = choices6[3];
                else userResponses6[3] = "";
                if (q7_response1.isChecked()) userResponses7[0] = choices7[0];
                else userResponses7[0] = "";
                if (q7_response2.isChecked()) userResponses7[1] = choices7[1];
                else userResponses7[1] = "";
                if (q7_response3.isChecked()) userResponses7[2] = choices7[2];
                else userResponses7[2] = "";
                if (q7_response4.isChecked()) userResponses7[3] = choices7[3];
                else userResponses7[3] = "";
                if (q8_response1.isChecked()) userResponses8[0] = choices8[0];
                else userResponses8[0] = "";
                if (q8_response2.isChecked()) userResponses8[1] = choices8[1];
                else userResponses8[1] = "";
                if (q8_response3.isChecked()) userResponses8[2] = choices8[2];
                else userResponses8[2] = "";
                if (q8_response4.isChecked()) userResponses8[3] = choices8[3];
                else userResponses8[3] = "";
                score = question1.isCorrectRadio((radioGroupQ1.indexOfChild(findViewById(radioGroupQ1.getCheckedRadioButtonId())) + 1))
                        + question2.isCorrectRadio((radioGroupQ2.indexOfChild(findViewById(radioGroupQ2.getCheckedRadioButtonId())) + 1))
                        + question3.isCorrectRadio((radioGroupQ3.indexOfChild(findViewById(radioGroupQ3.getCheckedRadioButtonId())) + 1))
                        + question4.isCorrectRadio((radioGroupQ4.indexOfChild(findViewById(radioGroupQ4.getCheckedRadioButtonId())) + 1))
                        + question5.isCorrectCheckBox(userResponses5)
                        + question6.isCorrectCheckBox(userResponses6)
                        + question7.isCorrectCheckBox(userResponses7)
                        + question8.isCorrectCheckBox(userResponses8)
                        + question9.isCorrectResponse(q9_response.getText().toString())
                        + question10.isCorrectResponse(q10_response.getText().toString());
                String message = "";
                if (score == 100) message = "Waw you get the perfect score 10/10";
                else if (score == 0) message = " Oh no try again !!!!";
                else message = "your score is :" + score;
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
                score = 0;
            }
        });
    }
}
