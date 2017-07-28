package in.ac.iiitmanipur.iiitm;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static android.R.attr.button;
import static android.text.TextUtils.TruncateAt.MARQUEE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        myToolbar.setSubtitle("Indian Institute of Information Technology, Manipur");
        setSupportActionBar(myToolbar);

        //to show that about is active
        Button button = (Button) findViewById(R.id.about);
        button.setBackgroundColor(Color.WHITE);
        //to activate links in about section at startup
        TextView textView =(TextView) findViewById(R.id.variable_text);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        //auto scroll
        TextView ntextView = (TextView) findViewById(R.id.textView2);
        ntextView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        ntextView.setSelected(true);
        ntextView.setSingleLine(true);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }
//tool bar
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_settings:
                // User chose the "Settings" item, show the app settings UI...
                return true;

           // case R.id.action_favorite:
                // User chose the "Favorite" action, mark the current item
                // as a favorite...
              //  return true;

            default:
                // If we got here, the user's action was not recognized.
                // Invoke the superclass to handle it.
                return super.onOptionsItemSelected(item);

        }
    }


    //Setting title color for variable text view buttons
    public void wings(View View){
        TextView textView =(TextView) findViewById(R.id.variable_text);
        Button button1 = (Button) findViewById(R.id.wings);
        Button button2 = (Button) findViewById(R.id.admission);
        Button button3 = (Button) findViewById(R.id.about);
        button1.setBackgroundColor(Color.WHITE);
        button2.setBackgroundColor(Color.parseColor("#ff9800"));
        button3.setBackgroundColor(Color.parseColor("#ff9800"));
        textView.setText(R.string.wings);
        //activating link in text view
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }
    public void admission(View View){
        TextView textView =(TextView) findViewById(R.id.variable_text);
        Button button1 = (Button) findViewById(R.id.wings);
        Button button2 = (Button) findViewById(R.id.admission);
        Button button3 = (Button) findViewById(R.id.about);
        button1.setBackgroundColor(Color.parseColor("#ff9800"));
        button2.setBackgroundColor(Color.WHITE);
        button3.setBackgroundColor(Color.parseColor("#ff9800"));
        textView.setText(R.string.admission);
        //activating link in text view
        textView.setMovementMethod(LinkMovementMethod.getInstance());

    }
    public void about_iiit(View View){
        TextView textView =(TextView) findViewById(R.id.variable_text);
        Button button1 = (Button) findViewById(R.id.wings);
        Button button2 = (Button) findViewById(R.id.admission);
        Button button3 = (Button) findViewById(R.id.about);
        button1.setBackgroundColor(Color.parseColor("#ff9800"));
        button2.setBackgroundColor(Color.parseColor("#ff9800"));
        button3.setBackgroundColor(Color.WHITE);
        textView.setText(R.string.About_IIITm);
        //activating link in text view
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    //Showing map info
    public void show_map(View View){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("geo:0,0?q=Indian institute of information technology, manipur"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //Youtube Channel
    public void open_youtube(View View){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.youtube.com/channel/UCO8iRHKrWvadC_2xdC24MzQ"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //open fb
    public void open_fb(View View){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.facebook.com/insightiiitm/"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //open iiitwebsite
    public void open_web(View View){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iiitmanipur.ac.in/"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //for sending Querry
    public void composeEmail(View View) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:v.aman@iiitmanipur.ac.in?subject=From%20mobile%20app")); // only email apps should handle this
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
    //show people
    public void show_people(View View){
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("http://www.iiitmanipur.ac.in/pages/students.html"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }


    }
