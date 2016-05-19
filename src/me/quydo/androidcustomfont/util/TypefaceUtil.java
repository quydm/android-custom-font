package me.quydo.androidcustomfont.util;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;

/**
 * 
 * @author quydm
 *
 */
public class TypefaceUtil {

	private static final String ANDROID_SCHEMA = "http://schemas.android.com/apk/res/android";
	private static final String FONT_NORMAL = "fonts/Roboto/Roboto-Regular.ttf";
	private static final String FONT_BOLD = "fonts/Roboto/Roboto-Bold.ttf";
	private static final String FONT_ITALIC = "fonts/Roboto/Roboto-Italic.ttf";
	private static final String FONT_BOLD_ITALIC = "fonts/Roboto/Roboto-BoldItalic.ttf";

	private static TypefaceUtil instance = null;

	private Typeface normal;
	private Typeface italic;
	private Typeface bold;
	private Typeface boldItalic;

	public static TypefaceUtil getInstance(Context context) {
		if (instance == null)
			instance = new TypefaceUtil(context);
		return instance;
	}

	private TypefaceUtil(Context context) {
		normal = Typeface.createFromAsset(context.getAssets(), FONT_NORMAL);
		italic = Typeface.createFromAsset(context.getAssets(), FONT_ITALIC);
		bold = Typeface.createFromAsset(context.getAssets(), FONT_BOLD);
		boldItalic = Typeface.createFromAsset(context.getAssets(), FONT_BOLD_ITALIC);
	}

	public Typeface getTypeface(Typeface typeface) {
		if (typeface == null)
			return normal;

		int style = typeface.getStyle();
		if (style == Typeface.BOLD)
			return bold;
		if (style == Typeface.BOLD_ITALIC)
			return boldItalic;
		if (style == Typeface.ITALIC)
			return italic;

		return normal;
	}

	public Typeface getTypeface(AttributeSet attrs) {
		if (attrs == null)
			return normal;

		int textStyle = attrs.getAttributeIntValue(ANDROID_SCHEMA, "textStyle", Typeface.NORMAL);
		if (textStyle == Typeface.BOLD)
			return bold;
		if (textStyle == Typeface.BOLD_ITALIC)
			return boldItalic;
		if (textStyle == Typeface.ITALIC)
			return italic;

		return normal;
	}

}
