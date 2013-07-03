package com.example.agentupload;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by aemser on 7/2/13.
 */
public class AgentUploadMainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent loginIntent = new Intent("com.example.agentupload.LoginActivity");
        startActivity(loginIntent);
        setContentView(R.layout.activity_agent_upload);

        //test first commit
    }

    public void btnUploadPictures_Click(View v)
    {
        finish();
    }
}
