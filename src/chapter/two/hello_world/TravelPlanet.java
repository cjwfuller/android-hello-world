package chapter.two.hello_world;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TravelPlanet extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_travel);
		Button returnButton = (Button)findViewById(R.id.returnButton);
		returnButton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
