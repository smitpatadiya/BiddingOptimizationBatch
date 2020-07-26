package com.bidding.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BaseConfig {
	@Value("${clientId}")
	private String clientId;
	@Value("${clientSecret}")
	private String clientSecret;
	@Value("${businessRefreshToken}")
	private String businessRefreshToken;
	@Value("${amazonRefreshToken}")
	private String amazonRefreshToken;
	@Value("${comAmazonRefreshToken}")
	private String comAmazonRefreshToken;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getClientSecret() {
		return clientSecret;
	}

	public void setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
	}

	public String getBusinessRefreshToken() {
		return businessRefreshToken;
	}

	public void setBusinessRefreshToken(String businessRefreshToken) {
		this.businessRefreshToken = businessRefreshToken;
	}

	public String getAmazonRefreshToken() {
		return amazonRefreshToken;
	}

	public void setAmazonRefreshToken(String amazonRefreshToken) {
		this.amazonRefreshToken = amazonRefreshToken;
	}

	public String getComAmazonRefreshToken() {
		return comAmazonRefreshToken;
	}

	public void setComAmazonRefreshToken(String comAmazonRefreshToken) {
		this.comAmazonRefreshToken = comAmazonRefreshToken;
	}

}
