package com.ship_out.ship_out_be.controllers;

import com.ship_out.ship_out_be.dtos.VesselDto;
import com.ship_out.ship_out_be.requests.AddVesselRequest;
import com.ship_out.ship_out_be.requests.UpdateVesselRequest;
import com.ship_out.ship_out_be.services.VesselService;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.List;

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
    public ResponseEntity<VesselDto> getVesselById(@PathVariable Long id) {
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
    public ResponseEntity<VesselDto> updateVessel(@PathVariable Long id, @Valid @RequestBody UpdateVesselRequest updateVesselRequest) {
        VesselDto vesselDTO = vesselService.updateVessel(id, updateVesselRequest);
        return ResponseEntity.ok()
                .body(vesselDTO);
    }

    @DeleteMapping("/vessel/{id}")
    public ResponseEntity<Void> deleteVessel(@PathVariable Long id) {
        vesselService.deleteVessel(id);
        return ResponseEntity.ok()
                .body(null);
    }
}