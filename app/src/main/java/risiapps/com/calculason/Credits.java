package risiapps.com.calculason;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class Credits extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_credits);


        ImageView issou = (ImageView) this.findViewById(R.id.issou);
        final MediaPlayer risitas = MediaPlayer.create(this, R.raw.issou);
        issou.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                risitas.start();
            }
        });

        final TextView textView2 = (TextView) this.findViewById(R.id.textView2);
        final MediaPlayer lolilol = MediaPlayer.create(this, R.raw.perlinpinpin);
        textView2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                final Animation myRotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                textView2.startAnimation(myRotation);
                lolilol.start();
            }
        });

        final TextView textView4 = (TextView) this.findViewById(R.id.textView4);
        textView4.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                final Animation myRotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                textView4.startAnimation(myRotation);
            }
        });


        final TextView textView5 = (TextView) this.findViewById(R.id.textView5);
        textView5.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                final Animation myRotation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotation);
                textView5.startAnimation(myRotation);
            }
        });

        ImageView denis2 = (ImageView) this.findViewById(R.id.denis2);
        final MediaPlayer denis = MediaPlayer.create(this, R.raw.cabane);
        denis2.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                denis.start();
                Toast.makeText(Credits.this, "On aurait déjà une cabane.", Toast.LENGTH_SHORT).show();

            }
        });

        ImageView denis1 = (ImageView) this.findViewById(R.id.denis);
        final MediaPlayer cabane = MediaPlayer.create(this, R.raw.cabane);
        denis1.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                cabane.start();
                Toast.makeText(Credits.this, "On aurait déjà une cabane.", Toast.LENGTH_SHORT).show();
            }
        });


        ImageView jeanne = (ImageView) this.findViewById(R.id.jeanne);
        final MediaPlayer fn = MediaPlayer.create(this, R.raw.jeanne);
        jeanne.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                fn.start();
            }
        });
    }
}
