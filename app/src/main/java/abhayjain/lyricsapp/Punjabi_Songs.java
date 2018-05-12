package abhayjain.lyricsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class Punjabi_Songs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_punjabi__songs);


        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Kamal Kahlon, Param Singh", "Daru Badnaam",R.drawable.darubadnaam));
        words.add(new Word("Harrdy Sandhu", "Naah",R.drawable.naah));
        words.add(new Word("Parmish Verma", "Gaal Ni Kadni",R.drawable.gaalni));
        words.add(new Word("Sharry Mann", "Hostel",R.drawable.hostel));
        words.add(new Word("Sunanda Sharma", "Jaani Tera Naa",R.drawable.jaani));
        words.add(new Word("B Praak", "Mann Bharaya",R.drawable.mannbharaya));
        words.add(new Word("Guru Randhawa", "Lahore",R.drawable.lahore));
        words.add(new Word("Millind Gaba, Kamal Raja", "Nazar Lag Jayegi ",R.drawable.nazarlag));
        words.add(new Word("Ammy Virk", "Qismat",R.drawable.qismat));
        words.add(new Word("Mankirt Aulakh", "Badnaam",R.drawable.badnaam));




        WordAdapter adapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);


        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_1.class);
                    startActivity(intent);
                }
                if(i==1){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_2.class);
                    startActivity(intent);
                }
                if(i==2){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_3.class);
                    startActivity(intent);
                }
                if(i==3){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_4.class);
                    startActivity(intent);
                }
                if(i==4){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_5.class);
                    startActivity(intent);
                }
                if(i==5){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_6.class);
                    startActivity(intent);
                }
                if(i==6){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_7.class);
                    startActivity(intent);
                }
                if(i==7){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_8.class);
                    startActivity(intent);
                }
                if(i==8){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_9.class);
                    startActivity(intent);
                }
                if(i==9){
                    Intent intent=new Intent(Punjabi_Songs.this,punjab_10.class);
                    startActivity(intent);
                }
            }
        });
    }
}
