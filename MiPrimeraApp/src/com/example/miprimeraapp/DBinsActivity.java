package com.example.miprimeraapp;

import android.app.Activity;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class DBinsActivity extends Activity {
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_dbins);
		
		BaseDatos usdbh = new BaseDatos(this, "DBUsuarios", null, 1);

		SQLiteDatabase db = usdbh.getWritableDatabase();
		
		Usuario usr = (Usuario)getIntent().getExtras().getParcelable("user");
		Usuario usrL = (Usuario)getIntent().getExtras().getParcelable("userL");
		
//		usr.setNombre(getIntent().getExtras().getString("userNombre"));
//		usr.setFecha(getIntent().getExtras().getString("userFecha"));
//		usr.setPsw(getIntent().getExtras().getString("userPsw"));
//		usr.setTempo(getIntent().getExtras().getDouble("userTempo"));

		// Si hemos abierto correctamente la base de datos
		if (db != null) {
			// Insertamos 5 usuarios de ejemplo
//			for (int i = 1; i <= 5; i++) {
//				// Generamos los datos
//				int codigo = i;
//				String nombre = "Usuario" + i;

				// Insertamos los datos en la tabla Usuarios
				db.execSQL("INSERT INTO Usuarios (nombre, tiempo) VALUES ('"
						+ usr.getNombre() + "', " + usr.getTempo() + ")");
//			}

			// Cerramos la base de datos
			db.close();
		}
		
	}
	
	public void mostraUtenti(View v){
		
		Intent i = new Intent(this, DBselActivity.class);
		startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
//		getMenuInflater().inflate(R.menu.dbins, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
