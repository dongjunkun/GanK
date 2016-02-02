package com.yyydjk.gank.net;

/**
 * Created by dongjunkun on 2016/2/1.
 */
public class Api {
    /**
     分类数据: http://gank.avosapps.com/api/data/数据类型/请求个数/第几页
     •数据类型： 福利 | Android | iOS | 休息视频 | 拓展资源 | 前端 | all
     •请求个数： 数字，大于0
     •第几页：数字，大于0

     例：•http://gank.avosapps.com/api/data/Android/10/1
     •http://gank.avosapps.com/api/data/福利/10/1
     •http://gank.avosapps.com/api/data/iOS/20/2
     •http://gank.avosapps.com/api/data/all/20/2

     每日数据： http://gank.avosapps.com/api/day/年/月/日

     例：
     •http://gank.avosapps.com/api/day/2015/08/06

     随机数据：http://gank.avosapps.com/api/random/data/分类/个数
     •数据类型：福利 | Android | iOS | 休息视频 | 拓展资源 | 前端
     •个数： 数字，大于0

     例：•http://gank.avosapps.com/api/random/data/Android/20
     */
    public static final String GANHUO = "";
}
