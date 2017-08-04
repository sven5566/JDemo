package com.whr.jdemo.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.whr.jdemo.R;
import com.whr.jdemo.test.beans.TestFactory;
import com.whr.jdemo.test.beans.TestInterface;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainTestActivity extends AppCompatActivity {

	@BindView(R.id.base_test_tv)
	TextView baseTestTv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main_test);
		ButterKnife.bind(this);
	}

	@OnClick(R.id.base_test_btn)
	public void onViewClicked() {
		final TestInterface bean = TestFactory.getBean();
		baseTestTv.setText(bean.getName());
	}
}
