package com.laiqian.print.util;

import java.lang.reflect.Field;

import android.view.View;


/**
 * every xml corespond to a ViewContainer class makes life easier
 * @author Raid
 *
 * @param <V> the view type of root view
 */
public class ViewContainer<V extends View> {
	protected V mView;		
	protected final int mId;
	
	public ViewContainer(int id) {
		mId = id;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void init(View view) {
		mView = (V) view;
		Class clazz = this.getClass();
		Field[] publicFields = clazz.getFields();
		for(Field publicField : publicFields) {
			Object fieldInstance = null;
			try {
				fieldInstance = publicField.get(this);
			} catch(IllegalAccessException e) {
			}
			if(fieldInstance != null) {
				if(fieldInstance instanceof ViewContainer) {
					ViewContainer container = (ViewContainer) fieldInstance;
					container.init(mView.findViewById(container.getId()));
				}
			} else {
				//hmm?
			}
		}
	}
	
	public int getId() {
		return mId;
	}
	
	public V getView() {
		return mView;
	}
	
}
