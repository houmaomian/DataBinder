package com.android.hmm.databinder.ui;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import butterknife.ButterKnife;
import butterknife.InjectView;
import butterknife.OnClick;
import com.android.hmm.databinder.R;
import com.android.hmm.databinder.databinding.ActivityMainBinding;
import com.android.hmm.databinder.model.Person;


public class MainActivity extends ActionBarActivity {

    @InjectView(R.id.edit_name) EditText editName;

    private Person mPerson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        ButterKnife.inject(this);
        mPerson= new Person("test",8888);
        binding.setPerson(mPerson);
    }

    @OnClick(R.id.bt_change)
    public void changeName(){
        String text = editName.getText().toString();
        if(TextUtils.isEmpty(text))
            return;
        mPerson.setName(text);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
