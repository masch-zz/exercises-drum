package ar.com.masch.drum.learning.factory;

import ar.com.masch.drum.learning.dto.exercise.ExerciseDTO;
import ar.com.masch.drum.learning.dto.exercise.LevelExerciseDTO;
import ar.com.masch.drum.learning.dto.exercise.ChapterExerciseDTO;

public class ExerciseDTOFactory {

	private LevelExerciseDTOFactory levelExerciseDTOFactory;
	private ChapterExerciseDTOFactory chapterExerciseDTOFactory;
	
	public void setLevelExerciseDTOFactory(LevelExerciseDTOFactory levelExerciseDTOFactory) {
		this.levelExerciseDTOFactory = levelExerciseDTOFactory;
	}	

	public void setChapterExerciseDTOFactory(ChapterExerciseDTOFactory chapterExerciseDTOFactory) {
		this.chapterExerciseDTOFactory = chapterExerciseDTOFactory;
	}
	
	public ExerciseDTO create(String exerciseName, String exerciseIndex,
							  ChapterExerciseDTO chapterExerciseDTO, 
							  LevelExerciseDTO levelExerciseDTO) {
		
		ExerciseDTO exerciseDTO = new ExerciseDTO();
		
		exerciseDTO.setName(exerciseName);
		exerciseDTO.setIndex(exerciseIndex);
		
		exerciseDTO.setLevelExerciseDTO(levelExerciseDTO);
		exerciseDTO.setChapterExerciseDTO(chapterExerciseDTO);
		
		return exerciseDTO;
	}
	
	
	public ExerciseDTO create(String exerciseName, String exerciseIndex,
			  				  String chapterName, String chapterIndex, 
			  				  String levelName, String levelIndex) {

		LevelExerciseDTO levelExerciseDTO = this.levelExerciseDTOFactory.create(levelName, levelIndex);
		ChapterExerciseDTO chapterExerciseDTO = this.chapterExerciseDTOFactory.create(chapterName, chapterIndex);
		
		ExerciseDTO exerciseDTO = this.create(exerciseName, exerciseIndex, chapterExerciseDTO, levelExerciseDTO);
		
		return exerciseDTO;
	}	
	
}
