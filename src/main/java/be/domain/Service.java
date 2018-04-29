package be.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Service {
    @Autowired
    private Repository repository;
    @Autowired
    private TempDataMapper tempDataMapper;

    public void storeTempData(TempDataDTO tempDataDTO) {
        TempData tempData = tempDataMapper.convert(tempDataDTO);
        repository.storeTempData(tempData);
    }

    public List<TempData> getAllTempData() {
        return repository.getAllTempData();
    }

}
