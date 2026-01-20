package com.ship_out.ship_out_be.controllers;

import com.ship_out.ship_out_be.dtos.VoyageDto;
import com.ship_out.ship_out_be.services.VoyageService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class VoyageController {
    private final VoyageService voyageService;

    @GetMapping("/voyages")
    public ResponseEntity<List<VoyageDto>> getAllVoyages() {
        List<VoyageDto> voyageDTOs = voyageService.getAllVoyages();
        return ResponseEntity.ok()
                .body(voyageDTOs);
    }
}
