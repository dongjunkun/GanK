# Add project specific ProGuard rules here.
# By default, the flags in this file are appended to flags specified
# in D:\Android1\sdk/tools/proguard/proguard-android.txt
# You can edit the include path and order by changing the proguardFiles
# directive in build.gradle.
#
# For more details, see
#   http://developer.android.com/guide/developing/tools/proguard.html

# Add any project specific keep options here:

# If your project uses WebView with JS, uncomment the following
# and specify the fully qualified class name to the JavaScript interface
# class:
#-keepclassmembers class fqcn.of.javascript.interface.for.webview {
#   public *;
#}

# view res/layout/design_navigation_item.xml #generated:17
-keep class android.support.design.internal.NavigationMenuItemView { <init>(...); }

# view res/layout/design_navigation_menu.xml #generated:17
-keep class android.support.design.internal.NavigationMenuView { <init>(...); }

# view res/layout/design_layout_snackbar.xml #generated:18
# view sw600dp-v13\res/layout-sw600dp-v13/design_layout_snackbar.xml #generated:18
-keep class android.support.design.widget.Snackbar$SnackbarLayout { <init>(...); }

# view res/layout/abc_alert_dialog_material.xml #generated:75
-keep class android.support.v4.widget.NestedScrollView { <init>(...); }

# view res/layout/abc_alert_dialog_button_bar_material.xml #generated:40
-keep class android.support.v4.widget.Space { <init>(...); }

# view res/layout/abc_action_menu_item_layout.xml #generated:17
-keep class android.support.v7.view.menu.ActionMenuItemView { <init>(...); }

# view res/layout/abc_expanded_menu_layout.xml #generated:17
-keep class android.support.v7.view.menu.ExpandedMenuView { <init>(...); }

# view res/layout/abc_list_menu_item_layout.xml #generated:17
# view res/layout/abc_popup_menu_item_layout.xml #generated:17
-keep class android.support.v7.view.menu.ListMenuItemView { <init>(...); }

# view res/layout/abc_screen_toolbar.xml #generated:27
-keep class android.support.v7.widget.ActionBarContainer { <init>(...); }

# view res/layout/abc_action_mode_bar.xml #generated:19
# view res/layout/abc_screen_toolbar.xml #generated:43
-keep class android.support.v7.widget.ActionBarContextView { <init>(...); }

# view res/layout/abc_screen_toolbar.xml #generated:17
-keep class android.support.v7.widget.ActionBarOverlayLayout { <init>(...); }

# view res/layout/abc_action_menu_layout.xml #generated:17
-keep class android.support.v7.widget.ActionMenuView { <init>(...); }

# view res/layout/abc_activity_chooser_view.xml #generated:19
-keep class android.support.v7.widget.ActivityChooserView$InnerLayout { <init>(...); }

# view res/layout/abc_alert_dialog_button_bar_material.xml #generated:18
-keep class android.support.v7.widget.ButtonBarLayout { <init>(...); }

# view res/layout/item_android.xml #generated:2
# view res/layout/item_fuli.xml #generated:2
-keep class android.support.v7.widget.CardView { <init>(...); }

# view res/layout/abc_screen_content_include.xml #generated:19
-keep class android.support.v7.widget.ContentFrameLayout { <init>(...); }

# view res/layout/abc_alert_dialog_material.xml #generated:48
-keep class android.support.v7.widget.DialogTitle { <init>(...); }

# view res/layout/abc_screen_simple_overlay_action_mode.xml #generated:23
-keep class android.support.v7.widget.FitWindowsFrameLayout { <init>(...); }

# view res/layout/abc_dialog_title_material.xml #generated:22
# view res/layout/abc_screen_simple.xml #generated:17
-keep class android.support.v7.widget.FitWindowsLinearLayout { <init>(...); }

# view res/layout/abc_search_view.xml #generated:78
-keep class android.support.v7.widget.SearchView$SearchAutoComplete { <init>(...); }

# view res/layout/abc_screen_toolbar.xml #generated:36
-keep class android.support.v7.widget.Toolbar { <init>(...); }

# view res/layout/abc_screen_simple.xml #generated:25
# view res/layout/abc_screen_simple_overlay_action_mode.xml #generated:32
-keep class android.support.v7.widget.ViewStubCompat { <init>(...); }

