package com.latipay.interview.tetsproject.entity;

import java.util.List;

/**
 * Response Data
 *
 */
public class RespData {
	
	/**
	 * Request Data
	 */
	private String inputStr;
	
	/**
	 * String after Handling
	 */
	private String alphabetStr;
	
	/**
	 * Frequent Letter
	 */
	private List<Character> frequentAlphabet;
	
	/**
	 * Number of Frequency
	 */
	private Integer frequency;
	

	public String getInputStr() {
		return inputStr;
	}

	public void setInputStr(String inputStr) {
		this.inputStr = inputStr;
	}

	public String getAlphabetStr() {
		return alphabetStr;
	}

	public void setAlphabetStr(String alphabetStr) {
		this.alphabetStr = alphabetStr;
	}

	public List<Character> getFrequentAlphabet() {
		return frequentAlphabet;
	}

	public void setFrequentAlphabet(List<Character> frequentAlphabet) {
		this.frequentAlphabet = frequentAlphabet;
	}

	public Integer getFrequency() {
		return frequency;
	}

	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}

	
}
