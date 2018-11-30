package recordz.grind.icm.ronnie;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {


    ImageView imageView;
    Button button;
    static final int REQUEST_VIDEO_CAPTURE = 1;

    VideoView result_video;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button click = (Button)findViewById(R.id.videorec);
        result_video = (VideoView)findViewById(R.id.videoView);



////////aici incep sa implementez renumirea videoului


    }
    public void onImageGalleryClicked(View v) {


        Intent photoPickerIntent = new Intent(Intent.ACTION_PICK);


        Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);


    }






    public void dispatchTakeVideoIntent(View v) {
        Intent takeVideoIntent = new Intent(MediaStore.ACTION_VIDEO_CAPTURE);
        if (takeVideoIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takeVideoIntent, REQUEST_VIDEO_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent intent) {
        if (requestCode == REQUEST_VIDEO_CAPTURE && resultCode == RESULT_OK) {
            Uri videoUri = intent.getData();
            result_video.setVideoURI(videoUri);
        }
    }
}
