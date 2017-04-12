package com.latipay.interview.tetsproject.entity;

import java.util.List;

/**
 * 
 * Frequent Data
 *
 */
public class FrequentData {
	/**
	 * Frequent Letter
	 */
	private List<Character> frequentAlphabet;
	
	/**
	 * Number of Frequency
	 */
	private Integer frequency;



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
