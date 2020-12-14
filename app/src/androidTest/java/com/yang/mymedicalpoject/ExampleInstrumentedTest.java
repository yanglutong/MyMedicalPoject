package com.yang.mymedicalpoject;

import android.content.Context;

import com.yang.mymedicalpoject.utils.GeneriArrayUtils;

import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getInstrumentation().getTargetContext();
        assertEquals("com.yang.mymedicalpoject", appContext.getPackageName());
    }
    @Test
    public void test(){
        //数组的长度为15
        GeneriArrayUtils arrayUtils = new GeneriArrayUtils(15);
        for (int i = 0; i <10 ; i++) {
            arrayUtils.insertArray(i,"元素"+i);
        }
        arrayUtils.selectArray();

        arrayUtils.deleteArray(2);

        arrayUtils.selectArray();

        arrayUtils.updateArray(5,"杨路通");

        arrayUtils.selectArray();
    }
}