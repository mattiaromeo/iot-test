package be.domain;

import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Component
public class TempDataMapper {

    public TempData convert(TempDataDTO tempDataDTO){
        return new TempData(Timestamp.valueOf(LocalDateTime.now()),tempDataDTO.getTemp());
    }



}
