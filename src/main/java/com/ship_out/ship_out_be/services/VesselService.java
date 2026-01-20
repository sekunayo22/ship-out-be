package com.ship_out.ship_out_be.services;


import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.requests.AddVesselRequest;
import com.ship_out.ship_out_be.requests.UpdateVesselRequest;
import com.ship_out.ship_out_be.repositories.VesselRepository;
import com.ship_out.ship_out_be.mappers.VesselMapper;
import com.ship_out.ship_out_be.entities.Vessel;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class VesselService {
    private final VesselRepository vesselRepository;
    private final VesselMapper vesselMapper;

    public VesselDto createVessel(AddVesselRequest addVesselRequest){
        Vessel vessel = vesselMapper.toEntity(addVesselRequest);
        vessel = vesselRepository.save(vessel);
        return vesselMapper.toDto(vessel);
    }   

    public VesselDto getVesselById(UUID id){
        Vessel vessel = vesselRepository.findById(id).orElseThrow(() -> new RuntimeException("Vessel not found"));
        return vesselMapper.toDto(vessel);
    }

    public List <VesselDto> getAllVessels(){
        List<Vessel> vessels = vesselRepository.findAll();
        return vessels.stream().map(vesselMapper::toDto).collect(Collectors.toList());
    }

    public VesselDto updateVessel(UUID id, UpdateVesselRequest updateVesselRequest){
        Vessel vessel = vesselRepository.findById(id).orElseThrow(() -> new RuntimeException("Vessel not found"));
        vesselMapper.updateEntity(vessel, updateVesselRequest);
        vesselRepository.save(vessel);
        return vesselMapper.toDto(vessel);
    }

    public void deleteVessel(UUID id){
        Vessel vessel = vesselRepository.findById(id).orElseThrow(() -> new RuntimeException("Vessel not found"));
        vesselRepository.delete(vessel);
    }
}