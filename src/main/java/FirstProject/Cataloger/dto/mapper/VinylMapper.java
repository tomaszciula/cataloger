package FirstProject.Cataloger.dto.mapper;

import FirstProject.Cataloger.dto.VinylDTO;
import FirstProject.Cataloger.model.Vinyl;

public class VinylMapper {

    public static Vinyl mapToVinyl(VinylDTO vinylDTO) {
        Vinyl vinyl = new Vinyl();
        vinyl.setSizeVinyl(vinylDTO.getSizeVinyl());
        vinyl.setTitle(vinylDTO.getTitle());
        vinyl.setBandName(vinylDTO.getBandName());
        vinyl.setMusicGenre(vinylDTO.getMusicGenre());
        vinyl.setYearOfPublication(vinylDTO.getYearOfPublication());
        return vinyl;
    }
    public static VinylDTO mapToDTO(Vinyl vinyl) {
        VinylDTO vinylDTO = new VinylDTO();
        vinylDTO.setSizeVinyl(vinyl.getSizeVinyl());
        vinylDTO.setBandName(vinyl.getBandName());
        vinylDTO.setMusicGenre(vinyl.getMusicGenre());
        vinylDTO.setTitle(vinyl.getTitle());
        vinylDTO.setYearOfPublication(vinyl.getYearOfPublication());
        return vinylDTO;
    }

}
