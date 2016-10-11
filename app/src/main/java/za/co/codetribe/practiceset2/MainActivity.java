package za.co.codetribe.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    TextView tv_team_A_score;
    TextView tv_team_B_score;

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_team_A_score = (TextView) findViewById(R.id.tv_team_A_score);
        tv_team_B_score = (TextView) findViewById(R.id.tv_team_B_score);

    }

    //Team A
    public void addThreeForTeamA(View v)
    {
        displayForTeamA(3);
    }

    public void addTwoForTeamA(View v)
    {
        displayForTeamA(2);
    }
    public void addOneForTeamA(View v)
    {
        displayForTeamA(1);
    }

    public void displayForTeamA(int score)
    {
        scoreTeamA += score;

        tv_team_A_score.setText(String.valueOf(scoreTeamA));
    }

    //TeamB
    public void addThreeForTeamB(View v)
    {
        displayForTeamB(3);
    }

    public void addTwoForTeamB(View v)
    {
        displayForTeamB(2);
    }
    public void addOneForTeamB(View v)
    {
        displayForTeamB(1);
    }

    public void displayForTeamB(int score)
    {
        scoreTeamB += score;

        tv_team_B_score.setText(String.valueOf(scoreTeamB));
    }

    //reset score
    public void resetScore(View v)
    {
        scoreTeamA = 0;
        scoreTeamB = 0;

        tv_team_A_score.setText(String.valueOf(scoreTeamA));
        tv_team_B_score.setText(String.valueOf(scoreTeamB));
    }
}
