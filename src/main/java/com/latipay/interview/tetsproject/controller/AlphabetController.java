package com.latipay.interview.tetsproject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.latipay.interview.tetsproject.entity.FrequentData;
import com.latipay.interview.tetsproject.entity.ReqData;
import com.latipay.interview.tetsproject.entity.RespData;
import com.latipay.interview.tetsproject.service.AlphabetService;
import com.latipay.interview.tetsproject.service.ResponseService;

/**
 * Controller
 *
 */
@RestController
public class AlphabetController {
	
	@Autowired
	private AlphabetService alphabetService;
	@Autowired
	private ResponseService responseService;
		
	@RequestMapping(value = "/alphabet/fetch", method = {RequestMethod.GET,RequestMethod.POST})
	public String fetchAlphabets(ReqData input){
		try{
			if(input.getInputStr() == null){

				return "Parameter Invalid";
			}else if(input.getInputStr().isEmpty()){
				return "Parameter Is Empty";
			}else{
				return fetchAlphabets(input.getInputStr());
			}
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
//	@RequestMapping(value = "/alphabet/fetch", method = RequestMethod.GET)
//	public String fetchAlphabetsGet(String inputStr){
//		return fetchAlphabets(inputStr);
//	}
//	
//	@RequestMapping(value = "/alphabet/fetch/{inputStr}", method = RequestMethod.GET)
//	public String fetchAlphabetsPathGet(@PathVariable String inputStr){
//		return fetchAlphabets(inputStr);
//	}
	
//	@RequestMapping(value = "/alphabet/fetch", method = RequestMethod.POST)
//	public String fetchAlphabetsPost(@RequestBody ReqData input){
//		
//		return fetchAlphabets(input.getInputStr());
//	}
	
	
	private String fetchAlphabets(String inputStr){
		RespData resp = new RespData();
		resp.setInputStr(inputStr);
		
		String inputAlphabets = alphabetService.fetchAlphabets(inputStr);
		if(inputAlphabets != null){
			FrequentData frequentData = alphabetService.analyzeAlphabetInString(inputAlphabets);
			if(frequentData != null){
				resp.setAlphabetStr(inputAlphabets);
				resp.setFrequentAlphabet(frequentData.getFrequentAlphabet());
				resp.setFrequency(frequentData.getFrequency());
			}
		}		
		
		return responseService.response(resp);
	}
}
