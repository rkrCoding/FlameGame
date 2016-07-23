package com.rkrgames.flamesgame;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Selection;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class playActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        ImageButton btnreset = (ImageButton)findViewById(R.id.imgReset);
        btnreset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final EditText eText = (EditText)findViewById(R.id.editText);
                final EditText eText2 = (EditText)findViewById(R.id.editText2);
                eText2.setText("");
                eText.setText("");


            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        final EditText eText = (EditText)findViewById(R.id.editText);
        final EditText eText2 = (EditText)findViewById(R.id.editText2);
        int x=eText.getSelectionStart();
        eText2.setText("");
        eText.setText("");
    }
    public  String cal(String n1,String n2)
    {
        final String flame[] = {"f", "l", "a", "m", "e"};
        String str = "flame",dn1=" ",dn2=" ";
        int index=0;
        dn1=n1;
        dn2=n2;
        for(int loop=0;loop<dn1.length();)
        {

            int pos=n2.indexOf(dn1.charAt(loop));
            if(pos > -1)
            {
                String s=  Character.toString(dn1.charAt(loop));
                dn1=dn1.replaceAll(s,"");
                dn2=dn2.replaceAll(s,"");

            }
            else
                loop++;
        }
        int flen = dn1.length() + dn2.length();
        if (flen <= 5) {
            str = flame[flen - 1];

        }
        else {

            while (str.length() > 1) {
                if (flen % str.length() == 0)
                    index = flen - str.length();
                else
                    index = flen % str.length();


                while (index > str.length()) {
                    if (flen % str.length() == 0)
                        index = index - str.length();
                    else
                        index = index % str.length();
                }
                System.out.println(index);
                if (index == 1)
                    str = str.substring(index, str.length());
                else if (index == str.length())
                    str = str.substring(0, index - 1);
                else
                    str = str.substring(index, str.length()) + str.substring(0, index - 1);

            }
        }
            return str;
    }
    public void newIntentClick(View view){
        final EditText eText = (EditText)findViewById(R.id.editText);
        final EditText eText2 = (EditText)findViewById(R.id.editText2);
        final String name1 = eText.getText().toString();
        final String name2 = eText2.getText().toString();
        String n1 = new String(name1);
        n1 = n1.toLowerCase();
        String n2 = new String(name2);
        n2 = n2.toLowerCase();

        if(TextUtils.isEmpty(eText.getText().toString()) || TextUtils.isEmpty(eText2.getText().toString()) )
        {
            Toast.makeText(this, "Please Enter the name  ", Toast.LENGTH_SHORT).show();

        }
        else if (n1.compareTo(n2)==0)
        {
            Toast.makeText(this, "Please change Any one of the name ", Toast.LENGTH_SHORT).show();
        }
        else
        {
        final String str1=cal(n1,n2);

            final Intent finalIntent = new Intent(playActivity.this, finalactivity.class);
            finalIntent.putExtra(Intent.EXTRA_TEXT, str1.toString());
            startActivity(finalIntent);

        }
    }
}
