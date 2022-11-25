package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.model.Vinyl;
import FirstProject.Cataloger.repository.VinylRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("api")
public class VinylController {

    @Autowired
    VinylRepository vinylRepository;

    @GetMapping("/vinyls")
    List<Vinyl> all() {
        return vinylRepository.findAll();
    }

    @PostMapping("/vinyls")
    Vinyl newVinyl(@RequestBody Vinyl vinyl) {
        return vinylRepository.save(vinyl);
    }

    @PutMapping("/vinyls/{id}")
    Vinyl updateVinyl(@RequestBody Vinyl newVinyl, @PathVariable Long id) {
        return vinylRepository.findById(id).map(item -> {
                    item.setTitle(newVinyl.getTitle());
                    item.getYearOfPublication();
                    item.getSizeVinyl();
                    item.getBandName();
                    item.getMusicGenre();
                    return vinylRepository.save(item);
                })
                .orElseGet(() -> {
                    newVinyl.setId(id);
                    return vinylRepository.save(newVinyl);
                });
    }

    @DeleteMapping("/vinyls/{id}")
    void deleteVinyl(@PathVariable Long id) {
        vinylRepository.deleteById(id);
    }
}
