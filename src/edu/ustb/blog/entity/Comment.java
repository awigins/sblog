package edu.ustb.blog.entity;

import java.util.Date;


/**
 * (Comment)表实体类
 *
 * @author makejava
 * @since 2023-07-11 00:04:51
 */

public class Comment  {
    //评论id@TableId
    private Integer id;

    //文章id
    private Integer articleid;
    //父评论id 二级评论
    private Integer parentid;
    //评论内容
    private String content;
    //回复用户id
    private Integer userid;
    //被回复的用户id
    private Integer touserid;
    //评论状态 0-正常 1-已删除
    private Integer state;
    //创建时间
    private Date createtime;



}

