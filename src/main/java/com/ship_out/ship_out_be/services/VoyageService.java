package com.ship_out.ship_out_be.services;


import com.ship_out.ship_out_be.dtos.VoyageDto;
import com.ship_out.ship_out_be.repositories.VoyageRepository;
import com.ship_out.ship_out_be.mappers.VoyageMapper;
import com.ship_out.ship_out_be.entities.Voyage;
import java.util.List;
import java.util.stream.Collectors;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VoyageService {
    private final VoyageRepository voyageRepository;
    private final VoyageMapper voyageMapper;

    public VoyageDto getVoyageById(Long id){
        Voyage voyage = voyageRepository.findById(id).orElseThrow(() -> new RuntimeException("Voyage not found"));
        return voyageMapper.toDto(voyage);
    }

    public List<VoyageDto> getAllVoyages(){
        List<Voyage> voyages = voyageRepository.findAll();
        return voyages.stream().map(voyageMapper::toDto).collect(Collectors.toList());
    }   

    public void deleteVoyage(Long id){
        Voyage voyage = voyageRepository.findById(id).orElseThrow(() -> new RuntimeException("Voyage not found"));
        voyageRepository.delete(voyage);
    }
}
