package abhayjain.lyricsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Hollywood_Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hollywood__songs);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Zayn Malik", "Dusk Till Dawn",R.drawable.dusk));
        words.add(new Word("Ed Sheeran", "Galway Girl",R.drawable.galway));
        words.add(new Word("Justin Bieber", "I'am the one",R.drawable.iam));
        words.add(new Word("Kygo", "First Time",R.drawable.first));
        words.add(new Word("Michael Jackson", "Thriller",R.drawable.thriller));
        words.add(new Word("Jess Glynne", "Not Letting Go",R.drawable.notletting));
        words.add(new Word("Ed Sheran", "Perfect",R.drawable.perfect));
        words.add(new Word("Enrique Iglesias", "Somebody's Me",R.drawable.somebody));
        words.add(new Word("Zayn Malik", "Pillowtalk",R.drawable.pillowtalk));
        words.add(new Word("Sia ft. Sean Paul", "Cheap Thrills",R.drawable.cheap));




        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_1.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_2.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_3.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_4.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_5.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_6.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_7.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_8.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_9.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent=new Intent(Hollywood_Songs.this,holly_10.class);
                    startActivity(intent);
                }
            }
        });
    }
}
