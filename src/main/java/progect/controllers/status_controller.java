package progect.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import progect.DTO.devices.DevicesDTO;
import progect.domain.RefStatusDomain;
import progect.repository.RefStatusRepository;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/Status/")
public class status_controller {
    @Autowired
    private RefStatusRepository refStatusRepository;

    @RequestMapping(value = "/StatusAll", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<RefStatusDomain> findAll() {
        return refStatusRepository.findAll();
    }
}
