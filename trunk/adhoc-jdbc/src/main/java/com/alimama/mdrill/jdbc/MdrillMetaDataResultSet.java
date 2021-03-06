package com.alimama.mdrill.jdbc;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public abstract  class MdrillMetaDataResultSet<M> extends MdrillBaseResultSet{
	  protected final List<M> data;

	  @SuppressWarnings("unchecked")
	  public MdrillMetaDataResultSet(final List<String> columnNames
	          , final List<String> columnTypes
	          , final List<M> data) throws SQLException {
	    if (data!=null) {
	      this.data = new ArrayList<M>(data);
	    } else {
	      this.data =  new ArrayList<M>();
	    }
	    if (columnNames!=null) {
	      this.columnNames = new ArrayList<String>(columnNames);
	    } else {
	      this.columnNames =  new ArrayList<String>();
	    }
	    if (columnTypes!=null) {
	      this.columnTypes = new ArrayList<String>(columnTypes);
	    } else {
	      this.columnTypes =  new ArrayList<String>();
	    }
	  }

	  
	  public void close() throws SQLException {
	  }

	
	public <T> T getObject(int arg0, Class<T> arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	
	public <T> T getObject(String arg0, Class<T> arg1) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}


}
