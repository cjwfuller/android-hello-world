package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ConfigPlanet extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_config);
		
		EditText colonyText = (EditText)findViewById(R.id.editTextColonies);
		colonyText.setText("1", EditText.BufferType.EDITABLE);
		
		EditText colonistText = (EditText)findViewById(R.id.editTextColonists);
		colonistText.setText("100", EditText.BufferType.EDITABLE);
		
		EditText basesText = (EditText)findViewById(R.id.editTextBases);
		basesText.setText("1", EditText.BufferType.EDITABLE);
		
		EditText militaryText = (EditText)findViewById(R.id.editTextMilitary);
		militaryText.setText("", EditText.BufferType.EDITABLE);
		
		EditText forcefieldOnText = (EditText)findViewById(R.id.editTextForcefieldOn);
		forcefieldOnText.setText("", EditText.BufferType.EDITABLE);

		EditText forcefieldOffText = (EditText)findViewById(R.id.editTextForcefieldOff);
		forcefieldOffText.setText("Forcefield is Off", EditText.BufferType.EDITABLE);
		
		Button doneButton = (Button)findViewById(R.id.doneButton);
		doneButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
		});
		
		Button colonyButton = (Button)findViewById(R.id.coloniesButton);
		colonyButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
		});
		
		Button baseButton = (Button)findViewById(R.id.basesButton);
		baseButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
		});
		
		Button colonistButton = (Button)findViewById(R.id.colonistsButton);
		colonistButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
		});	
		
		Button militaryButton = (Button)findViewById(R.id.militaryButton);
		militaryButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
		});		
		
		Button forceFieldOnButton = (Button)findViewById(R.id.ffonButton);
		forceFieldOnButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
		});		
		
		Button forceFieldOffButton = (Button)findViewById(R.id.ffoffButton);
		forceFieldOffButton.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) { finish(); }
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
