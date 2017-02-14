/*
 * Copyright (C) 2013 Peng fei Pan <sky@xiaopan.me>
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.yyydjk.gank.utils;

import android.content.Context;

/**
 * 尺寸工具箱，提供与Android尺寸相关的工具方法
 */
public class DimenUtils {
	/**
	 * dp单位转换为px
	 * @param context 上下文，需要通过上下文获取到当前屏幕的像素密度
	 * @param dpValue dp值
	 * @return px值
	 */
	public static int dp2px(Context context, float dpValue){
		return (int)(dpValue * (context.getResources().getDisplayMetrics().density) + 0.5f);
	}
	
	/**
	 * px单位转换为dp
	 * @param context 上下文，需要通过上下文获取到当前屏幕的像素密度
	 * @param pxValue px值
	 * @return dp值
	 */
	public static int px2dp(Context context, float pxValue){
		return (int)(pxValue / (context.getResources().getDisplayMetrics().density) + 0.5f);
	}
}