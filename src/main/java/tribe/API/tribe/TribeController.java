package tribe.API.tribe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController()
@RequestMapping("tribes")
public class TribeController {
    @Autowired
    private TribeRepository tribeRepo;

    @GetMapping()
    public String getTribes() {
        return tribeRepo.findAll().toString();
    }
    @PostMapping()
    public void addTribe(@RequestBody Tribe tribe) {
        tribeRepo.save(tribe);
    }
    @DeleteMapping("/{id}")
    public void DeleteTribe(@PathVariable String id) {
        tribeRepo.deleteById(id);
    }
    @PutMapping()
    public void updateTribe() {
    }
}
