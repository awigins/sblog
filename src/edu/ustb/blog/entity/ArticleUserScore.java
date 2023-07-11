package edu.ustb.blog.entity;


/**
 * (ArticleUserScore)表实体类
 *
 * @author makejava
 * @since 2023-07-11 00:04:36
 */

public class ArticleUserScore  {
    //文章与用户打分中间表id@TableId
    private Integer id;

    //文章id
    private Integer articleid;
    //用户id
    private Integer userid;
    //分值 例（喜欢加1分，评论加2分，分享加3分，不喜欢减1分）
    private Integer score;



}

