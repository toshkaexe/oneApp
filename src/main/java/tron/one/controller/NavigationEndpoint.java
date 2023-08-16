package tron.one.controller;

import com.fasterxml.jackson.databind.SerializationFeature;
import com.google.gson.Gson;

import javax.ws.rs.core.Response;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tron.one.dto.NavigationDTO;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController("/")
public class NavigationEndpoint {
    @GetMapping("/data")
    public String getPerson() {

        return "test person222+++++";
    }

    @GetMapping("/navi")
    public ResponseEntity getNavigation() {
        try {
            List<NavigationDTO> childrens = new ArrayList<>();
            childrens.add(
                    new NavigationDTO().builder()
                            .title("children")
                            .uri("www.google.com")
                            .teaser("teaser")
                            .active(true)
                            .children(Collections.emptyList()).build()
            );

            childrens.add(
                    new NavigationDTO().builder()
                            .title("children")
                            .uri("www.google.com")
                            .teaser("teaser")
                            .active(true)
                            .children(Collections.emptyList()).build()
            );

            NavigationDTO navi = new NavigationDTO().builder()
                    .title("title_parent")
                    .uri("www.google.com")
                    .teaser("teaser")
                    .active(true)
                    .children(
                          //  Collections.emptyList()
                            childrens
                    ).build();


            Gson gson = new Gson();
            return ResponseEntity
                    .status(HttpStatus.ACCEPTED)
                    .body(gson.toJson(navi));
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body("Bad Request: Invalid endpoint");
        }


    }

    @RequestMapping("/**") // Catch-all mapping for undefined endpoints
    public ResponseEntity<String> handleBadRequests() {
        return ResponseEntity
                .status(HttpStatus.BAD_REQUEST)
                .body("Bad Request: Invalid endpoint");
    }
}
