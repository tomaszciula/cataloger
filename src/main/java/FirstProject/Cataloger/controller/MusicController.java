package FirstProject.Cataloger.controller;

import FirstProject.Cataloger.model.Music;
import FirstProject.Cataloger.repository.MusicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api")
public class MusicController {
    @Autowired
    MusicRepository musicRepository;

    @GetMapping("/music")
    List<Music> all() {
        return musicRepository.findAll();
    }

    @PostMapping("/music")
    Music newMusic(@RequestBody Music newMusic) {
        return musicRepository.save(newMusic);
    }

    @PutMapping("/music/{id}")
    Music updateMusic(@RequestBody Music newMusic, @PathVariable Long id) {
        return musicRepository.findById(id).map(item -> {
                    item.setTitle(newMusic.getTitle());
                    item.getYearOfPublication();
                    item.getMusicGenre();
                    item.getMedia();
                    return musicRepository.save(item);
                })
                .orElseGet(() -> {
                    newMusic.setId(id);
                    return musicRepository.save(newMusic);
                });
    }

    @DeleteMapping("/music/{id}")
    void deleteMusic(@PathVariable Long id) {
        musicRepository.deleteById(id);
    }
}
