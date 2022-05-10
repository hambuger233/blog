package com.sangeng.constants;

public class SystemConstants
{
    /**
     *  文章是草稿
     */
    public static final int ARTICLE_STATUS_DRAFT = 1;
    /**
     *  文章是正常分布状态
     */
    public static final int ARTICLE_STATUS_NORMAL = 0;

    /**
     * 分类的状态
     *
     */
    public static final String STATUS_NORMAL = "0";

    /**
     * 友链的状态:审核通过
     *
     */
    public static final String LINK_STATUS_NORMAL = "0";


    public static final String BLOG_LOGIN_PREFIX = "bloglogin:";
    /**
     *  根评论默认为-1
     */
    public static final int COMMENT_ROOT_ID = -1;

    /**
     * 文章评论类型
     */
    public static final String ARTICLE_COMMENT = "0";
    /**
     * 友链评论类型
     */
    public static final String LINK_COMMENT = "1";

    /**
     * 文章的浏览量
     */
    public static final String ARTICLE_VIEWCOUNT = "article:viewCount";
}