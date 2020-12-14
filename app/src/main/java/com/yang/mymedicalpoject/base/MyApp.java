package com.yang.mymedicalpoject.base;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.yang.mymedicalpoject.db.DaoMaster;
import com.yang.mymedicalpoject.db.DaoSession;

import androidx.multidex.MultiDex;


public class MyApp extends Application {


    private String TAG = "BaseApp";

    private static MyApp sInstance;
    private DaoMaster.DevOpenHelper mHelper;
    //private MyHelper mHelper;
    private DaoMaster mDaoMaster;
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        // 初始化MultiDex
        MultiDex.install(this);
        Log.d(TAG, "onCreate: ");
        sInstance = this;
        initGreenDao();
    }
    private void initGreenDao() {
        //通过DaoMaster内部类DevOpenHelper可以获取一个SQLiteOpenHelper 对象
        // 可能你已经注意到了，你并不需要去编写「CREATE TABLE」这样的 SQL 语句，因为 greenDAO 已经帮你做了。
        // 注意：默认的 DaoMaster.DevOpenHelper 会在数据库升级时，删除所有的表，意味着这将导致数据的丢失。
        // 所以，在正式的项目中，你还应该做一层封装，来实现数据库的安全升级。
        // 此处MyDb.db表示数据库名称 可以任意填写
        mHelper = new DaoMaster.DevOpenHelper(this, "MyDb.db", null);
        //mHelper = new MyHelper(this, "MyDb.db", null);

        SQLiteDatabase db = mHelper.getWritableDatabase();
        //Android 9 默认使用了wal模式,需要关闭wal模式
        db.disableWriteAheadLogging();
        mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();

    }

    public static MyApp getInstance(){
        return sInstance;
    }

    public DaoSession getDaoSession(){
        return mDaoSession;
    }


    /**
     * 通过类名启动Activity
     *
     * @param targetClass
     */
    public static void openActivity(Context context, Class<?> targetClass) {
        openActivity(context, targetClass, null);
    }
    public static void openActivity(){

    }
    /**
     * 通过类名启动Activity，并且含有Bundle数据
     *
     * @param targetClass
     * @param extras
     */
    public static void openActivity(Context context, Class<?> targetClass,
                                    Bundle extras) {
        Intent intent = new Intent(context, targetClass);
        if (extras != null) {
            intent.putExtras(extras);
        }
        context.startActivity(intent);
    }
    public static void openActivityForResult(Activity activity,
                                             Class<?> targetClass, Bundle extras, int requestCode) {
        Intent intent = new Intent(activity, targetClass);
        if (extras != null) {
            intent.putExtras(extras);
        }
        activity.startActivityForResult(intent, requestCode);
    }
    public static void showToast(Context context,String toast){
        Toast.makeText(context.getApplicationContext(), ""+toast, Toast.LENGTH_SHORT).show();
    }
}

