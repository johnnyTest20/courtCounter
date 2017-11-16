package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_A);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * adding three points for Team A
     */
    public void threePointerTeamA(View View) {

        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adding two points for Team A
     */
    public void twoPointerTeamA(View View) {

        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * adding one point for Team A
     */
    public void freeThrowTeamA(View View) {

        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);

        /**
         * Displays the given score for Team B.
         */
    }

     public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score_B);
        scoreView.setText(String.valueOf(score));

    }

    /**
     * adding three points for Team B
     */
    public void threePointerTeamB(View View) {

        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adding two points for Team B
     */
    public void twoPointerTeamB(View View) {

        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * adding one point for Team B
     */
    public void freeThrowTeamB(View View) {

        scoreTeamB += 1;
        displayForTeamB(scoreTeamB);
    }
    /**
     * Resetting all score to zero
     */
    public void reset(View View){
        scoreTeamA = 0;
        scoreTeamB = 0;

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }

}


