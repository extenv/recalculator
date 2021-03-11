package com.recalculator;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.support.v4.content.*;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.*;
import android.view.View.*;
import android.view.*;
import android.text.method.*;
import android.text.*;
import java.util.regex.*;
import java.text.*;
import java.util.*;
public class MainActivity extends AppCompatActivity
{
	/*
	ReCalculator
	Created By Ivan Maulana
	©2020
	*/
	Toolbar toolbar;
	EditText number;
	TextView operator,hasil1,hasil2;
	Button  satu,dua,tiga,empat,lima,enam,tujuh
			,delapan,sembilan,nol,tambah,kurang,bagi,
			kali,persen,samadengan,hapus,cr,titik;
	Double one,two;
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		//toolbar
		if (Build.VERSION.SDK_INT >= 21) {
			getWindow().setNavigationBarColor(ContextCompat.getColor(this, R.color.NavBar)); 
			getWindow().setStatusBarColor(ContextCompat.getColor(this,R.color.StatusBar)); 
		}
		toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

		getSupportActionBar().setDisplayHomeAsUpEnabled(false);
		getSupportActionBar().setDisplayShowHomeEnabled(true);
		
		//declaration Button
		satu = (Button)findViewById(R.id.satu);
		dua  = (Button)findViewById(R.id.dua);
		tiga  = (Button)findViewById(R.id.tiga);
		empat  = (Button)findViewById(R.id.empat);
		lima  = (Button)findViewById(R.id.lima);
		enam  = (Button)findViewById(R.id.enam);
		tujuh = (Button)findViewById(R.id.tujuh);
		delapan  = (Button)findViewById(R.id.delapan);
		sembilan  = (Button)findViewById(R.id.sembilan);
		nol  = (Button)findViewById(R.id.kosong);
		tambah  = (Button)findViewById(R.id.tambah);
		kurang  = (Button)findViewById(R.id.kurang);
		bagi  = (Button)findViewById(R.id.bagi);
		kali  = (Button)findViewById(R.id.kali);
		persen  = (Button)findViewById(R.id.persen);
		cr  = (Button)findViewById(R.id.clear);
		samadengan  = (Button)findViewById(R.id.samadengan);
		hapus  = (Button)findViewById(R.id.hapus);
		titik = (Button)findViewById(R.id.titik);
		//declaration TextView
		operator = (TextView) findViewById(R.id.operator);
		hasil1 = (TextView) findViewById(R.id.hasil1);
		hasil2 = (TextView) findViewById(R.id.hasil2);
		//declaratiom EditText
		number = (EditText) findViewById(R.id.number);
		number.setEnabled(false);
		
		satu.setOnClickListener(new OnClickListener()
		{
			@Override
			public void onClick(View v)
			{
				number.setText(number.getText().toString() + "1");
			}
			
		});
		dua.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "2");
				}

			});
		tiga.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "3");
				}

			});
		empat.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "4");
				}

			});
		lima.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "5");
				}

			});
		enam.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "6");
				}

			});
		tujuh.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "7");
				}

			});
		delapan.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "8");
				}

			});
		sembilan.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "9");
				}

			});
		nol.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + "0");
				}

			});
			
			
		//OPERATOR
		tambah.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
				
					String angka = number.getText().toString();
					if (angka.matches("")) {
						//No Action
						return;
					}
					else{
						hasil1.setText(number.getText()+"");
						hasil2.setText("");
						number.setText("");
						operator.setText("+");
					}
					
				
				}

			});
		kurang.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					String angka = number.getText().toString();
					if (angka.matches("")) {
						//No Action
						return;
					}
					else{
						hasil1.setText(number.getText()+"");
						hasil2.setText("");
						number.setText("");
						operator.setText("-");
					}


				}
				

			});
		bagi.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					String angka = number.getText().toString();
					if (angka.matches("")) {
						//No Action
						return;
					}
					else{
						hasil1.setText(number.getText()+"");
						hasil2.setText("");
						number.setText("");
						operator.setText("/");
					}


				}
				

			});
		kali.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					String angka = number.getText().toString();
					if (angka.matches("")) {
						//No Action
						return;
					}
					else{
						hasil1.setText(number.getText()+"");
						hasil2.setText("");
						number.setText("");
						operator.setText("×");
					}


				
				}

			});
		persen.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					String angka = number.getText().toString();
					if (angka.matches("")) {
						//No Action
						return;
					}
					else{
						Double per = Double.parseDouble(number.getText().toString());
						hasil1.setText(number.getText()+"");
						hasil2.setText("");
						number.setText("" + (per/100) );
						operator.setText("%");
					}


				}
				

			});
		cr.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText("");
					hasil1.setText("");
					hasil2.setText("");
					operator.setText("");

				}

			});
		samadengan.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					String angka = number.getText().toString();
					if (angka.matches("")) {
						//No Action
						return;
					}
					
				else
				{
					String hasil = hasil1.getText().toString();
					if (hasil.matches("")) {
						//No Action
						return;
					}
					else
					{
						
						String op = operator.getText().toString();
						if(op == "+")
						{
							hasil2.setText(number.getText().toString());
							Double an = Double.parseDouble(hasil1.getText().toString());
							Double ka = Double.parseDouble(hasil2.getText().toString());
							Double anka =  an + ka;
							number.setText(""+ Double.toString(anka));
						}
						if(op == "-")
						{
							hasil2.setText(number.getText().toString());
							Double an = Double.parseDouble(hasil1.getText().toString());
							Double ka = Double.parseDouble(hasil2.getText().toString());
							Double anka =  an - ka;
							number.setText(""+ Double.toString(anka));
						}
						if(op == "/")
						{
							hasil2.setText(number.getText().toString());
							Double an = Double.parseDouble(hasil1.getText().toString());
							Double ka = Double.parseDouble(hasil2.getText().toString());
							Double anka =  an / ka;
							number.setText(""+ Double.toString(anka));
						}
						if(op == "×")
						{
							hasil2.setText(number.getText().toString());
							Double an = Double.parseDouble(hasil1.getText().toString());
							Double ka = Double.parseDouble(hasil2.getText().toString());
							Double anka =  an * ka;
							number.setText(""+ Double.toString(anka));
						}
					
					}
				
				}
			}

			});
		hapus.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					String textString = number.getText().toString();
					if( textString.length() > 0 ) {
						number.setText(textString.substring(0, textString.length() - 1 ));
						number.setSelection(number.getText().length());
					
					}
					
				}

			});
		titik.setOnClickListener(new OnClickListener()
			{
				@Override
				public void onClick(View v)
				{
					number.setText(number.getText().toString() + ".");
					
				}

	});
	}

}
