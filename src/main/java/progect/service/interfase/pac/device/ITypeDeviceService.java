package progect.service.interfase.pac.device;

import progect.domain.devices.TypeDeviceDomain;

import java.util.List;

public interface ITypeDeviceService {
    List<TypeDeviceDomain> findAll();
    TypeDeviceDomain read(TypeDeviceDomain obj);
    List<TypeDeviceDomain> delete(Integer obj);
    List<TypeDeviceDomain> update(TypeDeviceDomain obj,Integer id);
    List<TypeDeviceDomain> create(TypeDeviceDomain obj);
}
