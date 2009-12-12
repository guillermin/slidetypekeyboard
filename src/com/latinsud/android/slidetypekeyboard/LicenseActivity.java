/*
 * Copyright (C) 2009 Alejandro Grijalba
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */


package com.latinsud.android.slidetypekeyboard;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;


public class LicenseActivity extends Activity {
	@Override
	protected void onCreate(Bundle state) {
		super.onCreate(state);
		
		WebView www = new WebView(this);
        www.getSettings().setJavaScriptEnabled(true);
        www.loadUrl("file:///android_asset/license.txt");
        
        setContentView(www);
	}
}
