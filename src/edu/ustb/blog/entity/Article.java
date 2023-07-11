package edu.ustb.blog.entity;

import java.util.Date;


/**
 * (Article)表实体类
 *
 * @author makejava
 * @since 2023-07-11 00:04:23
 */

public class Article  {
    //文章id  主键@TableId
    private Integer id;

    //标题
    private String title;
    //文章内容
    private String content;
    //缩略图
    private String thumbnail;
    //文章总得分
    private Integer scores;
    //访问量
    private Integer viewcount;
    //是否允许评论 0是，1否
    private Integer iscomment;
    //文章分类表 分类id
    private Integer blogtypeid;
    //创建时间
    private Date createtime;
    //用户表 用户id
    private Integer userid;
    //文章审核状态 0-未审核 1-审核通过 2-审核未通过
    private Integer state;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public Integer getScores() {
        return scores;
    }

    public void setScores(Integer scores) {
        this.scores = scores;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getIscomment() {
        return iscomment;
    }

    public void setIscomment(Integer iscomment) {
        this.iscomment = iscomment;
    }

    public Integer getBlogtypeid() {
        return blogtypeid;
    }

    public void setBlogtypeid(Integer blogtypeid) {
        this.blogtypeid = blogtypeid;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}

