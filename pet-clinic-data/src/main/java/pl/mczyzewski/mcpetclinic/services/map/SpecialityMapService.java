package pl.mczyzewski.mcpetclinic.services.map;

import org.springframework.stereotype.Service;
import pl.mczyzewski.mcpetclinic.model.Specialty;
import pl.mczyzewski.mcpetclinic.services.SpecialtiesService;

import java.util.Set;
@Service
public class SpecialityMapService extends AbstractMapService<Specialty, Long> implements SpecialtiesService {

    @Override
    public Set<Specialty> findAll() {
        return super.findAll();
    }

    @Override
    public Specialty findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Specialty save(Specialty object) {
        return super.save(object);
    }

    @Override
    public void delete(Specialty object) {
        super.delete(object);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }
}
