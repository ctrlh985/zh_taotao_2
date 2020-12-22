package com.itheima.pojo;

import java.util.List;

/**
 * @author lzhstart
 * @create 2020/12/22 14:31
 */
public class TaoResult<T> {
    private long total;
    private List<T> rows;

    public TaoResult() {
    }

    public TaoResult(long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }

    @Override
    public String toString() {
        return "TaoResult{" +
                "total=" + total +
                ", rows=" + rows +
                '}';
    }
}
