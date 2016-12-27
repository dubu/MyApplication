package com.example.rigel.myapplication;

import org.junit.Test;

/**
 * Created by rigel on 12/27/16.
 */

public class FireBaseTest {


    @Test
    public void na() throws Exception {


    }

    @Test
    public void testWrite() throws Exception {

        // Write a message to the database
//        FirebaseDatabase database = FirebaseDatabase.getInstance();
//        DatabaseReference myRef = database.getReference("message");
//
//        myRef.setValue("Hello, World! DUBU");


        FireService service = new FireService();
        service.write();

    }



    @Test
    public void verifySignUpButtonDisplayed() {
//        onView(ViewMatchers.withId(R.id.fab)).check(matches(isDisplayed()));
    }
}
