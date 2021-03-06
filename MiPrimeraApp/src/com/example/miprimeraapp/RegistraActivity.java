package com.example.miprimeraapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class RegistraActivity extends Activity {
	
	private static TextView nombre;
	private static TextView fecha;
	private static TextView psw;
	private static TextView tempo;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_otra);
		
		nombre = (TextView)findViewById(R.id.textView1);
		fecha = (TextView)findViewById(R.id.textView2);
		psw = (TextView)findViewById(R.id.textView3);
		tempo = (TextView)findViewById(R.id.textView4);
	
		nombre.setText(getIntent().getExtras().getString("userNombre"));
		fecha.setText(getIntent().getExtras().getString("userFecha"));
		psw.setText(getIntent().getExtras().getString("userPsw"));
		tempo.setText(getIntent().getExtras().getString("userTempo"));
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.otro, menu);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		return super.onOptionsItemSelected(item);
	}

	public static TextView getNombre() {
		return nombre;
	}

	public static void setNombre(TextView nombre) {
		RegistraActivity.nombre = nombre;
	}

	public static TextView getFecha() {
		return fecha;
	}

	public static void setFecha(TextView fecha) {
		RegistraActivity.fecha = fecha;
	}

	public static TextView getPsw() {
		return psw;
	}

	public static void setPsw(TextView psw) {
		RegistraActivity.psw = psw;
	}

	public static TextView getTempo() {
		return tempo;
	}

	public static void setTempo(TextView tempo) {
		RegistraActivity.tempo = tempo;
	}
	
	

}
