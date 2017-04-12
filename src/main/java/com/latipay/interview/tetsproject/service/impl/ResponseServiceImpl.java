package com.latipay.interview.tetsproject.service.impl;

import org.springframework.stereotype.Service;

import com.latipay.interview.tetsproject.entity.RespData;
import com.latipay.interview.tetsproject.service.ResponseService;

/**
 * ResponseService Implement
 *
 */
@Service
public class ResponseServiceImpl implements ResponseService {

	@Override
	public String response(RespData resp) {
		StringBuilder strBuilder = new StringBuilder();
		
		if(!resp.getAlphabetStr().isEmpty()){
			strBuilder.append("The letters are: ‘");
			strBuilder.append(resp.getAlphabetStr());
			
			if(resp.getFrequentAlphabet().size() > 1){
				strBuilder.append("’. The most frequent letters are ‘");
				for(int i=0; i < resp.getFrequentAlphabet().size(); ++i){
					strBuilder.append(resp.getFrequentAlphabet().get(i));
					if(i < resp.getFrequentAlphabet().size() - 1){
						strBuilder.append(',');
					}
				}
			}else{
				strBuilder.append("’. The most frequent letter is ‘");
				strBuilder.append(resp.getFrequentAlphabet().get(0));
			}			
			
			strBuilder.append("’, and the frequency is ");
			strBuilder.append(resp.getFrequency());
		}else{
			strBuilder.append("The input string is: ‘");
			strBuilder.append(resp.getInputStr());
			strBuilder.append("’. It doesnot contain any letter.");
		}
		
		return strBuilder.toString();
	}

}
