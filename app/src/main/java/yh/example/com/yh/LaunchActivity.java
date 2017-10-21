package yh.example.com.yh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.VideoView;

import java.io.File;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
//        startActivity(new Intent(this,SelectAddressActivity.class));



        VideoView videoView = (VideoView) findViewById(R.id.videoView);



        // 此时的f.getAbsolutePath()=/storage/emulated/0/DCIM//\Camera/test.mp4
        videoView.setVideoPath("file:///assets/i.mp4");

        // 开始播放视频
        videoView.start();

        // VideiView获焦点
        // videoView.requestFocus();












    }
}