# view res/layout/md_stub_colorchooser_grid.xml #generated:2
-keep class com.afollestad.materialdialogs.color.FillGridView { <init>(...); }

# view res/layout/md_stub_actionbuttons.xml #generated:10
# view res/layout/md_stub_actionbuttons.xml #generated:17
# view res/layout/md_stub_actionbuttons.xml #generated:5
-keep class com.afollestad.materialdialogs.internal.MDButton { <init>(...); }

# view res/layout/md_dialog_basic.xml #generated:1
# view res/layout/md_dialog_custom.xml #generated:1
# view res/layout/md_dialog_input.xml #generated:1
# view res/layout/md_dialog_list.xml #generated:1
# view res/layout/md_dialog_progress.xml #generated:1
# view res/layout/md_dialog_progress_indeterminate.xml #generated:1
# view res/layout/md_dialog_progress_indeterminate_horizontal.xml #generated:1
-keep class com.afollestad.materialdialogs.internal.MDRootLayout { <init>(...); }

# view res/layout/fragment_android.xml #generated:1
-keep class com.aspsine.swipetoloadlayout.SwipeToLoadLayout { <init>(...); }

# view AndroidManifest.xml #generated:18
-keep class com.yyydjk.gank.App { <init>(...); }

# view AndroidManifest.xml #generated:25
-keep class com.yyydjk.gank.activitys.MainActivity { <init>(...); }

# view res/layout/fragment_android.xml #generated:22
-keep class com.yyydjk.gank.theme.ColorListView { <init>(...); }

# view res/layout/activity_main.xml #generated:10
# view res/layout/tool_bar_layout.xml #generated:2
-keep class com.yyydjk.gank.theme.ColorRelativeLayout { <init>(...); }

# view res/layout/item_android.xml #generated:8
-keep class com.yyydjk.gank.theme.ColorTextView { <init>(...); }

# view res/layout/activity_main.xml #generated:144
-keep class com.yyydjk.gank.theme.ColorView { <init>(...); }

# view res/layout/activity_main.xml #generated:2
-keep class com.yyydjk.gank.widget.ResideLayout { <init>(...); }

# view res/layout/layout_google_hook_header.xml #generated:9
-keep class com.yyydjk.gank.widget.refresh.GoogleCircleProgressView { <init>(...); }

# view res/layout/layout_google_footer.xml #generated:2
-keep class com.yyydjk.gank.widget.refresh.footer.GoogleLoadMoreFooterView { <init>(...); }

# view res/layout/layout_google_hook_header.xml #generated:2
-keep class com.yyydjk.gank.widget.refresh.header.GoogleCircleHookRefreshHeaderView { <init>(...); }

# view res/layout/layout_google_header.xml #generated:2
-keep class com.yyydjk.gank.widget.refresh.header.GoogleRefreshHeaderView { <init>(...); }

# Glide specific rules #
# https://github.com/bumptech/glide

-keep public class * implements com.bumptech.glide.module.GlideModule
-keep public enum com.bumptech.glide.load.resource.bitmap.ImageHeaderParser$** {
    **[] $VALUES;
    public *;
}

# ButterKnife 7

-keep class butterknife.** { *; }
-dontwarn butterknife.internal.**
-keep class **$$ViewBinder { *; }

-keepclasseswithmembernames class * {
    @butterknife.* <fields>;
}

-keepclasseswithmembernames class * {
    @butterknife.* <methods>;
}
## GSON 2.2.4 specific rules ##

# Gson uses generic type information stored in a class file when working with fields. Proguard
# removes such information by default, so configure it to keep all of it.
-keepattributes Signature

# For using GSON @Expose annotation
-keepattributes *Annotation*

-keepattributes EnclosingMethod

# Gson specific classes
-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }

# Okio
-keep class sun.misc.Unsafe { *; }
-dontwarn java.nio.file.*
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
-dontwarn okio.**

# OkHttp
-keepattributes Signature
-keepattributes *Annotation*
-keep class okhttp3.** { *; }
-keep interface okhttp3.** { *; }
-dontwarn okhttp3.**

-dontwarn jp.co.cyberagent.android.gpuimage.**
-dontwarn net.sourceforge.pinyin4j.**

-keep class com.yyydjk.gank.beans.** { *; }