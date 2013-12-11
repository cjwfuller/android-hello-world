package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ConfigPlanet extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_config);
		Button doneButton = (Button)findViewById(R.id.doneButton);
		doneButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
