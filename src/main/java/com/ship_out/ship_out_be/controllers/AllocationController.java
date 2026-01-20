package com.ship_out.ship_out_be.controllers;

import com.ship_out.ship_out_be.dtos.AllocationDto;
import com.ship_out.ship_out_be.services.AllocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class AllocationController {
    private final AllocationService allocationService;

    @GetMapping("/allocations")
    public ResponseEntity<List<AllocationDto>> getAllAllocations() {
        List<AllocationDto> allocationDTOs = allocationService.getAllAllocations();
        return ResponseEntity.ok()
                .body(allocationDTOs);
    }
}