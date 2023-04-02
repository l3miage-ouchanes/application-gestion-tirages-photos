package fr.uga.l3miage.photonum.impression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.uga.l3miage.photonum.data.domain.Impression;
import fr.uga.l3miage.photonum.service.ImpressionService;

@RestController
@RequestMapping(value = "/api/v1", produces = "application/json")
public class ImpressionController {
    private final ImpressionMapper impressionMapper;
    private final ImpressionService impressionService;

    @Autowired
    public ImpressionController(ImpressionMapper impressionMapper, ImpressionService impressionService) {
        this.impressionMapper = impressionMapper;
        this.impressionService = impressionService;
    }

    @GetMapping("clients/{id}/impressions")
    public List<ImpressionDTO> getImpressions(@PathVariable("id") Long id) {
        Collection<Impression> allImpressions = impressionService.all();
        List<Impression> impressions = new ArrayList<>();
        
        for (Impression impression : allImpressions) {
            if (impression.getProprietaire().getId() == id) {
                impressions.add(impression);
            }
        }
        
        return impressions.stream()
            .map(impressionMapper::entityToDTO)
            .toList();
    }

    // creer une impression pour un client
    

    


}
