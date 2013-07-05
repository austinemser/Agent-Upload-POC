package com.example.agentupload;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;

/**
 * Created by aemser on 7/3/13.
 */
public class ChoosePictureSourceActivity extends Activity {
    private static final int CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE = 100;
    private Uri fileUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_picture);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(requestCode == CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE)
        {
            if(resultCode == RESULT_OK)
            {
                //TODO: image capture and saved to fileUri
            }else if(resultCode == RESULT_CANCELED)
            {
                //TODO: user canceled image
            } else {
                //TODO: image capture failed
            }
        }
    }

    //Button Click events
    public void btnNewPictures_Click(View v)
    {
        Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        fileUri = getOutputMediaFileUri(MEDIA_TYPE_IMAGE);
        cameraIntent.putExtra(MediaStore.EXTRA_OUTPUT, fileUri);
        startActivityForResult(cameraIntent, CAPTURE_IMAGE_ACTIVITY_REQUEST_CODE);
    }

    public void btnFromGallery_Click(View v)
    {

    }

    public void btnUploadWithoutPictures_Click(View v)
    {

    }
}
