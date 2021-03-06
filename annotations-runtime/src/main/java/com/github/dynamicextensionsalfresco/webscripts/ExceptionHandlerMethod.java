package com.github.dynamicextensionsalfresco.webscripts;

import java.lang.reflect.Method;

class ExceptionHandlerMethod {

	private final Class<? extends Throwable>[] exceptionTypes;

	private final Method method;

	ExceptionHandlerMethod(final Class<? extends Throwable>[] exceptionTypes, final Method method) {
		this.exceptionTypes = exceptionTypes;
		this.method = method;
	}

	public boolean canHandle(final Throwable exception) {
		if (exceptionTypes.length == 0) {
			return true;
		} else {
			for (final Class<? extends Throwable> type : exceptionTypes) {
				if (type.isInstance(exception)) {
					return true;
				}
			}
			return false;
		}
	}

	public Method getMethod() {
		return method;
	}

}
