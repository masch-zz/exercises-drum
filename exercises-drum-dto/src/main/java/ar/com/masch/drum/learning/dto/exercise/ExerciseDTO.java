package ar.com.masch.drum.learning.dto.exercise;

import org.apache.commons.lang3.builder.HashCodeBuilder;

public class ExerciseDTO extends ItemExerciseDTO {

	private LevelExerciseDTO levelExerciseDTO;
	private ChapterExerciseDTO chapterExerciseDTO;
	
	public LevelExerciseDTO getLevelExerciseDTO() {
		return levelExerciseDTO;
	}
	
	public void setLevelExerciseDTO(LevelExerciseDTO levelExerciseDTO) {
		this.levelExerciseDTO = levelExerciseDTO;
	}
	
	public ChapterExerciseDTO getChapterExerciseDTO() {
		return chapterExerciseDTO;
	}
	
	public void setChapterExerciseDTO(ChapterExerciseDTO chapterExerciseDTO) {
		this.chapterExerciseDTO = chapterExerciseDTO;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == null) {
			return false;
		}
	    if (this == obj) {
	    	return true;
	    }
	    if (!(obj instanceof ExerciseDTO)) {
	    	return false;
	    }
		
		ExerciseDTO exerciseCompareDTO = (ExerciseDTO) obj;
		
		return ((super.equals(exerciseCompareDTO)) &&
			    (this.levelExerciseDTO.equals(exerciseCompareDTO.getLevelExerciseDTO())) &&
			    (this.chapterExerciseDTO.equals(exerciseCompareDTO.getChapterExerciseDTO())));
	}
	
	@Override
	public int hashCode() {
		return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
											// if deriving: appendSuper(super.hashCode()).
					append(levelExerciseDTO).
					append(chapterExerciseDTO).
					toHashCode();
	}		
	
}
