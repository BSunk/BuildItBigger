package com.udacity.gradle.builditbigger;
import android.test.AndroidTestCase;
import android.util.Log;
import org.junit.Test;
import java.util.concurrent.ExecutionException;

/**
 * Created by Bharat on 7/10/2016.
 */
public class AsyncTaskTest extends AndroidTestCase{

    String LOG_TAG = "AsyncTask Test";
    //Function to test the endpoints asynctask. The result of the task is returned and
    //stored in a string. The result is checked if the string is null, if the string is empty
    //or if the string has a error code.
    @Test
    public void testVerifyAsyncResult() {
        try {
            String result = new EndpointsAsyncTask(mContext).execute().get();
            Log.v(LOG_TAG, result);
            assertNotNull(result);
            if (result.contains("failed to connect to")| result.isEmpty()) {
                fail("Result:" + result);
            }
        }
        catch (InterruptedException|ExecutionException e) {
            Log.e(LOG_TAG, e.toString());
            fail(e.toString());
        }

    }
}
