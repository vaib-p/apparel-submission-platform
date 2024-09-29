package com.apparel.apparel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apparel.apparel.model.Apparel;
import com.apparel.apparel.repository.ApparelRepository;

@Service
public class ApparelService {

    @Autowired
    private ApparelRepository apparelRepository;

    public List<Apparel> getAllApparels() {
        return apparelRepository.findAll();
    }

    public Apparel getApparelById(String id) {
        return apparelRepository.findById(id).orElse(null);
    }

    public Apparel saveApparel(Apparel apparel) {
        return apparelRepository.save(apparel);
    }

    public void deleteApparel(String id) {
        apparelRepository.deleteById(id);
    }

    public Apparel updateApparel(String id, Apparel updatedApparel) {
        Apparel existingApparel = apparelRepository.findById(id).orElse(null);
        if (existingApparel != null) {
            existingApparel.setType(updatedApparel.getType());
            existingApparel.setCondition(updatedApparel.getCondition());
            existingApparel.setCategory(updatedApparel.getCategory());
            existingApparel.setDescription(updatedApparel.getDescription());
            return apparelRepository.save(existingApparel);
        }
        return null;
    }
}
