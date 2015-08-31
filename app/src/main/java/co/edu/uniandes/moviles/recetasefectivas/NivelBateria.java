package co.edu.uniandes.moviles.recetasefectivas;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.app.Activity;

import org.w3c.dom.Text;

import co.edu.uniandes.moviles.recetasefectivas.R;

//REVIEW
//REVIEW
//REVIEW
//REVIEW
//REVIEW
public class NivelBateria extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel_bateria);
        darNivelBateria();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_nivel_bateria, menu);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void darNivelBateria()
    {
        BroadcastReceiver reciever = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                context.unregisterReceiver(this);
                int nivelActual = intent.getIntExtra(BatteryManager.EXTRA_LEVEL,-1);
                Log.i("Hola", nivelActual + " ");
                String porcentajeBateria = "El nivel de bateria es: " + nivelActual;
                TextView texto = (TextView) findViewById(R.id.nivelBateria);
                texto.setText(porcentajeBateria);
            }
        };
        IntentFilter filtroNivelBateria = new IntentFilter(Intent.ACTION_BATTERY_CHANGED);
        registerReceiver(reciever,filtroNivelBateria);
    }
}

//REVIEW//REVIEW
//REVIEW
//REVIEW

