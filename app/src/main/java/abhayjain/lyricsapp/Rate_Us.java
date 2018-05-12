package abhayjain.lyricsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class Rate_Us extends AppCompatActivity {
RatingBar ratingbar1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate__us);
    }

    public void submit(View view){
        ratingbar1=(RatingBar)findViewById(R.id.ratingbar1);
        String rating=String.valueOf(ratingbar1.getRating());
        Toast.makeText(getApplicationContext(), "You rated the app as " + rating, Toast.LENGTH_SHORT).show();
    }
}
