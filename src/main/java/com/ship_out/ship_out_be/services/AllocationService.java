package com.ship_out.ship_out_be.services;

import com.ship_out.ship_out_be.dtos.AllocationDto;
import com.ship_out.ship_out_be.entities.Allocation;
import com.ship_out.ship_out_be.repositories.AllocationRepository;
import com.ship_out.ship_out_be.mappers.AllocationMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AllocationService {
    @Autowired
    private AllocationRepository allocationRepository;

    private final AllocationMapper allocationMapper;
    public AllocationDto getAllocationById(UUID id){
        Allocation allocation = allocationRepository.findById(id).orElseThrow(() -> new RuntimeException("Allocation not found"));
        return allocationMapper.toDto(allocation);
    }

    public List<AllocationDto> getAllAllocations(){
        List<Allocation> allocations = allocationRepository.findAll();
        return allocations.stream().map(allocationMapper::toDto).collect(Collectors.toList());
    }

    public void deleteAllocation(UUID id){
        Allocation allocation = allocationRepository.findById(id).orElseThrow(() -> new RuntimeException("Allocation not found"));
        allocationRepository.delete(allocation);
    }
}   
