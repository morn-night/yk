package com.example.demo.pojo;

public class Page {
    int startIndex;  //每页开始元素的索引
    int pageSize;  //每页的数量
    int total;  //数据总数据量
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int start) {
        this.startIndex = start;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    /**
     * 提供一个构造方法
     */
    public Page(int startIndex,int pageSize){
        super();
        this.startIndex = startIndex;
        this.pageSize = pageSize;
    }
    /**
     * 判断是否有上一页
     */
    public boolean isHasPreviouse(){
        if(startIndex == 0) {
            return false;
        }
        return true;
    }
    /**
     * 判断是否有下一页
     */
    public boolean isHasNext(){
        if (startIndex == getLast()) {
            return false;
        }
        return true;
    }
    /**
     * 计算数据展示的总页数
     */
    public int getTotalPage(){
        int totalPage;
        if( 0 == total % pageSize ){
            totalPage = total / pageSize;
        }else{
            totalPage = total / pageSize +1;
        }
        if ( 0 == totalPage || 1== totalPage){
            totalPage = 1;
        }
        return totalPage;
    }
    /**
     * 计算尾页的第一条元素索引
     */
    public int getLast(){
        int last;
        if( 0 == total % pageSize ){
            last = total - pageSize;
        }else{
            last = total - total % pageSize ;
        }
        last = last<0 ? 0:last;
        return last;
    }
}
