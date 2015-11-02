package com.google.gwt.sample.MovieDataBase.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface DBConnectionAsync {

	void FilterName(String name, AsyncCallback<Void> callback);

}
