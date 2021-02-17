package mcm.edu.ph.cardoza_classes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView display = findViewById(R.id.txtDisplay);
        display.setText("x");

        Hero clockwerk = new Hero(26,13,18);
        Hero bloodseeker = new Hero("Stygwyr",15,15,15,1,200,100,1);

        clockwerk.heroName ="Rattletrap";

        clockwerk.heroLvl = 1;
        clockwerk.baseHealth = 200;
        clockwerk.baseMana = 75;
        clockwerk.armor = 0.0;

        display.setText(String.valueOf(clockwerk.totalHealth()));

        bloodseeker.heroName ="Stygwyr";
        clockwerk.executeAttack(56.4);


    }

    @Override
    public void onClick(View v){

    }

}