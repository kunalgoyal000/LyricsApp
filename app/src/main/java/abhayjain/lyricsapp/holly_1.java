package abhayjain.lyricsapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class holly_1 extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
//    private MediaPlayer.OnCompletionListener mCompletionListener = new MediaPlayer.OnCompletionListener() {
//        @Override
//        public void onCompletion(MediaPlayer mediaPlayer) {
//            // Now that the sound file has finished playing, release the media player resources.
//            releaseMediaPlayer();
//        }
//    };
    ImageView imageview;
    boolean b=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_holly_1);
        imageview=(ImageView)findViewById(R.id.image1);
        mediaPlayer = MediaPlayer.create(this, R.raw.abc1);
    }
    public void onBackPressed() {
        super.onBackPressed();
        releaseMediaPlayer();}

    public void onStop() {
        super.onStop();
        releaseMediaPlayer();
    }
    public void play(View view) {

        ;
        if (mediaPlayer.isPlaying() && b==true ) {
            Toast.makeText(getApplicationContext(), "Song paused", Toast.LENGTH_SHORT).show();
            // mediaPlayer.seekTo(0);
            mediaPlayer.pause();
            imageview.setImageResource(R.drawable.play);
            ;//Your playbutton image
        } else{
            Toast.makeText(getApplicationContext(), "Playing Dusk Till Dawn", Toast.LENGTH_SHORT).show();
            mediaPlayer.start();
            imageview.setImageResource(R.drawable.pause);
            mediaPlayer.setLooping(true);
            b=true;//Your pausebutton image
            // mediaPlayer.setOnCompletionListener(mCompletionListener);
        }
    }

    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mediaPlayer.isPlaying()) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
//
//            mediaPlayer.isPlaying();
            mediaPlayer.pause();
            imageview.setImageResource(R.drawable.play);
            b=false;
        }
        // Set the media player back to null. For our code, we've decided that
        // setting the media player to null is an easy way to tell that the media player
        // is not configured to play an audio file at the moment.
        // mediaPlayer.isPlaying();
//            mediaPlayer.reset();
    }
}
