package ar.com.masch.drum.learning.dto.exercise;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ItemExerciseDTO {
	
	private String name;	
	private String index;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getIndex() {
		return index;
	}
	
	public void setIndex(String index) {
		this.index = index;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == null) {
			return false;
		}		
	    if (this == obj) {
	    	return true;
	    }
	    if (!(obj instanceof ItemExerciseDTO)) {
	    	return false;
	    }
		
	    ItemExerciseDTO itemExerciseCompareDTO = (ItemExerciseDTO) obj;
	    
		return ((this.getName().equals(itemExerciseCompareDTO.getName())) &&
				(this.getIndex().equals(itemExerciseCompareDTO.getIndex())));
	}	
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
											// if deriving: appendSuper(super.hashCode()).
					append(name).
					append(index).
					toHashCode();
	}	
}
