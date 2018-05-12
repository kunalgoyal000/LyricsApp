package abhayjain.lyricsapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Account extends AppCompatActivity {
    private ProgressDialog progressBar;
    TextView nav_header_nam, nav_header_emal, nav_header_gen;
    ImageView nav_header_imag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);

        SharedPreferences sharedPreferences = getSharedPreferences("Content_main", Context.MODE_PRIVATE);
        //  SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        //Set name,email,image in  the navigation side drawer to those we enter in the login page
        String nav_header_name = sharedPreferences.getString("name", "xyz");
        String nav_header_email = sharedPreferences.getString("email", "abc@gmail.com");
        String nav_header_gender = sharedPreferences.getString("gender", "Male");
        nav_header_nam = (TextView) findViewById(R.id.nav_header_name);
        nav_header_emal = (TextView) findViewById(R.id.nav_header_email);
        nav_header_imag = (ImageView) findViewById(R.id.nav_header_image);
        nav_header_gen = (TextView) findViewById(R.id.nav_header_gender);
        nav_header_nam.setText(nav_header_name);
        nav_header_emal.setText(nav_header_email);
        nav_header_gen.setText(nav_header_gender);
        if (nav_header_gender.equals("Male")) {
            nav_header_imag.setImageResource(R.drawable.man);
        } else {
            nav_header_imag.setImageResource(R.drawable.female);
        }
    }

}
//    public void sign_out(View v) {
//        SharedPreferences sharedPreferences = getSharedPreferences("Content_main", Context.MODE_PRIVATE);
//        SharedPreferences.Editor editor = sharedPreferences.edit();
//        editor.clear();
//        editor.commit();
//         finish();
//        Intent intent = new Intent(Account.this, MainActivity.class);
//        startActivity(intent);
//
////        progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
////        progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any where on screen
////        progressBar.setMessage("Signing Out...");//Title shown in the progress bar
////        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
////        progressBar.setProgress(0);//attributes
////        progressBar.setMax(100);//attributes
////        progressBar.show();//show the progress bar
////        //This handler will add a delay of 3 seconds
////        new Handler().postDelayed(new Runnable() {
////            @Override
////            public void run() {
//                //Intent start to open the navigation drawer activity
//                // progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
//
////                finish();
////            }
////        }, 3000);
//    }
//}