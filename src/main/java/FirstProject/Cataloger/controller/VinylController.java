package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.dto.VinylDTO;
import FirstProject.Cataloger.service.VinylService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VinylController {

    private final VinylService vinylService;

    @Autowired
    public VinylController(VinylService vinylService) {
        this.vinylService = vinylService;
    }

    @PostMapping("cataloger/vinyl/add")
    public VinylDTO addVinyl(VinylDTO vinylDTO) {
        return vinylService.addVinyl(vinylDTO);
    }

    @PutMapping("cataloger/vinyl/{idVinyl}")
    public VinylDTO editVinyl(VinylDTO vinylDTO, Long vinylId) {
        return vinylService.editVinyl(vinylDTO, vinylId);
    }

    @DeleteMapping("cataloger/vinyl/{idVinyl}")
    public void deleteVinyl(Long idVinyl) {
        vinylService.deleteVinyl(idVinyl);
    }

}
