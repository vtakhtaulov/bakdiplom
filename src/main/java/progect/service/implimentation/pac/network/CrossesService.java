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
    public List<CrossesDomain> findAll() {
        try {
            return crossesRepository.findAll();
        }catch (RuntimeException e){
            System.out.println(e.hashCode());
            return null;
        }

    }

    @Override
    public CrossesDomain read(CrossesDomain crosses) {
       return null;
    }

    @Override
    public boolean delete(CrossesDomain crosses) {
        try {
            crossesRepository.delete(crosses);
            return true;
        }catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    @Override
    public List<CrossesDomain> update(Integer id_crosses, CrossesDomain new_obj) {
        try {
            crossesRepository.findById(id_crosses).map(crossesDomain -> {
                crossesDomain.setId_crosses_end(new_obj.getId_crosses_end());
                crossesDomain.setPort(new_obj.getPort());
                crossesDomain.setSlot(new_obj.getSlot());
                crossesDomain.setShkaf(new_obj.getShkaf());
                return crossesRepository.save(crossesDomain);
            });
            return crossesRepository.findAll();
        }catch (RuntimeException e){
            System.out.println(e.hashCode());
            return null;
        }

    }

    @Override
    public List<CrossesDomain> create(CrossesDomain obj) {

        try {
            crossesRepository.save(obj);
            return crossesRepository.findAll();
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
