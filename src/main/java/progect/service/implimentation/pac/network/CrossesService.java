package progect.service.implimentation.pac.network;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import progect.domain.network.CrossesDomain;
import progect.repository.network.CrossesRepository;
import progect.service.interfase.pac.network.ICrossesService;

import java.util.List;

@Service
public class CrossesService implements ICrossesService {
    @Autowired
    private CrossesRepository crossesRepository;

    @Override
    public List<CrossesDomain> findAllPool() {
        try {
            return crossesRepository.findAll();
        }catch (RuntimeException e){
            System.out.println(e.hashCode());
            return null;
        }

    }

    @Override
    public CrossesDomain readPool(CrossesDomain crosses) {
       return null;
    }

    @Override
    public boolean deletePool(CrossesDomain crosses) {
        try {
            crossesRepository.delete(crosses);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<CrossesDomain> updatePool(CrossesDomain crosses, CrossesDomain new_crosses) {
        try {
            BeanUtils.copyProperties(new_crosses, crosses,"id_crosses_first" );
            return crossesRepository.findAll();
        }catch (RuntimeException e){
            System.out.println(e.hashCode());
            return null;
        }

    }

    @Override
    public List<CrossesDomain> createPool(CrossesDomain crosses) {

        try {
            crossesRepository.save(crosses);
            return crossesRepository.findAll();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
