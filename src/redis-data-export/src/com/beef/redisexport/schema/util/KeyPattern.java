package com.beef.redisexport.schema.util;

import java.util.List;

public class KeyPattern {
	private String _keyPattern = null;
	
	private String _keyMatchPattern = null;
	
	private List<String> _variateKeyNames = null;

	public String getKeyPattern() {
		return _keyPattern;
	}

	public void setKeyPattern(String keyPattern) {
		_keyPattern = keyPattern;
	}

	public String getKeyMatchPattern() {
		return _keyMatchPattern;
	}

	public void setKeyMatchPattern(String keyMatchPattern) {
		_keyMatchPattern = keyMatchPattern;
	}

	public List<String> getVariateKeyNames() {
		return _variateKeyNames;
	}

	public void setVariateKeyNames(List<String> variateKeyNames) {
		_variateKeyNames = variateKeyNames;
	}

	
}
