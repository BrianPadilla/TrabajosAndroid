package com.example.cabo.tablamultiplicarseekbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    public SeekBar numeros;
    public TextView pantalla,leyenda;
    public int contenido;
    public ListView li;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numeros = (SeekBar)findViewById(R.id.seekBar);
        pantalla = (TextView)findViewById(R.id.textView);
        leyenda = (TextView)findViewById(R.id.textView2);
        li = (ListView)findViewById(R.id.LISTA);
        barrita();
    }

    public void barrita( ){

        numeros.setMax(15);



        numeros.setOnSeekBarChangeListener(
                new SeekBar.OnSeekBarChangeListener() {

                    int valoractual;
                    String []ar = new String[11];

                    @Override
                    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                        valoractual = progress;
                        leyenda.setText("Table del : " + valoractual + " / " +numeros.getMax());

                    }

                    @Override
                    public void onStartTrackingTouch(SeekBar seekBar) {

                    }

                    @Override
                    public void onStopTrackingTouch(SeekBar seekBar) {
                        for(int i=1; i<=10; i++){
                            contenido = valoractual * i;

                            ar[i] = contenido+"";

                       }
                        ArrayList<String> paralista = new ArrayList<String>();

                       /*String []paravista = {valoractual+" X 1 = "+ar[1]+"\n"+valoractual+" X 2 = "+ar[2]+
                                "\n"+valoractual+" X 3 = "+ar[3]+ "\n" +valoractual+" X 4 = "+ar[4]+
                                "\n"+valoractual+" X 5 = "+ar[5]+"\n"+valoractual+" X 6 = "+ar[6]+"\n"+
                                valoractual+" X 7 = "+ar[7]+"\n"+valoractual+" X 8 = "+ar[8]+
                                "\n"+valoractual+" X 9 = "+ar[9]+"\n"+valoractual+" X 10 = "+ar[10]};*/

                       paralista.add(valoractual+" X 1 = "+ar[1]);
                       paralista.add(valoractual+" X 2 = "+ar[2]);
                       paralista.add(valoractual+" X 3 = "+ar[3]);
                       paralista.add(valoractual+" X 4 = "+ar[4]);
                       paralista.add(valoractual+" X 5 = "+ar[5]);
                       paralista.add(valoractual+" X 6 = "+ar[6]);
                       paralista.add(valoractual+" X 7 = "+ar[7]);
                       paralista.add(valoractual+" X 8 = "+ar[8]);
                       paralista.add(valoractual+" X 9 = "+ar[9]);
                       paralista.add(valoractual+" X 10 = "+ar[10]);


                        li.setAdapter(new ArrayAdapter<String>(MainActivity.this,
                                android.R.layout.simple_list_item_1, paralista));


                      /*  pantalla.setText(valoractual+" X 1 = "+ar[1]+"\n"+valoractual+" X 2 = "+ar[2]+
                        "\n"+valoractual+" X 3 = "+ar[3]+ "\n" +valoractual+" X 4 = "+ar[4]+
                        "\n"+valoractual+" X 5 = "+ar[5]+"\n"+valoractual+" X 6 = "+ar[6]+"\n"+
                                valoractual+" X 7 = "+ar[7]+"\n"+valoractual+" X 8 = "+ar[8]+
                        "\n"+valoractual+" X 9 = "+ar[9]+"\n"+valoractual+" X 10 = "+ar[10]);*/
                    }
                }
        );

    }
}
