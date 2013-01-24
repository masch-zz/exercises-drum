package ar.com.masch.drum.learning;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.com.masch.drum.learning.dto.PlaylistDTO;
import ar.com.masch.drum.learning.dto.exercise.ExerciseDTO;
import ar.com.masch.drum.learning.service.PlaylistService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/exercises-drum-application-context.xml")
public class PlaylistServicesTest {
	
	@Resource
	private PlaylistService playlistService;
	
	@Resource
	private PlaylistDTO plWT1;
	
	@Resource
	private PlaylistDTO plWT2;	
	
	private void assertPlayListDTO(PlaylistDTO playlistExpectedDTO, String name) {
		
		PlaylistDTO playlistDTO = this.playlistService.getPlayList(name);
		
		Assert.assertEquals(name, playlistDTO.getName());
		assertExerciseDTOList(playlistExpectedDTO.getExerciseDTOList(), playlistDTO.getExerciseDTOList());
	}
	
	private void assertExerciseDTOList(List<ExerciseDTO> expecteds, List<ExerciseDTO> actuals) {
		
		Assert.assertEquals(expecteds.size(), actuals.size());		
		Assert.assertArrayEquals(expecteds.toArray(), actuals.toArray());
	}
	
	@Test
	public void test1() {
		
		assertPlayListDTO(plWT1, "plWT1");
		assertPlayListDTO(plWT2, "plWT2");

	}
	
}
