package com.unisalento.snapside.restcontrollers;

import com.unisalento.snapside.adapters.AdAdapter;
import com.unisalento.snapside.exceptions.AdNotFoundException;
import com.unisalento.snapside.generated.domain.AdEntity;
import com.unisalento.snapside.models.AdDTO;
import com.unisalento.snapside.iservices.IAdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController()    // This means that this class is a Controller
@RequestMapping(value="/ad") // This means URL's start with /ad (after Application path)
public class AdRestController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    IAdService adService;

    public AdRestController() {
        super();
    }
    public AdRestController(IAdService adService) {
        this.adService = adService;
    }

    @RequestMapping(value="/getAll", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
    public List<AdDTO> getAll() throws AdNotFoundException {
        List<AdDTO> dtos = new ArrayList<AdDTO>();
        List<AdEntity> entities = adService.getAll();
        Iterator<AdEntity> iteratorElement = entities.iterator();
        while(iteratorElement.hasNext()){
            AdEntity ad = iteratorElement.next();
            AdDTO adDTO = new AdDTO();
            adDTO=AdAdapter.AdEntityToAdDTO(ad);
            dtos.add(adDTO);
        }
        return dtos;
    }

    @GetMapping(value="/getById/{id}", produces=MediaType.APPLICATION_JSON_VALUE)
    public AdDTO getById(@PathVariable("id") int id) throws AdNotFoundException{
        AdDTO adDTO=new AdDTO();
        AdEntity ad = new AdEntity();
        ad = adService.getById(id);
        adDTO=AdAdapter.AdEntityToAdDTO(ad);
/*        try (FileOutputStream stream = new FileOutputStream("G:\\Magis\\secondoanno2\\SE_SnapDepot\\ad_"+adDTO.getIdAd()+"_chocoloco.jpg")) {
            stream.write(adDTO.getFiles());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
        return adDTO;
    }

    @PostMapping(value="/save", consumes= MediaType.APPLICATION_JSON_VALUE)
    public void post(@RequestBody AdDTO adDTO) throws AdNotFoundException {
        AdEntity ad =new AdEntity();
        ad = AdAdapter.AdDTOToAdEntity(adDTO);
        adService.save(ad);
    }
}