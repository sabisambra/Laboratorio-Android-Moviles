package co.edu.uniandes.moviles.recetasefectivas;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.app.Dialog;


public class MainActivity extends ActionBarActivity {


    private int nivelBateria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    public void verInformacion(View view) {
        Intent intent = new Intent(this, InfoActivity.class);
        startActivity(intent);
    }

    public void agregarIngrediente(View v){
        Intent intent= new Intent(this, CrearIngredienteActivity.class);
        startActivity(intent);
    }

    public void verIngredientes(View v){
        Intent intent= new Intent(this, VerIngredientesActivity.class);
        startActivity(intent);
    }

    public void agregarReceta(View v){
        Intent intent= new Intent(this, CrearRecetaActivity.class);
        startActivity(intent);
    }

    public void verRecetas(View v){
        Intent intent= new Intent(this, VerRecetasActivity.class);
        startActivity(intent);
    }

    public void calcularComida(View v){
        Intent intent= new Intent(this, CalcularCostosActivity.class);
        startActivity(intent);
    }

    //REVIEW
    //REVIEW
    public void verBateria(View v)
    {
        Intent intent = new Intent(this, NivelBateria.class);
        startActivity(intent);
    }
    //REVIEW
    //REVIEW
}