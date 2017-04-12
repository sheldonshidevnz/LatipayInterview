package com.latipay.interview.tetsproject.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.latipay.interview.tetsproject.entity.FrequentData;
import com.latipay.interview.tetsproject.service.AlphabetService;

/**
 * AlphabetService Implement
 *
 */
@Service
public class AlphabetServiceImpl implements AlphabetService {

	@Override
	public String fetchAlphabets(String input) {
		if(input != null){
			input = input.replaceAll("[^(A-Za-z)]", "");
		}
		
		return input;
	}

	@Override
	public FrequentData analyzeAlphabetInString(String input) {
		if(input != null){
			char[] alphabets = input.toLowerCase().toCharArray();
			Map<Character, Integer> alphabetsMap = new HashMap<Character, Integer>(); 
			
			//Character into HashMap
			for(Character c : alphabets){
				
				if(alphabetsMap.containsKey(c) == false){  
					alphabetsMap.put(c, 1);  
		         }else{  
		        	 alphabetsMap.put(c, alphabetsMap.get(c)+1);  
		         }  
			}
			
			//Frequency Analying
			Set<Character> alphabetsSet = alphabetsMap.keySet();
			Iterator iter = alphabetsSet.iterator();
			Integer frequency = 0;
			//Character frequentAlphabet = new Character(' ');  
			List<Character> frequentAlphabet = new ArrayList<Character>();
		      
		    while(iter.hasNext()){  
		        Character alphabet = (Character)iter.next();   
		        Integer tmpFrequency = alphabetsMap.get(alphabet);
		        if(tmpFrequency > frequency){  
		        	frequency = alphabetsMap.get(alphabet); 
		        	if(!frequentAlphabet.isEmpty()){
		        		//clear
		        		frequentAlphabet.clear();
		        	}
		        	frequentAlphabet.add(alphabet);  
		        }else if(tmpFrequency == frequency){
		        	frequentAlphabet.add(alphabet);
		        }
		    }
		    
		    FrequentData frequentData = new FrequentData();
		    frequentData.setFrequentAlphabet(frequentAlphabet);
		    frequentData.setFrequency(frequency);
			
			return frequentData;
			
		}else{
			
			return null;
		}
	}


}
