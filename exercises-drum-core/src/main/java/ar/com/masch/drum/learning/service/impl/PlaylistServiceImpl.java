package ar.com.masch.drum.learning.service.impl;

import java.util.Map;

import ar.com.masch.drum.learning.dto.PlaylistDTO;
import ar.com.masch.drum.learning.service.PlaylistService;

public class PlaylistServiceImpl implements PlaylistService {

	private Map<String, PlaylistDTO> playlistDTOMapTest;

	public void setPlaylistDTOMapTest(Map<String, PlaylistDTO> playlistDTOMapTest) {
		this.playlistDTOMapTest = playlistDTOMapTest;
	}
	
	public PlaylistDTO getPlayList(String name) {
		PlaylistDTO result = this.playlistDTOMapTest.get(name);

		return result;
	}

}
