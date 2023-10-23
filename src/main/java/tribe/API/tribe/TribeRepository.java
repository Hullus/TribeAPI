package tribe.API.tribe;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

public interface TribeRepository extends CrudRepository<Tribe, String> {
    void deleteById(String id);
}
