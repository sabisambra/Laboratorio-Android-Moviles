package co.edu.uniandes.moviles.recetasefectivas;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

import co.edu.uniandes.moviles.mundo.RecetasEfectivas;

public class VerRecetasActivity extends Activity {

    private ListView mList;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ver_recetas);

        mList= (ListView) findViewById(R.id.listaRecetas);
        String[] ingredientes= RecetasEfectivas.darInstancia().darListaRecetas();
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this, R.layout.lista_item, R.id.label, ingredientes);
        mList.setAdapter(adapter);
        mList.setOnItemClickListener(new OnItemClickListener() {
            public void onItemClick(AdapterView parent, View view,
                                    int position, long id) {
                // selected item
                String nombre = ((TextView) view).getText().toString();

                // Launching new Activity on selecting single List Item
                Intent i = new Intent(getApplicationContext(), InfoRecetaActivity.class);
                // sending data to new activity
                i.putExtra("receta", nombre);
                startActivity(i);
            }

        });
    }
}