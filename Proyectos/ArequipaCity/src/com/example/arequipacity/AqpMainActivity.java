package com.example.arequipacity;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class AqpMainActivity extends Activity {
	
	class Distrito {
		public String name;
		public Drawable icon;
		public int color;
		public Distrito(String n, int ic,int co){
			name=n;
			icon=getResources().getDrawable(ic);
			color=co;
		}
	}
	
	class MyAdapter extends ArrayAdapter<Distrito> {
		public MyAdapter(Distrito[]dist) {	
			super(getApplicationContext(),0,dist);
		}
		
		
		private class Holder {
			public TextView tv;
			public TextView co;
			public ImageView iv;
			public Holder(View l) {
				co=(TextView)l.findViewById(R.id.textView0);
				tv=(TextView)l.findViewById(R.id.textView1);				
				iv=(ImageView)l.findViewById(R.id.imageView1);
			}
		}
		
		public View getView(int position, View convertView, ViewGroup parent)
		{
			Distrito p=getItem(position);
			if(convertView!=null) {
				Log.d("distnulo","not null");
			}
			RelativeLayout l;
			Holder h;
			if(convertView==null) {
				l=(RelativeLayout)getLayoutInflater().inflate(R.layout.list_row_layout, null);
				h=new Holder(l);
				l.setTag(h);
			}
			else {
				l=(RelativeLayout)convertView;
				h=(Holder)l.getTag();
			}
			
			h.co.setBackgroundResource(p.color);
			//h.co.invalidate();
			h.tv.setText(p.name);			
			h.iv.setImageDrawable(p.icon);
			
			return l;
		}
	}
	
	String[] distrito={
			"Arequipa",
			"Cayma",
			"Cerro_Colorado",
			"Characato",
			"Chiguata",
			"Hunter",
			"Jose_Luis_Bustamante_y_Rivero",
			"La_Joya",
			"Mariano_Melgar",
			"Miraflores_(Arequipa)",
			"Paucarpata",
			"Pocsi",
			"Polobaya",
			"Quequeña",
			"Sabandia",
			"Sachaca",
			"Santa_Isabel_de_Siguas",
			"Santa_Rita_de_Siguas",
			"Alto_Selva_Alegre",
			"San_Juan_de_Siguas",
			"Socabaya",
			"San_Juan_de_Tarucani",
			"Tiabaya",
			"Uchumayo",
			"Vitor",
			"Yanahuara",
			"Yarabamba",
			"Yura"
			};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		//contador hasta 100
		String[] lines=new String[100];
		for(int i=0; i<100;++i)
			lines[i]=Integer.toString(i);
				
		super.onCreate(savedInstanceState);
		//Toast.makeText(this, "onCreate", Toast.LENGTH_LONG).show();
		setContentView(R.layout.activity_aqp_main);
		
		/*
		ListView lv=(ListView)findViewById(R.id.theListView);
		ArrayAdapter a=new ArrayAdapter<String>(this,
				R.layout.list_text_view,lines);
		lv.setAdapter(a);
		*/
		
		Distrito[] dist={
					new Distrito("Arequipa",R.drawable.escudoaqp,R.color.rojo),
					new Distrito("Cayma",R.drawable.cayma,R.color.amarillo),
					new Distrito("Cerro Colorado",R.drawable.cerrocolorado,R.color.azulclaro),
					new Distrito("Characato",R.drawable.characato,R.color.celeste),
					new Distrito("Chiguata",R.drawable.chiguata,R.color.gris),
					new Distrito("Hunter",R.drawable.hunter,R.color.verdelimon),
					new Distrito("J. L. Bustamante y R.",R.drawable.jlbr,R.color.rojo),
					new Distrito("La Joya",R.drawable.lajoya,R.color.azulclaro),
					new Distrito("Mariano Melgar",R.drawable.marianomelgar,R.color.amarillo),
					new Distrito("Miraflores",R.drawable.miraflores,R.color.gris),
					new Distrito("Paucarpata",R.drawable.paucarpata,R.color.celeste),
					new Distrito("Pocsi",R.drawable.pocsi,R.color.rojo),
					new Distrito("Polobaya",R.drawable.polobaya,R.color.verdelimon),
					new Distrito("Quequeña",R.drawable.quequena,R.color.gris),
					new Distrito("Sabandia",R.drawable.sabandia,R.color.amarillo),
					new Distrito("Sachaca",R.drawable.sachaca,R.color.azulclaro),
					new Distrito("Santa Isabel",R.drawable.santaisabel,R.color.verdelimon),
					new Distrito("Santa Rita",R.drawable.santarita,R.color.celeste),
					new Distrito("Selva Alegre",R.drawable.selvaalegre,R.color.gris),
					new Distrito("San Juan de Siguas",R.drawable.siguas,R.color.rojo),
					new Distrito("Socabaya",R.drawable.socabaya,R.color.amarillo),
					new Distrito("San Juan de Tarucani",R.drawable.tarucani,R.color.verdelimon),
					new Distrito("Tiabaya",R.drawable.tiabaya,R.color.amarillo),
					new Distrito("Uchumayo",R.drawable.uchumayo,R.color.azulclaro),
					new Distrito("Vitor",R.drawable.vitor,R.color.gris),
					new Distrito("Yanahuara",R.drawable.yanahuara,R.color.verdelimon),
					new Distrito("Yarabamba",R.drawable.yarabamba,R.color.celeste),
					new Distrito("Yura",R.drawable.yura,R.color.rojo),
					};
		MyAdapter a2=new MyAdapter(dist);
		ListView lv2=(ListView)findViewById(R.id.listView);
		lv2.setAdapter(a2);
		
		ArrayAdapter a=new ArrayAdapter<String>(this,
				R.layout.list_text_view,lines);
		
		lv2.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {               
                //view.getContentDescription()
            	//String item = ;
                Log.d("item","obteniendo el item");
                Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://es.m.wikipedia.org/wiki/Distrito_de_"+distrito[position]));
        		startActivity(i);
                Toast.makeText(getBaseContext(), distrito[position], Toast.LENGTH_LONG).show();                
            }
        });
		
	}

	public void openUrl(View v)
	{
		//Log.d(,"opening url");
		Intent i=new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("http://google.com"));
		startActivity(i);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.aqp_main, menu);
		return true;
	}

}
