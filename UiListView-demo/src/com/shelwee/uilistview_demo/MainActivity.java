package com.shelwee.uilistview_demo;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Toast;

import com.shelwee.uilistview.ui.UiListView;
import com.shelwee.uilistview.ui.UiListView.ClickListener;

public class MainActivity extends Activity {

	private UiListView uiListView1, uiListView2, uiListView3, uiListView4;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initUilist1();
		initUilist2();
		initUilist3();
		initUilist4();
		
	}

	private void initUilist4() {
		// TODO Auto-generated method stub
		uiListView4 = (UiListView) findViewById(R.id.uilist4);
		uiListView4.addBasicItem("按钮");
		uiListView4.commit();
		uiListView4.setClickListener(new ClickListener() {
			
			@Override
			public void onClick(int index) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "按钮点击", Toast.LENGTH_SHORT).show();
			}
		});
	}

	private void initUilist3() {
		// TODO Auto-generated method stub
		uiListView3 = (UiListView) findViewById(R.id.uilist3);
		uiListView3.addBasicItem("单条模式");
		uiListView3.addBasicItem("标题居中");
		uiListView3.addBasicItem("文字不加粗");
		uiListView3.commit();
	}

	private void initUilist2() {
		// TODO Auto-generated method stub
		uiListView2 = (UiListView) findViewById(R.id.uilist2);
		uiListView2.addBasicItem("标题居中");
		uiListView2.addBasicItem("标题","不显示箭头");
		uiListView2.addBasicItem(R.drawable.user_image,"标题","标题跟介绍过长的时候的样子");
		uiListView2.commit();
	}

	private void initUilist1() {
		uiListView1 = (UiListView) findViewById(R.id.uilist1);
		uiListView1.addBasicItem("默认配置");
		uiListView1.addBasicItem("标题","介绍");
		uiListView1.addBasicItem(R.drawable.user_image,"标题");
		uiListView1.commit();
		uiListView1.setClickListener(new ClickListener() {
			
			@Override
			public void onClick(int index) {
				// TODO Auto-generated method stub
				Toast.makeText(MainActivity.this, "点击"+index, Toast.LENGTH_SHORT).show();
			}
		});
	}
}
