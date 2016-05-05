package com.yyydjk.gank.beans;

import java.io.Serializable;

/**
 * Created by dongjunkun on 2016/2/1.
 */
public class GanHuo implements Serializable {

    /**
     * who : 有时放纵
     * publishedAt : 2016-02-01T03:49:41.440Z
     * desc : 省时省力的Andbase功能组件
     * type : Android
     * url : http://www.finalshares.com/read-608
     * used : true
     * objectId : 56aec014816dfa00597ca4fd
     * createdAt : 2016-02-01T02:16:52.628Z
     * updatedAt : 2016-02-01T03:49:42.159Z
     */

    private String who;
    private String publishedAt;
    private String desc;
    private String type;
    private String url;
    private boolean used;
    private String objectId;
    private String createdAt;
    private String updatedAt;

    public void setWho(String who) {
        this.who = who;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public void setObjectId(String objectId) {
        this.objectId = objectId;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getWho() {
        return who;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getDesc() {
        return desc;
    }

    public String getType() {
        return type;
    }

    public String getUrl() {
        return url;
    }

    public boolean isUsed() {
        return used;
    }

    public String getObjectId() {
        return objectId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }
}
