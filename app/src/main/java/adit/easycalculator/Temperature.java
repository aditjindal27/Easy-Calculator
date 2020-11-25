package adit.easycalculator;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;


public class Temperature extends ActionBarActivity {



    EditText area;

    RadioButton a;
    RadioButton b;
    RadioButton c;
    RadioButton d;
    RadioButton e;
    RadioButton f;
    RadioButton g;
    RadioButton h;
    RadioButton i;
    RadioButton j;
    RadioButton k;
    RadioButton l;
    RadioButton m;
    RadioButton n;
    RadioButton o;
    RadioButton p;
    RadioButton q;
    RadioButton r;
    RadioButton s;
    RadioButton t;
    RadioButton u;
    RadioButton v;
    RadioButton w;
    RadioButton x;
    RadioButton y;
    RadioButton z;
    RadioButton aa;
    RadioButton ab;
    RadioButton ac;
    RadioButton ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_temperature);


        area = (EditText)findViewById(R.id.editText);
        a = (RadioButton)findViewById(R.id.radioButton);
        b = (RadioButton)findViewById(R.id.radioButton2);
        c = (RadioButton)findViewById(R.id.radioButton3);
        d = (RadioButton)findViewById(R.id.radioButton4);
        e = (RadioButton)findViewById(R.id.radioButton5);
        f = (RadioButton)findViewById(R.id.radioButton6);
        g = (RadioButton)findViewById(R.id.radioButton7);
        h = (RadioButton)findViewById(R.id.radioButton8);
        i = (RadioButton)findViewById(R.id.radioButton9);
        j = (RadioButton)findViewById(R.id.radioButton10);
        k = (RadioButton)findViewById(R.id.radioButton11);
        l = (RadioButton)findViewById(R.id.radioButton12);
        m = (RadioButton)findViewById(R.id.radioButton13);
        n = (RadioButton)findViewById(R.id.radioButton14);
        o = (RadioButton)findViewById(R.id.radioButton15);
        p = (RadioButton)findViewById(R.id.radioButton16);
        q = (RadioButton)findViewById(R.id.radioButton17);
        r = (RadioButton)findViewById(R.id.radioButton18);
        s = (RadioButton)findViewById(R.id.radioButton19);
        t = (RadioButton)findViewById(R.id.radioButton20);
        u = (RadioButton)findViewById(R.id.radioButton21);
        v = (RadioButton)findViewById(R.id.radioButton22);
        w = (RadioButton)findViewById(R.id.radioButton23);
        x = (RadioButton)findViewById(R.id.radioButton24);
        y = (RadioButton)findViewById(R.id.radioButton25);
        z = (RadioButton)findViewById(R.id.radioButton26);
        aa = (RadioButton)findViewById(R.id.radioButton27);
        ab = (RadioButton)findViewById(R.id.radioButton28);
        ac = (RadioButton)findViewById(R.id.radioButton29);
        ad = (RadioButton)findViewById(R.id.radioButton30);


    }
    public static double c2f(double c)
    {
        return(((9*c)/5) + 32);
    }
    public static double c2k(double c)
    {
        return(c+273.5);
    }
    public static double c2r(double c)
    {
        return((c + 273.15)*9/5);
    }
    public static double f2c(double f)
    {
        return((5/9)*(f-32));
    }
    public static double f2k(double f)
    {
        return((5/9)*(f-32) + 273.15);
    }
    public static double f2r(double f)
    {
        return(f + 459.67);
    }
    public static double k2c(double k)
    {
        return(k - 273.15);
    }
    public static double k2f(double k)
    {
        return((k*9/5) - 459.67);
    }
    public static double k2r(double k)
    {
        return(k * (9/5));
    }
    public static double r2c(double r)
    {
        return((r-491.67) * 5/9);
    }
    public static double r2f(double r)
    {
        return(r-459.67);
    }
    public static double r2k(double r)
    {
        return(r*(5/9));
    }

    public  void convert(View view)
    {
        double value = new Double(area.getText().toString());
        if (a.isChecked())
        {
            value = c2f(value);

        }
        if (b.isChecked())
        {
            value = c2k(value);

        }
        if (c.isChecked())
        {
            value = c2r(value);

        }
        if (k.isChecked())
        {
            value = f2c(value);

        }
        if (l.isChecked())
        {
            value = f2k(value);

        }
        if (d.isChecked())
        {
            value = f2r(value);

        }
        if (e.isChecked())
        {
            value = k2c(value);

        }
        if (f.isChecked())
        {
            value = k2f(value);

        }
        if (r.isChecked())
        {
            value = k2r(value);

        }
        if (q.isChecked())
        {
            value = r2c(value);

        }
        if (g.isChecked())
        {
            value = r2f(value);

        }
        if (h.isChecked())
        {
            value = r2k(value);

        }


        area.setText(Double.toString(value));
    }
    public void clear (View view)
    {
        area = (EditText)findViewById(R.id.editText);


        area.setText("");

    }
    /*public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout main_view =  (RelativeLayout)findViewById(R.id.Temp);
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
     **/
    }

