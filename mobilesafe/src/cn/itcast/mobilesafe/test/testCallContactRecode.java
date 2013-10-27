package cn.itcast.mobilesafe.test;

import cn.itcast.mobilesafe.engine.CallContactRecode;
import android.test.AndroidTestCase;

public class testCallContactRecode extends AndroidTestCase {
  public void aa(){
	  CallContactRecode code = new CallContactRecode(getContext());
	  code.getName("3333");
  }
}
