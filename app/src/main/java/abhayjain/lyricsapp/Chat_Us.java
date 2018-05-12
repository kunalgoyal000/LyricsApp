package abhayjain.lyricsapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Chat_Us extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chat__us);
    }

public void mail1(View v){
    Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
    emailIntent.setData(Uri.parse("mailto:" + "kunal.sanjay.16cse@bml.edu.in"));
    emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Kunal-Lyrics App");
    emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
    startActivity(emailIntent);
}

    public void linked1(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/kunalgoyal000"));
        startActivity(intent);
    }

    public void gt1(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/kunalgoyal000"));
        startActivity(intent);
    }

    public void mail2(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + "abhay.jain.16csc@bml.edu.in"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Abhay-Lyrics App");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
        startActivity(emailIntent);
    }

    public void linked2(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/abhay-jain-1aa846149"));
        startActivity(intent);
    }

    public void gt2(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/abhay-jain03"));
        startActivity(intent);
    }
    public void mail3(View v){
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:" + "saatvik.saini.16cse@bml.edu.in"));
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Saatvik-Lyrics App");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
        startActivity(emailIntent);
    }

    public void linked3(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/saatvik-saini-4aaa53145"));
        startActivity(intent);
    }

    public void gt3(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.github.com/kunalgoyal000"));
        startActivity(intent);
    }
}
