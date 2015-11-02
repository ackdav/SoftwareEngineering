package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("DBConnection")
public interface DBConnection extends RemoteService {
	public void FilterName(String name);
	
}
