package com.ship_out.ship_out_be.services;


import com.ship_out.ship_out_be.dtos.AllocationRouteDto;
import com.ship_out.ship_out_be.entities.AllocationRoute;
import com.ship_out.ship_out_be.repositories.AllocationRouteRepository;
import com.ship_out.ship_out_be.mappers.AllocationRouteMapper;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AllocationRouteService {
    private final AllocationRouteRepository allocationRouteRepository;
    private final AllocationRouteMapper allocationRouteMapper;

    public AllocationRouteDto getAllocationRouteById(UUID id){
        AllocationRoute allocationRoute = allocationRouteRepository.findById(id).orElseThrow(() -> new RuntimeException("Allocation route not found"));
        return allocationRouteMapper.toDto(allocationRoute);
    }

    public List<AllocationRouteDto> getAllAllocationRoutes(){
        List<AllocationRoute> allocationRoutes = allocationRouteRepository.findAll();
        return allocationRoutes.stream().map(allocationRouteMapper::toDto).collect(Collectors.toList());
    }
    
    public void deleteAllocationRoute(UUID id){
        AllocationRoute allocationRoute = allocationRouteRepository.findById(id).orElseThrow(() -> new RuntimeException("Allocation route not found"));
        allocationRouteRepository.delete(allocationRoute);
    }
}
