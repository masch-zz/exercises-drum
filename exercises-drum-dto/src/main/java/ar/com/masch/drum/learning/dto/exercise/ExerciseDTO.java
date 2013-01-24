package ar.com.masch.drum.learning.dto.exercise;

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
	    if (this == obj) return true;
	    if (!(obj instanceof ExerciseDTO)) return false;
		
		ExerciseDTO exerciseCompareDTO = (ExerciseDTO) obj;
		
		return ((super.equals(exerciseCompareDTO)) &&
			    (this.levelExerciseDTO.equals(exerciseCompareDTO.getLevelExerciseDTO())) &&
			    (this.chapterExerciseDTO.equals(exerciseCompareDTO.getChapterExerciseDTO())));
	}
	
}
