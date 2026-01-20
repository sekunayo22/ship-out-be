package com.ship_out.ship_out_be.controllers;

import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.requests.AddVesselRequest;
import com.ship_out.ship_out_be.services.VesselService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.UUID;

@RequiredArgsConstructor
@RestController
public class VesselController {
    private final VesselService vesselService;

    @PostMapping("/vessel")
    public ResponseEntity<VesselDto> createNewVessel(@Valid @RequestBody AddVesselRequest addVesselRequest, HttpServletResponse response) throws  IOException {
        VesselDto vesselDTO = vesselService.createVessel(addVesselRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(vesselDTO);
    }

    @GetMapping("/vessel/{id}")
    public ResponseEntity<VesselDto> getVesselById(@PathVariable UUID id) {
        VesselDto vesselDTO = vesselService.getVesselById(id);
        return ResponseEntity.ok()
                .body(vesselDTO);
    }

    @GetMapping("/vessels")
    public ResponseEntity<List<VesselDto>> getAllVessels() {
        List<VesselDto> vesselDTOs = vesselService.getAllVessels();
        return ResponseEntity.ok()
                .body(vesselDTOs);
    }

    @PutMapping("/vessel/{id}")
    public ResponseEntity<VesselDto> updateVessel(@PathVariable UUID id, @Valid @RequestBody UpdateVesselRequest updateVesselRequest) {
        VesselDto vesselDTO = vesselService.updateVessel(id, updateVesselRequest);
        return ResponseEntity.ok()
                .body(vesselDTO);
    }

    @DeleteMapping("/vessel/{id}")
    public ResponseEntity<Void> deleteVessel(@PathVariable UUID id) {
        vesselService.deleteVessel(id);
        return ResponseEntity.ok()
                .body(null);
    }
}