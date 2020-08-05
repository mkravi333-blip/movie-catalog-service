package com.movies.moviecatalogservice.controller;

import com.movies.moviecatalogservice.model.CatalogItem;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value = "/catalog", produces = {MediaType.APPLICATION_JSON_VALUE})
public class MovieCatalogController {

    @GetMapping(path = "/getCatalog/{userId}")
    public List<CatalogItem> getCatalog(@PathVariable("userId") int userId){

        return Collections.singletonList(new CatalogItem("Titanic", "Ship Movie", 4.5)
        );

    }
}
