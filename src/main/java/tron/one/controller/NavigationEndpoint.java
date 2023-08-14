package tron.one.controller;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tron.one.dto.NavigationDTO;

import java.util.Collections;

@RestController("/")
public class NavigationEndpoint {
    @GetMapping("/data")
    public String getPerson() {

        return "test person222+++++";
    }
    @GetMapping("/navi")
    public String getNavigation() {
        NavigationDTO navi = new NavigationDTO().builder()
                .title("title")
                .uri("www.google.com")
                .teaser("teaser")
                .active(true)
                .children(Collections.emptyList()).build();
        Gson gson = new Gson();
        return gson.toJson(navi);
    }
}
