package abhayjain.lyricsapp;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Bollywood_Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bollywood__songs);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Arijit Singh", "Tera Yaar Hoon Main",R.drawable.terayaar));
        words.add(new Word("Atif Aslam", "Dil Diyan Gallan",R.drawable.dildiyan));
        words.add(new Word("Armaan Malik", "Ghar Se Nikalte Hi",R.drawable.gharse));
        words.add(new Word("Shirley Setia & Gurnazar", "Koi Vi Nahi",R.drawable.koivi));
        words.add(new Word("Arijit Singh", "Channa Mereya",R.drawable.channa));
        words.add(new Word("Yo Yo Honey Singh ", "Dil Chori ",R.drawable.dilchori));
        words.add(new Word(" Atif Aslam", "O Saathi",R.drawable.osaathi));
        words.add(new Word("Arijit Song, Mithoon", "Tum Hi Ho",R.drawable.tumhiho));
        words.add(new Word("Udit Narayan, Sanam, Sadhana Sargam", "Pehla Nasha",R.drawable.pehlanasha));
        words.add(new Word("Arijit Singh, Palak Muchhal", "Dekha Hazaro Dafaa",R.drawable.dekahazaro));




        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_1.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_2.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_3.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_4.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_5.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_6.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_7.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_8.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_9.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent=new Intent(Bollywood_Songs.this,bolly_10.class);
                    startActivity(intent);
                }
            }
        });
    }

}
