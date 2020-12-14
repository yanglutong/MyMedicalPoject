package com.yang.mymedicalpoject.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.liulishuo.filedownloader.database.SqliteDatabaseOpenHelper;

import java.util.ArrayList;

import androidx.annotation.Nullable;

public
class MySql extends SQLiteOpenHelper {
    //带全部参数的构造函数，此构造函数必不可少,name为数据库名称
    public MySql(@Nullable Context context) {
        super(context,"person.db",null,1);
    }

    //创建数据库sql语句 并 执行,相当于初始化数据库，
    // 这里是新建了一张表这个方法继承自SQLiteOpenHelper,
    // 会自动调用，也就是会 当新建了一个DatabaseHelper对象时
    // ，就会默认新建一张表user，表里存着名为name项
    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        //创建数据库sql语句 并 执行,相当于初始化数据库，这里是新建了一张表这个方法继承自SQLiteOpenHelper,会自动调用，也就是会 当新建了一个DatabaseHelper对象时，就会默认新建一张表user，表里存着名为name项
       String str="create table stu(id integer primary key autoincrement," +
               "region varchar," +
               "phone integer,address1 varchar,detail varchar,a integer)";
       sqLiteDatabase.execSQL(str);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
    //插入方法
    public void insertAdd(Person p){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("region",p.getRegion());
        values.put("phone",p.getPhone());
        values.put("address1",p.getAddress1());
        values.put("detail",p.getDetail());
        values.put("a",p.getA());
        db.insert("stu","name",values);
    }
    //查询方法
    public ArrayList<Person> selectAdd(){
        ArrayList<Person> list = new ArrayList<>();
        SQLiteDatabase db = getReadableDatabase();
        String str="select * from stu";
        Cursor cursor = db.rawQuery(str, null);
        while(cursor.moveToNext()){
            String region = cursor.getString(cursor.getColumnIndex("region"));
            String address1 = cursor.getString(cursor.getColumnIndex("address1"));
            String detail = cursor.getString(cursor.getColumnIndex("detail"));
            Long phone = cursor.getLong(cursor.getColumnIndex("phone"));
            int a = cursor.getInt(cursor.getColumnIndex("a"));
            list.add(new Person(region,phone,address1,detail,a));
        }
        return list;
    }
    //根据名字删除内容
    public void deleteAdd(String name){
        SQLiteDatabase db = getWritableDatabase();
        db.delete("stu","name=?",new String[]{name});
    }
    //根据姓名修改年龄
    public void updateAdd(int a,Long phone){
        SQLiteDatabase db = getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put("a",a);
        db.update("stu",values,"phone=?",new  String[]{phone+""});
    }
}
