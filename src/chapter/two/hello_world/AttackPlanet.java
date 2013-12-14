package chapter.two.hello_world;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.Toast;

public class AttackPlanet extends Activity {
	
	private MediaPlayer bombPlayer = null;
	private MediaPlayer transportPlayer = null;
	private MediaPlayer virusPlayer = null;
	private MediaPlayer laserPlayer = null;
	
	private void setAudioPlayers() {
		bombPlayer = MediaPlayer.create(getApplicationContext(), R.raw.blast);
		transportPlayer = MediaPlayer.create(getApplicationContext(), R.raw.transport);
		virusPlayer = MediaPlayer.create(getApplicationContext(), R.raw.virus);
		laserPlayer = MediaPlayer.create(getApplicationContext(), R.raw.laser);
	}
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attack);
		setAudioPlayers();
		ImageButton exitButton = (ImageButton)findViewById(R.id.exitButton);
		exitButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		ImageButton bombButton = (ImageButton)findViewById(R.id.bombButton);
		Animation rotateBomb = AnimationUtils.loadAnimation(this, R.anim.anim_rot_bomb);
		bombButton.startAnimation(rotateBomb);
		bombButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Bombs Away!", Toast.LENGTH_SHORT).show();
				bombPlayer.start();
			}
		});
		
		ImageButton invadeButton = (ImageButton)findViewById(R.id.invadeButton);
		Animation alphaInvade = AnimationUtils.loadAnimation(this, R.anim.anim_alpha_invade);
		invadeButton.startAnimation(alphaInvade);
		invadeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Troops Sent", Toast.LENGTH_SHORT).show();
				transportPlayer.start();
			}
		});
		
		ImageButton infectButton = (ImageButton)findViewById(R.id.infectButton);
		Animation scaleVirus = AnimationUtils.loadAnimation(this, R.anim.anim_scale_virus);
		infectButton.startAnimation(scaleVirus);
		infectButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Virus Spread", Toast.LENGTH_SHORT).show();
				virusPlayer.start();
			}
		});
		
		ImageButton laserButton = (ImageButton)findViewById(R.id.laserButton);
		Animation translateLaser = AnimationUtils.loadAnimation(this, R.anim.anim_trans_laser);
		laserButton.startAnimation(translateLaser);
		laserButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Laser Fired!", Toast.LENGTH_SHORT).show();
				laserPlayer.start();
			}
		});
	}
	
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		if(keyCode == KeyEvent.KEYCODE_X) {
			finish();
			return true;
		}
		return false;
	}
}
