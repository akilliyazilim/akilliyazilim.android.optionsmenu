package akilliyazilim.android.optionsmenutest;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class OptionsMenuTest extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_options_menu_test);

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.options_menu_test, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		switch (item.getItemId()) {
		case R.id.Save:

			// When clicked Save option,do stuff here.
			Toast.makeText(getApplicationContext(), "Save Option Clicked.",
					Toast.LENGTH_SHORT).show();
			break;

		case R.id.logout:

			// When clicked log out option,do stuff here.
			Toast.makeText(getApplicationContext(), "Log Out Option Clicked.",
					Toast.LENGTH_SHORT).show();
			break;

		case R.id.exit:

			// When clicked exit option,do stuff here.
			Toast.makeText(getApplicationContext(), "Exit Option Clicked.",
					Toast.LENGTH_SHORT).show();
			break;

		default:
			break;
		}

		return super.onOptionsItemSelected(item);

	}

}
