package com.zey.sm.model;

import java.util.List;
/* *
 *  @Author xujiannong
 *  @Date 2018/10/4  08:25
 **/
public class PageInfo {
    private Integer totalRecords;  //总记录数
    private Integer totalPages;  //总页数
    private Integer pageSize;  //每页显示数
    private Integer currentPage;  //当前页数
    private List<?> list;  //每页数据集合

    public PageInfo(){
        this.currentPage = 1;
        this.pageSize = 5;
    }

    public PageInfo(int totalRecords, int currentPage, int pageSize, List<?> list){
        this.totalRecords = totalRecords;
        this.totalPages = (int)Math.ceil(totalRecords/(double)pageSize);
        this.currentPage = currentPage;
        this.pageSize = pageSize;
        this.list = list;
    }

    public Integer getTotalRecords() {
        return totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public Integer getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Integer totalPages) {
        this.totalPages = totalPages;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }

    //////////////////////////////////定义分页对象方法//////////////////////////////////////

    public int getFirstPage(){
        return 1;
    }

    public int getLastPage(){
        return totalPages;
    }

    /*
     *
     * @Author xujiannong
     * @Description //定义上一页
     * @Date 9:46 2018/10/4
     * @Param
     * @return
     **/
    public int getPrePage(){
        return currentPage - 1 < 1 ? 1 : currentPage - 1;
    }

    public int getNextPage(){
        return currentPage + 1 > totalPages ? totalPages : currentPage + 1;
    }
}
