package com.edu;

import org.springframework.beans.factory.annotation.Autowired;

public class TextEditor {
	
	//@Autowired
	private SpellCheck spellCheck;

	
	//@Autowired
	public TextEditor(SpellCheck spellCheck) {
		super();
		this.spellCheck = spellCheck;
	}
	
	


	
	public SpellCheck getSpellCheck() {
		return spellCheck;
	}




	@Autowired
	public void setSpellCheck(SpellCheck spellCheck) {
		this.spellCheck = spellCheck;
	}





	public void opentexteditor() {
		if(spellCheck!=null) {
			spellCheck.checkSpelling();
			
		}
	}

}
