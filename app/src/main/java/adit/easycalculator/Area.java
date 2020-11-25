package adit.easycalculator;

import android.graphics.Color;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RelativeLayout;

public class Area extends AppCompatActivity {


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
        setContentView(R.layout.activity_area);

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
    public static double m2km(double m)
    {
        return(m/1000000);
    }
    public static double hect2m(double hect)
    {
        return(hect*10000);
    }
    public static double m2inch(double m)
    {
        return(m*1500.0031);
    }
    public static double m2yard(double m)
    {
        return(m*1.1959);
    }
    public static double m2foot(double m)
    {
        return(m*10.763);
    }
    public static double m2are(double m)
    {
        return(m/100);
    }
    public static double m2acre(double m)
    {
        return(m*.0002473);
    }
    public static double m2marla(double m)
    {
        return(m*0.00199);
    }
    public static double m2Bigha(double m)
    {
        return(m*0.000395);
    }
    public static double m2Biswa(double m)
    {
        return(m*0.0000309);
    }
    public static double km2m(double km)
    {
        return(km*1000000);
    }
    public static double km2hect(double km)
    {
        return(km*100);
    }
    public static double km2acre(double km)
    {
        return(km*247.105);
    }
    public static double km2are(double km)
    {
        return(km*1000);
    }
    public static double Big2m(double big)
    {
        return(big*2529.285);
    }
    public static double Big2yard(double big)
    {
        return(big*3024.999);
    }
    public static double Big2acre(double big)
    {
        return(big*.62481);
    }
    public static double Big2marla(double big)
    {
        return(big*5.04239);
    }
    public static double Bis2m(double bis)
    {
        return(bis*126.464);
    }
    public static double Bis2acre(double bis)
    {
        return(bis*.03124);
    }
    public static double Biswa2marla(double bis)
    {
        return(bis*4.9998);
    }
    public static double Biswa2kanal(double bis)
    {
        return(bis*.24999);
    }
    public static double Bis2Big(double m)
    {
        return(m*0.04995);
    }
    public static double Marla2Kanal(double marla)
    {
        return(marla*0.05);
    }
    public static double Kanal2Marla(double k)
    {
        return(k*20);
    }
    public static double karnal2m(double k)
    {
        return(k*505.857);
    }
    public static double Acre2Kanal(double a)
    {
        return(a*8);
    }
    public static double Acre2Marla(double a)
    {
        return(a*160);
    }

    public static double Acre2m(double a)
    {
        return(a*4046.856);
    }




    public  void convert(View view)
    {
        double value = new Double(area.getText().toString());
        if (a.isChecked())
        {
            value = m2km(value);

        }
        if (b.isChecked())
        {
            value = hect2m(value);

        }
        if (c.isChecked())
        {
            value = m2inch(value);

        }
        if (k.isChecked())
        {
            value = m2yard(value);

        }
        if (l.isChecked())
        {
            value = m2foot(value);

        }
        if (d.isChecked())
        {
            value = m2are(value);

        }
        if (e.isChecked())
        {
            value = m2acre(value);

        }
        if (f.isChecked())
        {
            value = m2marla(value);

        }
        if (r.isChecked())
        {
            value = m2Bigha(value);

        }
        if (q.isChecked())
        {
            value = m2Biswa(value);

        }
        if (g.isChecked())
        {
            value = m2km(value);

        }
        if (h.isChecked())
        {
            value = km2m(value);

        }
        if (i.isChecked())
        {
            value = km2hect(value);

        }
        if (j.isChecked())
        {
            value = km2acre(value);

        }
        if (m.isChecked())
        {
            value = km2are(value);

        }
        if (n.isChecked())
        {
            value = Big2m(value);

        }
        if (o.isChecked())
        {
            value = Big2yard(value);

        }
        if (p.isChecked())
        {
            value = Big2acre(value);

        }
        if (s.isChecked())
        {
            value = Big2marla(value);

        }
        if (t.isChecked())
        {
            value = Bis2m(value);

        }
        if (u.isChecked())
        {
            value = Bis2acre(value);

        }
        if (v.isChecked())
        {
            value = Biswa2marla(value);

        }
        if (w.isChecked())
        {
            value = Biswa2kanal(value);

        }
        if (x.isChecked())
        {
            value = Bis2Big(value);

        }
        if (y.isChecked())
        {
            value = Marla2Kanal(value);

        }
        if (z.isChecked())
        {
            value = Kanal2Marla(value);

        }
        if (aa.isChecked())
        {
            value = karnal2m(value);

        }
        if (ab.isChecked())
        {
            value = Acre2Kanal(value);
        }

        if (ac.isChecked())
        {
            value = Acre2Marla(value);

        }

        if (ad.isChecked())
        {
            value = Acre2m(value);

        }

        area.setText(Double.toString(value));
    }
    public void clear (View view)
    {
       area = (EditText)findViewById(R.id.editText);


        area.setText("");

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout main_view =  (RelativeLayout)findViewById(R.id.Area);
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
}
