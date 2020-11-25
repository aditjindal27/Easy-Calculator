package adit.easycalculator;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ExpandableListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;


public class Length extends ActionBarActivity {


    EditText length;

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
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);

        length = (EditText)findViewById(R.id.editText);
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

       /* String[] items = {"mile", "kilometer", "meter", "centimeter", "milimeter", "nanometer", "micron", "yard", "foot", "inch", "light year", "astronomical unit"};
        //adapter for converting to list items
        ListAdapter aditsadapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, items);
        ListView listview1 = (ListView) findViewById(R.id.listView);
        ListView listview2 = (ListView) findViewById(R.id.listView2);

        listview1.setAdapter(aditsadapter);
        listview2.setAdapter(aditsadapter);**/
    }
        public static double mm2cm(double mm)
    {
        return(mm/10);
    }
    public static double mm2m(double mm)
    {
        return(mm/1000);
    }
    public static double mm2km(double mm)
    {
        return(mm/1000000);
    }
    public static double cm2m(double cm)
    {
        return(cm/100);
    }
    public static double cm2km(double cm)
    {
        return(cm/100000);
    }
    public static double cm2yard(double cm)
    {
        return(cm*0.0109);
    }
    public static double cm2mm(double cm)
    {
        return(cm*10);
    }
    public static double  cm2footInch(double cm)
    {
        return(cm*0.0328084);
    }
    public static double m2mm(double m)
    {
        return(m*1000);
    }
    public static double m2cm(double m)
    {
        return(m*100);
    }
    public static double m2km(double m)
    {
        return(m/1000);
    }
    public static double km2mm(double km)
    {
        return(km*1000000);
    }
    public static double km2cm(double km)
    {
        return(km*100000);
    }
    public static double km2m(double km)
    {
        return(km*1000);
    }
    public static double cm2inch(double cm)
    {
        return(cm*0.394);
    }
    public static double inch2cm(double inch)
    {
        return(inch*2.54);
    }
    public static double inch2yard(double inch)
    {
        return(inch*0.0278);
    }
    public static double inch2foot(double inch)
    {
        return(inch*0.0833);
    }
    public static double km2miles(double km)
    {
        return(km*0.621);
    }
    public static double  miles2km(double miles)
    {
        return(miles*1.609);
    }
    public static double  yard2cm(double yards)
    {
        return(yards*91.44);
    }
    public static double  yard2m(double yards)
    {
        return(yards*0.914);
    }

    public static double  yard2inch(double yards)
    {
        return(yards*36);
    }
    public static double  foot2inch(double foot)
    {
        return(foot*12);
    }
    public static double  foot2cm(double foot)
    {
        return(foot*30.48);
    }
    public static double  foot2yard(double foot)
    {
        return(foot*.0333);
    }



    public  void convert(View view)
        {
            double value = new Double(length.getText().toString());
            if (a.isChecked())
            {
                value = mm2cm(value);

            }
            if (b.isChecked())
            {
                value = mm2m(value);

            }
            if (c.isChecked())
            {
                value = mm2km(value);

            }
            if (d.isChecked())
            {
                value = cm2mm(value);

            }
            if (e.isChecked())
            {
                value = cm2m(value);

            }
            if (f.isChecked())
            {
                value = cm2km(value);

            }
            if (t.isChecked())
            {
                value = cm2yard(value);

            }
            if (y.isChecked())
            {
                value = cm2footInch(value);

            }
            if (g.isChecked())
            {
                value = m2mm(value);

            }
            if (h.isChecked())
            {
                value = m2cm(value);

            }
            if (i.isChecked())
            {
                value = m2km(value);

            }
            if (j.isChecked())
            {
                value = km2mm(value);

            }
            if (k.isChecked())
            {
                value = km2cm(value);

            }
            if (l.isChecked())
            {
                value = km2m(value);

            }
            if (m.isChecked())
            {
                value = cm2inch(value);

            }
            if (n.isChecked())
            {
                value = inch2cm(value);

            }
            if (u.isChecked())
            {
                value = inch2yard(value);

            }
            if (z.isChecked())
            {
                value = inch2foot(value);

            }
            if (o.isChecked())
            {
                value = km2miles(value);

            }
            if (p.isChecked())
            {
                value = miles2km(value);

            }
            if (q.isChecked())
            {
                value = yard2cm(value);

            }
            if (r.isChecked())
            {
                value = yard2m(value);

            }
            if (s.isChecked())
            {
                value = yard2inch(value);

            }
            if (v.isChecked())
            {
                value = foot2cm(value);

            }
            if (w.isChecked())
            {
                value = foot2inch(value);

            }
            if (x.isChecked())
            {
                value = foot2yard(value);

            }
           length.setText(Double.toString(value));
        }
    public void clear (View view)
    {
        length = (EditText)findViewById(R.id.editText);


        length.setText("");

    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        RelativeLayout main_view =  (RelativeLayout)findViewById(R.id.Length);
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



