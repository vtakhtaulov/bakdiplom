package progect.service.interfase.pac.device;

import progect.domain.devices.TypeDeviceDomain;

import java.util.List;

public interface ITypeDeviceService {
    List<TypeDeviceDomain> findAll();
    TypeDeviceDomain read(TypeDeviceDomain obj);
    boolean delete(TypeDeviceDomain obj);
    List<TypeDeviceDomain> update(TypeDeviceDomain obj,TypeDeviceDomain new_obj);
    List<TypeDeviceDomain> create(TypeDeviceDomain obj);
}
