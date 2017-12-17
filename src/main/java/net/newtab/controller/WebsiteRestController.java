package net.newtab.controller;

import net.newtab.dao.WebsiteDAO;
import net.newtab.model.Website;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Vardan on 12/17/2017.
 */


@RestController
public class WebsiteRestController {

    @Autowired
    private WebsiteDAO websiteDAO;

    @GetMapping("/websites")
    public List<Website> list() {
        return websiteDAO.list();
    }


    @GetMapping("/websites/{id}")
    public ResponseEntity getWebsite(@PathVariable("id") Long id) {

        Website website = websiteDAO.get(id);

        if (website == null) {
            return new ResponseEntity("No website found for id: " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(website, HttpStatus.OK);

    }

    @PostMapping("/websites")
    public ResponseEntity createWebsite(@RequestBody Website website) {

        websiteDAO.create(website);

        return new ResponseEntity(website, HttpStatus.OK);

    }


    @DeleteMapping("/website/{id}")
    public ResponseEntity deleteWebsite(@PathVariable("id") Long id) {

        Long deletedId = websiteDAO.delete(id);

        if (deletedId == null) {
            return new ResponseEntity("No website found for id: " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(id, HttpStatus.OK);

    }


    @PutMapping("/websites/{id}")
    public ResponseEntity updateWebsite(@PathVariable("id") Long id, @RequestBody Website website) {

        Website updatedWebsite = websiteDAO.update(id, website);

        if (updatedWebsite == null) {
            return new ResponseEntity("No website foun for id: " + id, HttpStatus.NOT_FOUND);
        }

        return new ResponseEntity(updatedWebsite, HttpStatus.OK);

    }

}
