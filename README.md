Load custom font in an Android application. In this example, I use Roboto font.

If you use ProGuard, add following lines to the ProGuard configuration file

-keep class me.quydo.androidcustomfont.customview.** { *; }
-dontwarn me.quydo.androidcustomfont.customview.**