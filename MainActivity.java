package com.example.android.geniusquiz;

import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import static android.R.attr.name;
import static android.R.attr.x;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //this adds logo in action bar
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.genius);
        getSupportActionBar().setDisplayUseLogoEnabled(true);
        setContentView(R.layout.activity_main);
    }
    //This assigns the total point per questions right, +1 point per question
    public void submitAnswer (View view){
        int totalPoints = 0;
        if (question1()){
            totalPoints += + 1;
        }
        if (question2()){
            totalPoints += +1;
        }
        if (question3()){
            totalPoints += +1;
        }
        if (question4()){
            totalPoints += +1;
        }
        if (question5()){
            totalPoints += +1;
        }
        if (question6()){
            totalPoints += +1;
        }
        if (question7()){
            totalPoints += +1;
        }
        if (question8()){
            totalPoints += +1;
        }
        if (question9()){
            totalPoints += +1;
        }
        if (question10()){
            totalPoints += +1;
        }
        if (question11a() == 23){
            totalPoints += +1;
        }
        if (question11b() == 60){
            totalPoints += +1;
        }
        if (question11c() == 200){
            totalPoints += +1;
        }
        totalPoints = totalPoints * 100/13;
        displayResult(quizResult(totalPoints));
        final ScrollView scrollview = ((ScrollView) findViewById(R.id.scrollview));
        scrollview.fullScroll(ScrollView.FOCUS_DOWN);
    }
    // This checks which checkbox are checked in question 1
    private Boolean question1() {
        Boolean answer = false;
        CheckBox checkBoxA = (CheckBox) findViewById(R.id.answer1a);
        Boolean answerA = checkBoxA.isChecked();
        CheckBox checkBoxB = (CheckBox) findViewById(R.id.answer1b);
        Boolean answerB = checkBoxB.isChecked();
        CheckBox checkBoxC = (CheckBox) findViewById(R.id.answer1c);
        Boolean answerC = checkBoxC.isChecked();
        CheckBox checkBoxD = (CheckBox) findViewById(R.id.answer1d);
        Boolean answerD = checkBoxD.isChecked();
        CheckBox checkBoxE = (CheckBox) findViewById(R.id.answer1e);
        Boolean answerE = checkBoxE.isChecked();
        CheckBox checkBoxF = (CheckBox) findViewById(R.id.answer1f);
        Boolean answerF = checkBoxF.isChecked();
        CheckBox checkBoxG = (CheckBox) findViewById(R.id.answer1g);
        Boolean answerG = checkBoxG.isChecked();
        CheckBox checkBoxH = (CheckBox) findViewById(R.id.answer1h);
        Boolean answerH = checkBoxH.isChecked();
        //This is the requirement to validate the answer, only the answer A, F and G are true
        if (answerA && !answerB && !answerC && !answerD && !answerE && answerF && answerG && !answerH){
            answer = true;
        }
        return answer;
    }
    // This checks which checkbox are checked in question 2
    private Boolean question2() {
        Boolean answer = false;
        CheckBox checkBoxA = (CheckBox) findViewById(R.id.answer2a);
        Boolean answerA = checkBoxA.isChecked();
        CheckBox checkBoxB = (CheckBox) findViewById(R.id.answer2b);
        Boolean answerB = checkBoxB.isChecked();
        CheckBox checkBoxC = (CheckBox) findViewById(R.id.answer2c);
        Boolean answerC = checkBoxC.isChecked();
        CheckBox checkBoxD = (CheckBox) findViewById(R.id.answer2d);
        Boolean answerD = checkBoxD.isChecked();
        CheckBox checkBoxE = (CheckBox) findViewById(R.id.answer2e);
        Boolean answerE = checkBoxE.isChecked();
        CheckBox checkBoxF = (CheckBox) findViewById(R.id.answer2f);
        Boolean answerF = checkBoxF.isChecked();
        CheckBox checkBoxG = (CheckBox) findViewById(R.id.answer2g);
        Boolean answerG = checkBoxG.isChecked();
        CheckBox checkBoxH = (CheckBox) findViewById(R.id.answer2h);
        Boolean answerH = checkBoxH.isChecked();
        //This is the requirement to validate the answer, only the answer B, E and F are true
        if (!answerA && answerB && !answerC && !answerD && answerE && answerF && !answerG && !answerH){
            answer = true;
        }
        return answer;
    }
    // This checks only if radiobutton A of question 3 is checked
    private Boolean question3() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer3a);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton C of question 4 is checked
    private Boolean question4() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer4c);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton C of question 5 is checked
    private Boolean question5() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer5c);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton B of question 6 is checked
    private Boolean question6() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer6b);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton A of question 7 is checked
    private Boolean question7() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer7a);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton B of question 8 is checked
    private Boolean question8() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer8b);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton B of question 9 is checked
    private Boolean question9() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer9b);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    // This checks only if radiobutton A of question 10 is checked
    private Boolean question10() {
        RadioButton radioButton = (RadioButton) findViewById(R.id.answer10a);
        Boolean answer = radioButton.isChecked();
        return answer;
    }
    //These three methods allow of getting text input from the three EditText about the question 11
    private int question11a () {
        EditText text = (EditText) findViewById(R.id.na);
        String element = text.getText().toString();
        int intValue = 0;
        if (!element.isEmpty()) {
            intValue = Integer.parseInt(element);
            return intValue;
        }
        return intValue;
    }
    private int question11b () {
        EditText text = (EditText) findViewById(R.id.cu);
        String element = text.getText().toString();
        int intValue = 0;
        if (!element.isEmpty()) {
            intValue = Integer.parseInt(element);
            return intValue;
        }
        return intValue;
    }
    private int question11c () {
        EditText text = (EditText) findViewById(R.id.hg);
        String element = text.getText().toString();
        int intValue = 0;
        if (!element.isEmpty()) {
            intValue = Integer.parseInt(element);
            return intValue;
        }
        return intValue;
    }

    /**This method builds the result message
     * @param result show the total point get from the quiz
     * @return this shows the text resulted
     */
    private String quizResult(int result){
        if (result == 100){
            Toast.makeText(this, getString(R.string.titleAdvancedResult) + getString(R.string.message, result) + "%", Toast.LENGTH_SHORT).show();
            String message = getString(R.string.titleAdvancedResult) + "\n\n";
            message += getString(R.string.hello) + " ";
            message += getString(R.string.message, result) + "%";
            message += "\n\n" + getString(R.string.advancedResult);
            return message;
        }else if (result > 50){
            Toast.makeText(this, getString(R.string.goodResultPopup, result) + "%", Toast.LENGTH_SHORT).show();
            String message = getString(R.string.titleIntermediateResult) + "\n\n";
            message += getString(R.string.hello) + " ";
            message += getString(R.string.message, result) + "%";
            message += "\n\n" +getString(R.string.intermediateResult);
            return message;
        }else{
            Toast.makeText(this, getString(R.string.poorResultPopup, result) + "%", Toast.LENGTH_SHORT).show();
            String message = getString(R.string.titlePoorResult) + "\n\n";
            message += getString(R.string.hello) + " ";
            message += getString(R.string.message, result) + "%";
            message += "\n\n" + getString(R.string.poorResult);
            return message;}
    }
    /**
     * @param message passes the information from quizResult to the textview that shows the result
     */
    private void displayResult(String message) {
        TextView orderSummaryTextView = (TextView) findViewById(R.id.result);
        orderSummaryTextView.setText(message);
    }
}
