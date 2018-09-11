package desarrollojhlibreros.com.ejercicio1sonidoswav;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mp;
    private Button btn;


    public void onCreate(Bundle b) {
        super.onCreate(b);
        setContentView(R.layout.activity_main);
        btn= (Button) findViewById(R.id.btnSonido);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mp = MediaPlayer.create(MainActivity.this, R.raw.musica);
                mp.start();
            }
        });
    }

    public void onDestroy(){
        mp.stop();
        super.onDestroy();
    }
}
