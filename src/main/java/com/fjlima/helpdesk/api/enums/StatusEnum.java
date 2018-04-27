package com.fjlima.helpdesk.api.enums;

public enum StatusEnum {

	New, Assined, Resolded, Approved, Disapproved, Close;

	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "New":
			return New;
		case "Resolved":
			return Resolded;
		case "Approved":
			return Approved;
		case "Disapproved":
			return Disapproved;
		case "Assined":
			return Assined;
		case "Close":
			return Close;
		default:
			return New;
		}
	}
}
