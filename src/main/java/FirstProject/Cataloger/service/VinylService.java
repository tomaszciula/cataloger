package FirstProject.Cataloger.service;

import FirstProject.Cataloger.dto.VinylDTO;
import FirstProject.Cataloger.dto.mapper.VinylMapper;
import FirstProject.Cataloger.model.Vinyl;
import FirstProject.Cataloger.repo.VinylRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VinylService {

    private final VinylRepo vinylRepo;

    @Autowired
    public VinylService(VinylRepo vinylRepo) {
        this.vinylRepo = vinylRepo;
    }

    public VinylDTO addVinyl(VinylDTO vinylDTO){
        vinylRepo.save(VinylMapper.mapToVinyl(vinylDTO));
        return vinylDTO;
    }

    public VinylDTO editVinyl(VinylDTO vinylDTO, Long vinylId){
        Vinyl vinyl = vinylRepo.findById(vinylId).orElseThrow();
        vinyl.setYearOfPublication(vinylDTO.getYearOfPublication());
        vinyl.setTitle(vinylDTO.getTitle());
        vinyl.setSizeVinyl(vinylDTO.getSizeVinyl());
        vinyl.setMusicGenre(vinylDTO.getMusicGenre());
        vinyl.setBandName(vinylDTO.getBandName());
        vinylRepo.save(vinyl);
        return VinylMapper.mapToDTO(vinyl);
    }

    public void  deleteVinyl(Long vinylId){
        vinylRepo.deleteById(vinylId);
    }

}
