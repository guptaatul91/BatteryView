package in.technobuff.batteryviewsampleapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import in.technobuff.widgets.BatteryView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    protected void onResume() {
        super.onResume();
        BatteryView ivBatteryStatus  =  (BatteryView) findViewById(R.id.ivBatteryStatus) ;
        ivBatteryStatus.setBatteryStatus(90);
    }
}
