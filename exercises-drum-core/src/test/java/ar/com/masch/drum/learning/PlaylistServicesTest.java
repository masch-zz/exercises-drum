package ar.com.masch.drum.learning;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ar.com.masch.drum.learning.dto.PlaylistDTO;
import ar.com.masch.drum.learning.service.PlaylistService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/config/exercises-drum-application-context.xml")
public class PlaylistServicesTest {
	
	@Resource
	PlaylistService playlistService;
	
	private void assertPlayListDTO(String name, int size) {
		
		PlaylistDTO playlistDTO = this.playlistService.getPlayList(name);
		
		Assert.assertEquals(name, playlistDTO.getName());
		Assert.assertEquals(size, playlistDTO.getExerciseDTOList().size());		
	}
	
	@Test
	public void test1() {
		
		assertPlayListDTO("plWT1", 3);
		assertPlayListDTO("plWT2", 2);

	}
	
}
