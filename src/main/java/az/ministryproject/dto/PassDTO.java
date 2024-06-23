package az.ministryproject.dto;

import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
@Data
@RequiredArgsConstructor
@Getter
@Setter
public class PassDTO {

    private Long id;

    private LocalDateTime entryTime;

    private LocalDateTime exitTime;

    private String hostName;
    public PassDTO(Long id, LocalDateTime entryTime, LocalDateTime exitTime, String hostName) {
        this.id = id;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.hostName = hostName;
    }
}
