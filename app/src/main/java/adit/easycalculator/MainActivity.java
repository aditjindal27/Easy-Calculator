package adit.easycalculator;

import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.graphics.Color;
import android.service.voice.VoiceInteractionService;
import android.speech.RecognizerIntent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.RelativeLayout;
import java.util.ArrayList;
import java.util.Locale;



public class MainActivity extends AppCompatActivity {

    private static Button button_next;




    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    ArrayList<String> arrayList = new ArrayList<String>();
    String string = "";
    String string1 = "";

    public void onCLick1(View v) {
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        Button button = (Button) v;
        string = (String) button.getText().toString();

        if (!string.contains("+") && !string.contains("-") && !string.contains("*") && !string.contains("/")) {
            string1 = string1 + string;

            if (arrayList.size() > 0) {
                arrayList.remove((arrayList.size() - 1));



            }
            arrayList.add(string1);
        } else {
            arrayList.add(string);
            arrayList.add(string);
            string1 = "";
        }

        textView2.setText(textView2.getText().toString() + string);
        //textView2.setText(arrayList.toString());
    }


//BACKSPACE//
        public void onClickBack(View v) {
            TextView textView2 = (TextView) findViewById(R.id.textView2);
                String str=textView2.getText().toString();
                if (str.length() >=1 ) {
                    str = str.substring(0, str.length() - 1);
                    textView2.setText(str);
                } else if (str.length() <=1 ) {
                    textView2.setText("0");
                }
            }


    public  void onClick(View view) {
             TextView textView1 = (TextView) findViewById(R.id.textView);

            float calc = 0;
            int c = arrayList.size();

            while (c != 1) {
                if (c > 3) {
                    if (arrayList.get(3).contains("*") || arrayList.get(3).contains("/")) {
                        if (arrayList.get(3).contains("*")) {
                            calc = Float.parseFloat(arrayList.get(2)) * Float.parseFloat(arrayList.get(4));
                        }

                        if (arrayList.get(3).contains("/")) {
                            calc = Float.parseFloat(arrayList.get(2)) / Float.parseFloat(arrayList.get(4));
                        }

                        arrayList.remove(2);
                        arrayList.remove(2);
                        arrayList.remove(2);
                        arrayList.add(2, Float.toString(calc));
                        c = arrayList.size();
                    } else {
                        if (arrayList.get(1).contains("+")) {
                            calc = Float.parseFloat(arrayList.get(0)) + Float.parseFloat(arrayList.get(2));
                        }
                        if (arrayList.get(1).contains("-")) {
                            calc = Float.parseFloat(arrayList.get(0)) - Float.parseFloat(arrayList.get(2));
                        }
                        if (arrayList.get(1).contains("*")) {
                            calc = Float.parseFloat(arrayList.get(0)) * Float.parseFloat(arrayList.get(2));
                        }
                        if (arrayList.get(1).contains("/")) {
                            calc = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(arrayList.get(2));
                        }

                        arrayList.remove(0);
                        arrayList.remove(0);
                        arrayList.remove(0);
                        arrayList.add(0, Float.toString(calc));
                        c = arrayList.size();
                    }


                } else {
                    if (arrayList.get(1).contains("+")) {
                        calc = Float.parseFloat(arrayList.get(0)) + Float.parseFloat(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("-")) {
                        calc = Float.parseFloat(arrayList.get(0)) - Float.parseFloat(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("*")) {
                        calc = Float.parseFloat(arrayList.get(0)) * Float.parseFloat(arrayList.get(2));
                    }
                    if (arrayList.get(1).contains("/")) {
                        calc = Float.parseFloat(arrayList.get(0)) / Float.parseFloat(arrayList.get(2));
                    }

                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.remove(0);
                    arrayList.add(0, Float.toString(calc));
                    c = arrayList.size();
                }


                textView1.setText(Float.toString(calc));
                 final float d = calc;
                Button aditsbutton = (Button)findViewById(R.id.button15);
                aditsbutton.setOnLongClickListener(
                        new Button.OnLongClickListener() {
                            public boolean onLongClick(View v) {
                                TextView textView2 = (TextView) findViewById(R.id.textView2);
                                textView2.setText(Float.toString(d));
                                return true;
                            }
                        }

                );


            }

            textView1.setText(Float.toString(calc));
        }


    public void clear (View view)
    {
        TextView textView1 = (TextView) findViewById(R.id.textView);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        string1 = "";
        string = "";
        textView2.setText("");
        arrayList.clear();
        textView1.setText("0");
    }

    public void OnclickButtonListener(View view)
    {
        button_next = (Button)findViewById(R.id.button18);
        Intent intent = new Intent(this, Converter.class);
        startActivity(intent);



    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout main_view =  (RelativeLayout)findViewById(R.id.A);
        switch (item.getItemId())
        {
            case R.id.menu_red:
                if(item.isChecked())
                    item.setChecked(false);
                    else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#FF9A9E"));
                return true;
            case R.id.menu_green:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#B3EE3A"));
                return true;
            case R.id.menu_yellow:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.parseColor("#FFFF88"));
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }



    ////SPEECH////////
 /**  private TextView resultTEXT = (TextView)findViewById(R.id.textView2);
    public void OnButtonClick(View view)
    {
        if (view.getId() == R.id.imageButton)
        {

            promptSpeechInput();
        }
    }

    public void promptSpeechInput()
    {
     Intent i = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        i.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        i.putExtra(RecognizerIntent.EXTRA_PROMPT, "Say the values");

        try {
            startActivityForResult(i, 100);
        }catch (ActivityNotFoundException a)
        {
            Toast.makeText(MainActivity.this, "Sorry! Your device does not support this feature", Toast.LENGTH_LONG).show();

        }
    }
    public void onActivityResult(int request_code, int result_code, Intent i)
    {
        super.onActivityResult(request_code, result_code, i);
        switch (request_code)
        {
            case 100:
                if(result_code == RESULT_OK && i!=null)
                {
                    ArrayList<String> result = i.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    resultTEXT.setText(result.get(0));
                }
                break;
        }
    }
  */


}
