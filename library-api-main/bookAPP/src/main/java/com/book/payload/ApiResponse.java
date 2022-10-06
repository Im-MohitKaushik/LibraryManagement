package com.book.payload;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ApiResponse {

	private String message;
	private Boolean success;
	public ApiResponse(String message, Boolean success) {
		super();
		this.message = message;
		this.success = success;
	}
}
