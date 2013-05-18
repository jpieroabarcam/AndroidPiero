package com.example.calculadora7;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class CalculadoraMainActivity extends Activity {

	private EditText entrada, resultado;
	private String b1 = "";
	private Double calculo = 0.0;
	
	private void actualizar() {	
		
		entrada.setText(this.b1);
		resultado.setText(this.calculo.toString());

	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_calculadora_main);
		setupViews();
	}
	
	void setupViews() {		
		
    	resultado=(EditText)findViewById(R.id.resultado);
    	entrada=(EditText)findViewById(R.id.entrada);    	       
    }
    
	public void boton0(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
        b1+="0";
        actualizar();
    }
    public void boton1(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
        b1+="1";
        actualizar();
    }
    public void boton2(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="2";
    	actualizar();
    }
    public void boton3(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="3";
    	actualizar();
    }
    public void boton4(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="4";
    	actualizar();
    }
    public void boton5(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="5";
    	actualizar();
    }
    public void boton6(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="6";
    	actualizar();
    }
    
    public void boton7(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="7";
    	actualizar();
    }
    
    public void boton8(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="8";
    	actualizar();
    }
    
    public void boton9(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="9";
    	actualizar();        
    }
    
    public void punto(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+=".";
    	actualizar();        
    }
    
    public void suma(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="+";
    	actualizar();        
    }
    public void restar(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="-";
    	actualizar();        
    }
    public void mult(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="*";
    	actualizar();        
    }
    public void div(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	b1+="/";
    	actualizar();        
    }
    
    public void igual(View v)
    {
    	Log.d("tag","push");
    	//double f=Double.valueOf(faren.getText().toString());
    	//b1+="9";
    	//actualizar();
    	double num1=0,num2=0;		
		for(int i=0; i<b1.length();i++) 
		{
			if(b1.substring(i)== "+" )
			{
				num1 = Double.parseDouble(b1.substring(0, i-1));
				num2 = Double.parseDouble(b1.substring(i+1, b1.length()-1));
			}				
		}
		calculo=num1+num2;
		actualizar();
    }
       
		
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.calculadora_main, menu);
		return true;
	}

}
