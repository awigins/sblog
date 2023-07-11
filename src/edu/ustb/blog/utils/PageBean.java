package edu.ustb.blog.utils;

import java.util.List;

/*
 分页相关参数及结果list
 */
public class PageBean<T> {
    private int pageIndex;      //当前页数
    private int pageRecord;     //每一页的数量
    private int pageCount;      //总页数
    private int totalRecord;    //总记录数
    private List<T> resultList; //结果集

    public int getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(int pageIndex) {
        this.pageIndex = pageIndex;
    }

    public int getPageRecord() {
        return pageRecord;
    }

    public void setPageRecord(int pageRecord) {
        this.pageRecord = pageRecord;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getTotalRecord() {
        return totalRecord;
    }

    public void setTotalRecord(int totalRecord) {
        this.totalRecord = totalRecord;
    }

    public List<T> getResultList() {
        return resultList;
    }

    public void setResultList(List<T> resultList) {
        this.resultList = resultList;
    }
}
