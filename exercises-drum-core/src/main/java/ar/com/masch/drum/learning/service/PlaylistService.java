package ar.com.masch.drum.learning.service;

import ar.com.masch.drum.learning.dto.PlaylistDTO;

public interface PlaylistService {
	
	PlaylistDTO getPlayList(String name);

}
