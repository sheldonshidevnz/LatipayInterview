package com.latipay.interview.tetsproject.service;

import com.latipay.interview.tetsproject.entity.FrequentData;


/**
 * AlphabetService Interface
 *
 */
public interface AlphabetService {
	
	/**
	 * fetch Alphabet and frequency
	 * @param input
	 * @return
	 */
	String fetchAlphabets(String input);
	
	/**
	 * Analyze Alphabet Frequency
	 * @param input
	 * @return
	 */
	FrequentData analyzeAlphabetInString(String input);
}
