package chapter.two.hello_world;
import chapter.two.hello_world.R;
import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.drawable.TransitionDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;


public class TimePlanet extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_time);
		final TransitionDrawable trans = 
				(TransitionDrawable)getResources().getDrawable(R.drawable.tran_stars_galaxy);
		LinearLayout timePlanetScreen = (LinearLayout)findViewById(R.id.timePlanetScreen);
		timePlanetScreen.setBackground(trans);
		trans.startTransition(5000);
		
		Button returnFromTimeButton = (Button)findViewById(R.id.timeButton);
		returnFromTimeButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 
				Intent returnIntent = new Intent(); 
				setResult(RESULT_OK, returnIntent);
				finish();
			}
		});
		
		
		Button startTimerButton = (Button)findViewById(R.id.startCounter);
		startTimerButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 
				startTimer(v);
			}
		});
		
		Button startMusicServiceButton = (Button)findViewById(R.id.startServiceButton);
		startMusicServiceButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 
				startService(new Intent(TimePlanet.this, MusicService.class));
			}
		});
		
		Button stopMusicServiceButton = (Button)findViewById(R.id.stopServiceButton);
		stopMusicServiceButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { 
				stopService(new Intent(TimePlanet.this, MusicService.class));
			}
		});
	}
	
	public void startTimer(View v) {
		EditText alarmText = (EditText)findViewById(R.id.setAlarm);
		int i = Integer.parseInt(alarmText.getText().toString());
		Intent intent = new Intent(this, AlarmReceiver.class);
		PendingIntent alarmIntent = PendingIntent.getBroadcast(this.getApplicationContext(), 23432443, intent, 0);
		AlarmManager alarmManager = (AlarmManager)getSystemService(ALARM_SERVICE);
		alarmManager.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (i * 1000), alarmIntent);
		Toast.makeText(this, "Alarm set in " + i + " seconds", Toast.LENGTH_SHORT).show();
	}
}
