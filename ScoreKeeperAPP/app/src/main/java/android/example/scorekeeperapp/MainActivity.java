package android.example.scorekeeperapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int unitedGoal = 0;
    int chelseaGoal = 0;
    int unitedYellowCard = 0;
    int chelseaYellowCard = 0;
    int unitedRedCard =0 ;
    int chelseaRedCard =0 ;
    int unitedFouls =0;
    int chelseaFouls = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void giveYellowUnited(View view) {

        unitedYellowCard = unitedYellowCard + 1;
    }

    public void displayForTeamUnited(int score) {
        TextView scoreView = (TextView) findViewById(R.id.man_united_score);
        scoreView.setText(String.valueOf(score));
    }

    public  void goalForUnited (View view){
        unitedGoal = unitedGoal + 1;
        displayForTeamUnited(unitedGoal);
    }

    public void foulUnited (View view){
        unitedFouls = unitedFouls + 1;
        displayFoulTeamUnited(unitedFouls);
    }

    public void displayFoulTeamUnited(int score) {
        TextView foulView = (TextView) findViewById(R.id.man_number_of_fouls);
        foulView.setText(String.valueOf(score));
    }

    public void yellowUnited (View view){
        unitedYellowCard = unitedYellowCard + 1;
        displayYellowTeamUnited(unitedYellowCard);
    }

    public void displayYellowTeamUnited(int score) {
        TextView yellowView = (TextView) findViewById(R.id.man_number_of_yellowcards);
        yellowView.setText(String.valueOf(score));
    }
    public void redUnited (View view){
        unitedRedCard = unitedRedCard + 1;
        displayRedTeamUnited(unitedRedCard);
    }
    public void displayRedTeamUnited(int score) {
        TextView redView = (TextView) findViewById(R.id.man_number_of_red_cards);
        redView.setText(String.valueOf(score));

    }

            public void displayForTeamChelsea ( int score){
                TextView scoreView = (TextView) findViewById(R.id.chelsea_score);
                scoreView.setText(String.valueOf(score));
            }

            public void goalForChelsea (View view){
                chelseaGoal = chelseaGoal + 1;
                displayForTeamChelsea(chelseaGoal);
            }

            public void foulChelsea (View view){
                chelseaFouls = chelseaFouls + 1;
                displayFoulTeamChelsea(chelseaFouls);

            }
            public void displayFoulTeamChelsea ( int score){
                TextView foulView = (TextView) findViewById(R.id.chel_number_of_fouls);
                foulView.setText(String.valueOf(score));
            }


            public void giveYellowChelsea (View view){

                chelseaYellowCard = chelseaYellowCard + 1;
                displayYellowTeamChelsea(chelseaYellowCard);

            }

            public void displayYellowTeamChelsea ( int score){
                TextView yellowView = (TextView) findViewById(R.id.chel_number_of_yellowcards);
                yellowView.setText(String.valueOf(score));

            }

    public void giveRedChelsea(View view){

        chelseaRedCard = chelseaRedCard + 1;
        displayRedTeamChelsea(chelseaRedCard);

    }

    public void displayRedTeamChelsea ( int score){
        TextView redView = (TextView) findViewById(R.id.chel_number_of_red_cards);
        redView.setText(String.valueOf(score));

    }

    public void resetScore(View view){

        unitedGoal = 0;
        displayForTeamUnited(unitedGoal);
        chelseaGoal = 0;
        displayForTeamChelsea(chelseaGoal);
         unitedYellowCard = 0;
         displayYellowTeamUnited(unitedYellowCard);
         chelseaYellowCard = 0;
         displayYellowTeamChelsea(chelseaYellowCard);
         unitedRedCard =0 ;
         displayRedTeamUnited(unitedRedCard);
        chelseaRedCard =0 ;
        displayRedTeamChelsea(chelseaRedCard);
         unitedFouls =0;
         displayFoulTeamUnited(unitedFouls);
         chelseaFouls = 0;
         displayFoulTeamChelsea(chelseaFouls);

    }



        }