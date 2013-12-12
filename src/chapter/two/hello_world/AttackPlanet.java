package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class AttackPlanet extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attack);
		ImageButton exitButton = (ImageButton)findViewById(R.id.exitButton);
		exitButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
		
		ImageButton bombButton = (ImageButton)findViewById(R.id.bombButton);
		bombButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Bombs Away!", Toast.LENGTH_SHORT).show();
			}
		});
		
		ImageButton invadeButton = (ImageButton)findViewById(R.id.invadeButton);
		invadeButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Troops Sent", Toast.LENGTH_SHORT).show();
			}
		});
		
		ImageButton infectButton = (ImageButton)findViewById(R.id.infectButton);
		infectButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Virus Spread", Toast.LENGTH_SHORT).show();
			}
		});
		
		ImageButton laserButton = (ImageButton)findViewById(R.id.laserButton);
		laserButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(AttackPlanet.this, "Laser Fired!", Toast.LENGTH_SHORT).show();
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
