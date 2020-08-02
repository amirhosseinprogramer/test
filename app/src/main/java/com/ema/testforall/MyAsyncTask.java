package com.ema.testforall;

import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MyAsyncTask extends AsyncTask<Void,Integer,String> {

    ProgressBar progressBar;
    TextView textView;

    MyAsyncTask(ProgressBar progressBar, TextView textView){
        this.progressBar = progressBar;
        this.textView = textView;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    @Override
    protected String doInBackground(Void... voids) {
        for (int i = 0; i <10000000 ; i++) {
            app.l(i);
            publishProgress(i);
        }
        return "Done";
    }

    @Override
    protected void onPostExecute(String aVoid) {
        super.onPostExecute(aVoid);
        textView.setText(aVoid);
        progressBar.setVisibility(View.INVISIBLE);

    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
        progressBar.setProgress(values[0]);
    }
}
