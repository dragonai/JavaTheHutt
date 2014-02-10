package com.example.potato;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends Activity {
	private EditText username;
	private EditText password;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		username =(EditText)findViewById(R.id.editText1);
		password = (EditText)findViewById(R.id.editText2);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	public void onLogin(View v){
		if (username.getText().toString().equals("admin") && password.getText().toString().equals("pass123")){
			Intent intent = new Intent(this, SuccessActivity.class);
			startActivity(intent);
		}else{
			Toast.makeText(getApplicationContext(), "Try Again", Toast.LENGTH_SHORT).show();
			
		}
	}

}
