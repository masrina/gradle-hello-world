package my.app.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.TextView;

import com.example.admin.myapplication.MyActivity;
import com.example.admin.myapplication.R;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ActivityInstrumentationTestCase2<MyActivity> {
    MyActivity myActivity;
    TextView textView;
    public ApplicationTest() {
        super("com.example.admin.myapplication", MyActivity.class);
    }
    public void setUp() throws Exception {
        super.setUp();
        myActivity = this.getActivity();
        textView = (TextView) myActivity.findViewById(R.id.hello);
    }

    public void test() throws Exception {
        setUp();
        assertEquals("Hello world!", textView.getText().toString());
    }
}