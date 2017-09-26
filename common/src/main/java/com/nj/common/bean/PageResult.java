package com.nj.common.bean;

import java.util.List;

public class PageResult<T> extends Result {

	private static final long serialVersionUID = -8247068182643883340L;

	private List<T> dataList;

	private int pageSize = 10;

	private int currentPage = 1;

	private int beginNum = (currentPage - 1) * pageSize;
	
	private int totalPage;

	private String sortField;

	private String sortType;

	private String sqlCountTemplate = "SELECT COUNT(0) FROM {table} WHERE {condition}";

	private String sqlQueryTemplate = "SELECT {fields} FROM {table} WHERE {condition} ORDER BY {sortFields} LIMIT {beginNum},{endNum};";

	public PageResult() {
		super();
	}

	public String countSql(String table, String conditon) {
		if (isBlank(table))
			throw new RuntimeException("表名不可以为空");

		String sql = sqlCountTemplate.replace("{table}", table);
		sql = sql.replace("{conditon}", conditon);

		if (!isBlank(conditon))
			sql = sql.replace("WHERE", "");

		return sql;
	}

	public String pageQuerySql(String fields, String table, String conditon, String sortFields, String beginNum,
			String endNum) {
		if (isBlank(fields))
			throw new RuntimeException("表字段名不可以为空");

		if (isBlank(table))
			throw new RuntimeException("表名不可以为空");

		if (isBlank(beginNum) && isBlank(endNum)) {
			throw new RuntimeException("没有分页条件");
		}

		String sql = sqlQueryTemplate.replace("{table}", table);

		sql = sql.replace("{conditon}", conditon);
		if (!isBlank(conditon))
			sql = sql.replace("WHERE", "");

		sql = sql.replace("{sortFields}", sortFields);
		if (!isBlank(conditon))
			sql = sql.replace("ORDER BY", "");

		// beginNum为空，从第一条记录查起
		if (isBlank(beginNum))
			beginNum = "0";
		sql = sql.replace("{beginNum}", beginNum);

		// endNum为空，查到最后一条记录
		if (isBlank(endNum))
			endNum = "-1";
		sql = sql.replace("{endNum}", endNum);

		return sql;
	}

    public int beginNum() {
		return (currentPage - 1) * pageSize;
	}

	public int endNum() {
		return currentPage * pageSize;
	}

	public PageResult(List<T> dataList, boolean success, String errorCode, String message) {
		super(success, null, errorCode, message);
		this.dataList = dataList;
	}

	public static <T> PageResult<T> failure(String message) {
		return new PageResult<T>(null, false, null, message);
	}

	public static <T> PageResult<T> failure(String errorCode, String message) {
		return new PageResult<T>(null, false, errorCode, message);
	}

	public static <T> PageResult<T> success(List<T> dataList) {
		return new PageResult<T>(dataList, true, null, null);
	}

	public static <T> PageResult<T> success(List<T> dataList, String message) {
		return new PageResult<T>(dataList, true, null, message);
	}

	public List<T> getDataList() {
		return dataList;
	}

	public void setDataList(List<T> dataList) {
		this.dataList = dataList;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public String getSortField() {
		return sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortType() {
		return sortType;
	}

	public void setSortType(String sortType) {
		this.sortType = sortType;
	}

	public int getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}

	public int getBeginNum() {
		return beginNum;
	}

	public void setBeginNum(int beginNum) {
		this.beginNum = beginNum;
	}

    private boolean isBlank(String str) {
        if (str == null || "".equals(str.trim()))
            return true;
        else
            return false;
    }

	
}
