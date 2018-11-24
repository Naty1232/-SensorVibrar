package com.example.usuario.practica7sensorvibrar;

import android.content.Context;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ActividadVibrar extends AppCompatActivity {
 Button vibracion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_vibrar);
        final Vibrator vibrator = (Vibrator)this.getSystemService(Context.VIBRATOR_SERVICE);
   vibracion =(Button)findViewById(R.id.btnVibracion);
   vibracion.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           vibrator.vibrate(600);
       }
   });



    }
}
