package dev.hoon.sandbox;

import org.slf4j.Logger;

import dev.hoon.sandbox.util.*;

public class Solution {
	private final Logger log = KSLogger.getInstance(Solution.class);
	
	public Solution() {
		log.debug("creating solution");
	}
	
	public void solve() {
		log.debug("solving...");
	}
	
	public static void main(String args[]) {
		Solution s = new Solution();
		s.solve();
	}
}
