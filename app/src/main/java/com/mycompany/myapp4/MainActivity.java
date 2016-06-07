package com.mycompany.myapp4;

import android.app.*;
import android.os.*;
import android.view.*;
import android.text.method.*;
import android.content.*;
import android.graphics.drawable.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {//create view
        super.onCreate(savedInstanceState);
    
        setContentView(R.layout.main);
    }
    
	public void sendMessage(View view)
    {//button event
		AlertDialog.Builder dialog = new AlertDialog.Builder
		(MainActivity.this);

        EditText tv1=(EditText) findViewById(R.id.mainEditText);
        String ETtext = tv1.getText().toString();
      
        dialog.setTitle("Dialog");
		dialog.setMessage("set text to "+"‘"+ETtext+"’");
      	dialog.show();
        
        TextView tv2=(TextView) findViewById(R.id.mainTextView);
		tv2.setText(ETtext);
        tv1.setText("");
        
	}
 
    public boolean onCreateOptionsMenu(Menu menu)
    {//create menu
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }
    
    int i=1;
    public void reMode() 
    {//change mode event
        
        if(i == 1)
        {
            setContentView(R.layout.control);
            i++;
        }
        else if(i == 2)
        {
            setContentView(R.layout.main);
            i--;
        }
    }
    
    public boolean onOptionsItemSelected(MenuItem item)
    {//menu event
        switch (item.getItemId()) {
            case R.id.action_mode:
                reMode();
                return true;
            case R.id.action_settings:
               //...
                return true;
            case R.id.action_about:
               //...
                return true;
            case R.id.action_exit:
                System.exit(0);
                return true;
            default:
                return super.onOptionsItemSelected(item);
         }
     }
    
	
}
