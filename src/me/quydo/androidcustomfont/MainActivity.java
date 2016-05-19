package me.quydo.androidcustomfont;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import me.quydo.androidcustomfont.util.TypefaceUtil;

/**
 * 
 * @author quydm
 *
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);

		int[] textIds = { R.id.textview_normal, R.id.textview_bold, R.id.textview_italic, R.id.textview_bold_italic };
		int[] editTextIds = { R.id.edittext_normal, R.id.edittext_bold, R.id.edittext_italic,
				R.id.edittext_bold_italic };
		int[] buttonIds = { R.id.button_normal, R.id.button_bold, R.id.button_italic, R.id.button_bold_italic };
		int[] checkboxIds = { R.id.checkbox_normal, R.id.checkbox_bold, R.id.checkbox_italic,
				R.id.checkbox_bold_italic };

		for (int i = 0; i < textIds.length; i++) {
			TextView txt = (TextView) findViewById(textIds[i]);
			txt.setTypeface(TypefaceUtil.getInstance(this).getTypeface(txt.getTypeface()));
		}

		for (int i = 0; i < editTextIds.length; i++) {
			EditText txt = (EditText) findViewById(editTextIds[i]);
			txt.setTypeface(TypefaceUtil.getInstance(this).getTypeface(txt.getTypeface()));
		}

		for (int i = 0; i < buttonIds.length; i++) {
			Button btn = (Button) findViewById(buttonIds[i]);
			btn.setTypeface(TypefaceUtil.getInstance(this).getTypeface(btn.getTypeface()));
		}

		for (int i = 0; i < checkboxIds.length; i++) {
			CheckBox cbx = (CheckBox) findViewById(checkboxIds[i]);
			cbx.setTypeface(TypefaceUtil.getInstance(this).getTypeface(cbx.getTypeface()));
		}
	}

}
