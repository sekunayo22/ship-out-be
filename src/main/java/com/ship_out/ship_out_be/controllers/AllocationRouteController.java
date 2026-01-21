package com.ship_out.ship_out_be.controllers;

import com.ship_out.ship_out_be.dtos.AllocationRouteDto;
import com.ship_out.ship_out_be.services.AllocationRouteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AllocationRouteController {
    private final AllocationRouteService allocationRouteService;

    @GetMapping("/allocation-routes")
    public ResponseEntity<List<AllocationRouteDto>> getAllAllocationRoutes() {
        List<AllocationRouteDto> allocationRouteDTOs = allocationRouteService.getAllAllocationRoutes();
        return ResponseEntity.ok()
                .body(allocationRouteDTOs);
    }
}