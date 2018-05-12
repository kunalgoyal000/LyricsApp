package abhayjain.lyricsapp;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Navigation_Activity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private ProgressDialog progressBar;
    TextView nav_header_nam, nav_header_emal;
    ImageView nav_header_imag;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences sharedPreferences = getSharedPreferences("Content_main", Context.MODE_PRIVATE);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

      //  SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        //Set name,email,image in  the navigation side drawer to those we enter in the login page
        String nav_header_name = sharedPreferences.getString("name", "xyz");
        String nav_header_email = sharedPreferences.getString("email", "abc@gmail.com");
        String nav_header_gender = sharedPreferences.getString("gender", "Male");
        View header = navigationView.getHeaderView(0);//Used to get a reference to navigation header
        nav_header_nam = (TextView) header.findViewById(R.id.nav_header_name);
        nav_header_emal = (TextView) header.findViewById(R.id.nav_header_email);
        nav_header_imag = (ImageView) header.findViewById(R.id.nav_header_image);
        nav_header_nam.setText(nav_header_name);
        nav_header_emal.setText(nav_header_email);
        if (nav_header_gender.equals("Male")) {
            nav_header_imag.setImageResource(R.drawable.man);
        } else {
            nav_header_imag.setImageResource(R.drawable.female);
        }
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.navigation_, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            SharedPreferences sharedPreferences = getSharedPreferences("Content_main", Context.MODE_PRIVATE);
            SharedPreferences.Editor editor = sharedPreferences.edit();
            editor.clear();
            editor.commit();
            finish();
            Intent intent = new Intent(Navigation_Activity.this, MainActivity.class);
             startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_home) {
            Intent i = new Intent(this, Navigation_Activity.class);
            startActivity(i);
        } else if (id == R.id.nav_send) {
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:" + "sendto@lyricsapp.com"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Welcome to our Lyrics App");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Hello");
            startActivity(emailIntent);
        } else if (id == R.id.nav_share) {
            Intent sendIntent = new Intent();
            sendIntent.setAction(Intent.ACTION_SEND);
            sendIntent.putExtra(Intent.EXTRA_TEXT, "Hey, Download the lyrics App from :https://drive.google.com/open?id=1jPmeswHx9bg8jw_76cc3ywtW-NH4JXo_");
            sendIntent.setType("text/plain");
            startActivity(Intent.createChooser(sendIntent, "Share App via"));
        } else if (id == R.id.nav_chat) {
            Intent i = new Intent(this, Chat_Us.class);
            startActivity(i);
        } else if (id == R.id.nav_account) {
            Intent i = new Intent(this, Account.class);
            startActivity(i);
        } else if (id == R.id.nav_rate) {
            Intent i = new Intent(this, Rate_Us.class);
            startActivity(i);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void Hollywood(View v) {

        //To show button click
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {} }, 400);

        progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
        progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
        progressBar.setMessage("Getting Lyrics Ready ...");//Title shown in the progress bar
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
        progressBar.setProgress(0);//attributes
        progressBar.setMax(100);//attributes
        progressBar.show();//show the progress bar
        //This handler will add a delay of 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent start to open the navigation drawer activity
                progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                Intent intent = new Intent(Navigation_Activity.this, Hollywood_Songs.class);
                startActivity(intent);
            }
        }, 2000);
    }

    public void Punjabi(View v) {

        //To show button click
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {} }, 400);

        progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
        progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
        progressBar.setMessage("Getting Lyrics Ready ...");//Title shown in the progress bar
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
        progressBar.setProgress(0);//attributes
        progressBar.setMax(100);//attributes
        progressBar.show();//show the progress bar
        //This handler will add a delay of 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent start to open the navigation drawer activity
                progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                Intent intent = new Intent(Navigation_Activity.this, Punjabi_Songs.class);
                startActivity(intent);
            }
        }, 2000);
    }
    public void Bollywood(View v) {

        //To show button click
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {} }, 400);

        progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
        progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
        progressBar.setMessage("Getting Lyrics Ready ...");//Title shown in the progress bar
        progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
        progressBar.setProgress(0);//attributes
        progressBar.setMax(100);//attributes
        progressBar.show();//show the progress bar
        //This handler will add a delay of 3 seconds
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //Intent start to open the navigation drawer activity
                progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                Intent intent = new Intent(Navigation_Activity.this, Bollywood_Songs.class);
                startActivity(intent);
            }
        }, 2000);
    }
}

