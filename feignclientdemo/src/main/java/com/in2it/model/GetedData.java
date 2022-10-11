package com.in2it.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class GetedData {

	@JsonProperty("Lead progressed")
	public List<LeadProgressed> leadProgressed;
	
	@JsonProperty("Lead Pending")
	public List<LeadPending> leadPending;

	@JsonProperty("Lead capturing")
	public List<LeadCapturing> leadCapturings;
	
	@JsonProperty("Lead Confirmed")
	public List<LeadConfirmed> leadConfirmeds;

	public GetedData() {
		super();
	}

	public GetedData(List<LeadProgressed> leadProgressed, List<LeadPending> leadPending,
			List<LeadCapturing> leadCapturings, List<LeadConfirmed> leadConfirmeds) {
		super();
		this.leadProgressed = leadProgressed;
		this.leadPending = leadPending;
		this.leadCapturings = leadCapturings;
		this.leadConfirmeds = leadConfirmeds;
	}

	public List<LeadProgressed> getLeadProgressed() {
		return leadProgressed;
	}

	public void setLeadProgressed(List<LeadProgressed> leadProgressed) {
		this.leadProgressed = leadProgressed;
	}

	public List<LeadPending> getLeadPending() {
		return leadPending;
	}

	public void setLeadPending(List<LeadPending> leadPending) {
		this.leadPending = leadPending;
	}

	public List<LeadCapturing> getLeadCapturings() {
		return leadCapturings;
	}

	public void setLeadCapturings(List<LeadCapturing> leadCapturings) {
		this.leadCapturings = leadCapturings;
	}

	public List<LeadConfirmed> getLeadConfirmeds() {
		return leadConfirmeds;
	}

	public void setLeadConfirmeds(List<LeadConfirmed> leadConfirmeds) {
		this.leadConfirmeds = leadConfirmeds;
	}
}
