package br.gov.go.sefaz.agualegalclient.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ErrorDetail {

	@JsonProperty("fieldName")
	private String fieldName;
	@JsonProperty("message")
	private String message;

	// Getters and Setters
	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
