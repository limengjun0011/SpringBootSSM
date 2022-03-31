package com.lmj.server.bean;

import java.util.HashMap;
import java.util.Map;

public class Msg {
	private final String message;
	private final int code;
	private final Map<String, Object> data = new HashMap<String, Object>();

	public String getMessage() {
		return message;
	}

	public int getCode() {
		return code;
	}

	public Map<String, Object> getData() {
		return data;
	}

	public Msg add(String key, Object value) {
		data.put(key, value);
		return this;
	}

	private Msg(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public static Msg ok() {
		return new Msg(200, "success");
	}

	public static Msg notFound() {
		return new Msg(404, "Not Found");
	}

	public static Msg badRequest() {
		return new Msg(400, "Bad Request");
	}

	public static Msg forbidden() {
		return new Msg(403, "Forbidden");
	}

	public static Msg unauthorized() {
		return new Msg(401, "unauthorized");
	}

	public static Msg serverInternalError() {
		return new Msg(500, "Server Internal Error");
	}

	public static Msg customerError() {
		return new Msg(1001, "customer Error");
	}
}
