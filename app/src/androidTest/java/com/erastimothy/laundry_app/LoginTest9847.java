package com.erastimothy.laundry_app;


import androidx.test.espresso.DataInteraction;
import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import static androidx.test.InstrumentationRegistry.getInstrumentation;
import static androidx.test.espresso.Espresso.onData;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.Espresso.openActionBarOverflowOrOptionsMenu;
import static androidx.test.espresso.action.ViewActions.*;
import static androidx.test.espresso.assertion.ViewAssertions.*;
import static androidx.test.espresso.matcher.ViewMatchers.*;

import com.erastimothy.laundry_app.R;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.hamcrest.core.IsInstanceOf;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.anything;
import static org.hamcrest.Matchers.is;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class LoginTest9847 {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<> ( MainActivity.class );

    @Test
    public void loginTest9847() {
        ViewInteraction materialButton = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        4),
                                2 ) ) );
        materialButton.perform (scrollTo (), click () );

        ViewInteraction textInputEditText = onView (
                allOf ( withId ( R.id.email_et ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText.perform ( scrollTo (), replaceText ( "ditoananda0@gmail.com" ), closeSoftKeyboard () );

        ViewInteraction textInputEditText2 = onView (
                allOf ( withId ( R.id.password_et ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText2.perform ( scrollTo (), replaceText ( "merbabu" ), closeSoftKeyboard () );

        ViewInteraction materialButton2 = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        0 ),
                                3 ) ) );
        materialButton2.perform ( scrollTo (), click () );

        ViewInteraction textInputEditText3 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda0@gmail.com" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText3.perform ( scrollTo (), replaceText ( "ditoananda" ) );

        ViewInteraction textInputEditText4 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText4.perform ( closeSoftKeyboard () );

        ViewInteraction textInputEditText5 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "merbabu" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText5.perform ( scrollTo (), replaceText ( "belajar" ) );

        ViewInteraction textInputEditText6 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "belajar" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText6.perform ( closeSoftKeyboard () );

        ViewInteraction materialButton3 = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        0 ),
                                3 ) ) );
        materialButton3.perform ( scrollTo (), click () );

        ViewInteraction textInputEditText7 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText7.perform ( scrollTo (), replaceText ( "ditoananda0@gmail.com" ) );

        ViewInteraction textInputEditText8 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda0@gmail.com" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText8.perform ( closeSoftKeyboard () );

        ViewInteraction textInputEditText9 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "belajar" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText9.perform ( scrollTo (), longClick () );

        ViewInteraction textInputEditText10 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "belajar" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText10.perform ( scrollTo (), replaceText ( "12345678" ) );

        ViewInteraction textInputEditText11 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "12345678" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText11.perform ( closeSoftKeyboard () );

        ViewInteraction materialButton4 = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        0 ),
                                3 ) ) );
        materialButton4.perform ( scrollTo (), click () );

        ViewInteraction textInputEditText12 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda0@gmail.com" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText12.perform ( scrollTo (), replaceText ( "ditoananda@gmail.com" ) );

        ViewInteraction textInputEditText13 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda@gmail.com" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText13.perform ( closeSoftKeyboard () );

        ViewInteraction textInputEditText14 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "12345678" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText14.perform ( scrollTo (), replaceText ( "belajar" ) );

        ViewInteraction textInputEditText15 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "belajar" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText15.perform ( closeSoftKeyboard () );

        ViewInteraction materialButton5 = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        0 ),
                                3 ) ) );
        materialButton5.perform ( scrollTo (), click () );

        ViewInteraction textInputEditText16 = onView (
                allOf ( withId ( R.id.email_et ), withText ( "ditoananda@gmail.com" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText16.perform ( scrollTo (), replaceText ( " " ) );

        ViewInteraction textInputEditText17 = onView (
                allOf ( withId ( R.id.email_et ), withText ( " " ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText17.perform ( closeSoftKeyboard () );

        ViewInteraction textInputEditText18 = onView (
                allOf ( withId ( R.id.password_et ), withText ( "belajar" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText18.perform ( scrollTo (), replaceText ( " " ) );

        ViewInteraction textInputEditText19 = onView (
                allOf ( withId ( R.id.password_et ), withText ( " " ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText19.perform ( closeSoftKeyboard () );

        ViewInteraction materialButton6 = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        0 ),
                                3 ) ) );
        materialButton6.perform ( scrollTo (), click () );

        ViewInteraction textInputEditText20 = onView (
                allOf ( withId ( R.id.password_et ), withText ( " " ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText20.perform ( scrollTo (), replaceText ( "" ) );

        ViewInteraction textInputEditText21 = onView (
                allOf ( withId ( R.id.password_et ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText21.perform ( closeSoftKeyboard () );

        ViewInteraction textInputEditText22 = onView (
                allOf ( withId ( R.id.email_et ), withText ( " " ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText22.perform ( scrollTo (), replaceText ( " ditoananda0@gmail.com" ) );

        ViewInteraction textInputEditText23 = onView (
                allOf ( withId ( R.id.email_et ), withText ( " ditoananda0@gmail.com" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ),
                        isDisplayed () ) );
        textInputEditText23.perform ( closeSoftKeyboard () );

        ViewInteraction textInputEditText24 = onView (
                allOf ( withId ( R.id.password_et ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "com.google.android.material.textfield.TextInputLayout" ) ),
                                        0 ),
                                0 ) ) );
        textInputEditText24.perform ( scrollTo (), replaceText ( "belajar" ), closeSoftKeyboard () );

        ViewInteraction materialButton7 = onView (
                allOf ( withId ( R.id.btnSignIn ), withText ( "Sign In" ),
                        childAtPosition (
                                childAtPosition (
                                        withClassName ( is ( "android.widget.ScrollView" ) ),
                                        0 ),
                                3 ) ) );
        materialButton7.perform ( scrollTo (), click () );
    }

    private static Matcher<View> childAtPosition(
            final Matcher<View> parentMatcher, final int position) {

        return new TypeSafeMatcher<View> () {
            @Override
            public void describeTo(Description description) {
                description.appendText ( "Child at position " + position + " in parent " );
                parentMatcher.describeTo ( description );
            }

            @Override
            public boolean matchesSafely(View view) {
                ViewParent parent = view.getParent ();
                return parent instanceof ViewGroup && parentMatcher.matches ( parent )
                        && view.equals ( ((ViewGroup) parent).getChildAt ( position ) );
            }
        };
    }
}
