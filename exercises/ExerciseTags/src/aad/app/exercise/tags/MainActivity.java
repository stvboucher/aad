package aad.app.exercise.tags;

import android.graphics.Color;
import android.net.Uri;

public class MainActivity extends BaseActivity {

	@Override
	public void onResume() {
		super.onResume();

		// TODO 4.1 Extract our URI
		Uri xsUri = getNDEFUri(getIntent());		
		if (xsUri != null) {	
			mPathTextView.setBackgroundColor(Color.BLUE);
			mPathTextView.setText(xsUri.getLastPathSegment());
		}
	}

}
