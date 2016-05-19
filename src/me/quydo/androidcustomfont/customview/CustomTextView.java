package me.quydo.androidcustomfont.customview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import me.quydo.androidcustomfont.util.TypefaceUtil;

/**
 * @author quydm
 */
@SuppressLint("NewApi")
public class CustomTextView extends TextView {

	public CustomTextView(Context context) {
		super(context);
		setCustomFont(null);
	}

	public CustomTextView(Context context, AttributeSet attrs) {
		super(context, attrs);
		setCustomFont(attrs);
	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr) {
		super(context, attrs, defStyleAttr);
		setCustomFont(attrs);
	}

	public CustomTextView(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
		super(context, attrs, defStyleAttr, defStyleRes);
		setCustomFont(attrs);
	}

	private void setCustomFont(AttributeSet attrs) {
		if (!isInEditMode())
			setTypeface(TypefaceUtil.getInstance(getContext()).getTypeface(attrs));
	}

}
