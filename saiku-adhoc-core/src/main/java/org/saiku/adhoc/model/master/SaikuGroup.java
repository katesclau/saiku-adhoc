/*
 * Copyright (C) 2011 Marius Giepz
 *
 * This program is free software; you can redistribute it and/or modify it 
 * under the terms of the GNU General Public License as published by the Free 
 * Software Foundation; either version 2 of the License, or (at your option) 
 * any later version.
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * 
 * See the GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License along 
 * with this program; if not, write to the Free Software Foundation, Inc., 
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA 
 *
 */
package org.saiku.adhoc.model.master;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mgie
 * 
 */
public class SaikuGroup implements SaikuElement{

	public List<SaikuLabel> getGroupFooterElements() {
		return groupFooterElements;
	}

	public void setGroupFooterElements(List<SaikuLabel> groupFooterMessages) {
		this.groupFooterElements = groupFooterMessages;
	}

	public SaikuGroup() {
		this.sort = "NONE";
		this.groupHeaderFormat = new SaikuElementFormat();	
		this.groupFooterElements = new ArrayList<SaikuLabel>();
	}
	
	private SaikuElementFormat groupHeaderFormat;

	private String dataFormat;

	private String displayName;

	private String category;

	private String columnId;

	private String columnName;
	
	private String sort;

	private String groupName;
	
	private String layoutId;

	//TODO: Do we really need that label?
	private String groupTotalsLabel;
	
	private List<SaikuLabel> groupFooterElements;

	private String uid;

	public String getDataFormat() {
		return dataFormat;
	}

	public void setDataFormat(String dataFormat) {
		this.dataFormat = dataFormat;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String fieldName) {
		this.columnName = fieldName;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public String getGroupTotalsLabel() {
		return groupTotalsLabel;
	}

	public void setGroupTotalsLabel(String groupTotalsLabel) {
		this.groupTotalsLabel = groupTotalsLabel;
	}

	public void setColumnId(String columnId) {
		this.columnId = columnId;
	}

	public String getColumnId() {
		return columnId;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getUid() {
		return uid;
	}

	@Override
	public String toString() {
		return "SaikuGroup [dataFormat=" + dataFormat + ", displayName="
				+ displayName + ", columnId=" + columnId + ", columnName="
				+ columnName + ", uid=" + uid + "]";
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public String getSort() {
		return sort;
	}

	public void setGroupHeaderFormat(SaikuElementFormat groupHeaderFormat) {
		this.groupHeaderFormat = groupHeaderFormat;
	}

	public SaikuElementFormat getGroupHeaderFormat() {
		return groupHeaderFormat;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}

	public String getLayoutId() {
		return layoutId;
	}

}
