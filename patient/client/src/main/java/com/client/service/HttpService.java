package com.client.service;

import java.io.IOException;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.json.JSONException;
import org.json.JSONObject;


 
import java.util.List;

import com.client.domain.Patient;

public interface HttpService {
	
	JSONObject getToken(String AuthCode) throws IOException, JSONException;
	
	List<Patient> getResource(String token) throws IOException,JSONException;
	
	List<Patient> responseParser(CloseableHttpResponse response) throws IOException,JSONException;

String getPublicInfo() throws IOException;
	
}
