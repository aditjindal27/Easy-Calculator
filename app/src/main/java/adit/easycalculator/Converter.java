package adit.easycalculator;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;


public class Converter extends ActionBarActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_converter);
    }


    public void Calculator(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }
    public void Length(View view) {

        Intent intent = new Intent(this, Length.class);
        startActivity(intent);

    }
    public void Mass(View view) {
        Intent intent = new Intent(this,Mass.class);
        startActivity(intent);

    }
    public void Time(View view) {
        Intent intent = new Intent(this, Time.class);
        startActivity(intent);

    }
    public void Speed(View view) {
        Intent intent = new Intent(this, Speed.class);
        startActivity(intent);

    }
    public void Energy(View view) {
        Intent intent = new Intent(this, Energy.class);
        startActivity(intent);

    }
    public void Volume(View view) {
        Intent intent = new Intent(this, Volume.class);
        startActivity(intent);

    }
    public void Temp(View view) {
        Intent intent = new Intent(this, Temperature.class);
        startActivity(intent);

    }
    public void Area(View view) {
        Intent intent = new Intent(this, Area.class);
        startActivity(intent);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);

    }
   /* public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout main_view =  (RelativeLayout)findViewById(R.id.Converter);
        switch (item.getItemId())
        {
            case R.id.menu_red:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.RED);
                return true;
            case R.id.menu_green:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.menu_yellow:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                main_view.setBackgroundColor(Color.YELLOW);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
    */
}
