package com.udacity.gradle.builditbigger;

import android.app.Application;
import android.test.ApplicationTestCase;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> implements JokeAsyncTask.OnJokeRetrievedListener {

    CountDownLatch signal;
    String joke;

    public ApplicationTest() {
        super(Application.class);
    }

    public void testJoke() {

        signal = new CountDownLatch(1);

        try {
            new JokeAsyncTask(this).execute();
            boolean pass = signal.await(20, TimeUnit.SECONDS);
            if (!pass) {
                fail("timed out");
            }
        } catch (Exception e) {
            fail();
        }


    }

    @Override
    public void onJokeRetrieved(String joke) {
        this.joke = joke;
        assertNotNull("joke = null", joke);
        assertFalse("joke = empty", joke.isEmpty());
        signal.countDown();
    }


}