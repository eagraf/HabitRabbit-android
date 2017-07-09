package com.ethangraf.habitrabbit;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

/**
 * Created by ethan on 7/7/17.
 */

public class HabitActivity extends AppCompatActivity {

    private boolean completed = false;
    private boolean delayed = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_habit);
    }

    @Override
    protected void onPause() {
        super.onPause();

        // If activity is not completed
        if (!this.completed && !this.delayed) {
            Toast.makeText(this, "Bad boi", Toast.LENGTH_SHORT).show();
        }


    }

    /* Called when user claims they are performing habit right now */
    public void doNow(View view) {

    }

    /* Called when user claims they have already completed a habit */
    public void alreadyDone(View view) {
        this.completed = true;

        // Return to phone home screen
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        finish();
    }

    /* Called when the user asks the app to delay the habit */
    public void doLater(View view) {
        this.delayed = true;

        // Return to phone home screen
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        startActivity(intent);
        finish();
    }
}
