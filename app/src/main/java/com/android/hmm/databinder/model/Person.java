package com.android.hmm.databinder.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.android.hmm.databinder.BR;

/**
 * Created by hmm on 2015/8/3.
 */
public class Person extends BaseObservable{

    private String name;

    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        notifyPropertyChanged(BR.age);
    }

}
