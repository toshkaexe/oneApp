package tron.one.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class NavigationDTO {
    private String title;
    private String uri;
    private String teaser;
    private boolean active;
    private List<NavigationDTO> children;
}
