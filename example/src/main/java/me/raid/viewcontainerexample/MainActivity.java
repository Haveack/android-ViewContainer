package me.raid.viewcontainerexample;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import me.raid.viewcontainerexample.ui.MainActivityViewContainer;


public class MainActivity extends ActionBarActivity {

    private MainActivityViewContainer contentView = new MainActivityViewContainer(android.R.id.content);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(contentView.LAYOUT_ID);
        contentView.init(findViewById(contentView.getId()));

        setUpViews();
    }

    private void setUpViews() {
        contentView.upperLine.tvLeft.getView().setText("ID:");
        contentView.lowerLine.tvLeft.getView().setText("Pass:");
        contentView.btnGo.getView().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String id = contentView.upperLine.etRight.getView().getText().toString();
                String pass = contentView.lowerLine.etRight.getView().getText().toString();
                Toast.makeText(MainActivity.this, id + "\n" + pass, Toast.LENGTH_SHORT).show();
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
