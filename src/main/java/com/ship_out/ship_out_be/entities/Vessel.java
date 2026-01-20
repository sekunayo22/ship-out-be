package com.ship_out.ship_out_be.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Table(name="vessel")
@NoArgsConstructor
@Entity
public class Vessel implements Serializable {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    UUID id;

    @Lob
    String name;

    @NotNull
    String loop;

    @NotNull
    String port;

    @NotNull
    Integer weekNum;

    @NotNull
    Integer allocation;

    @NotNull
    LocalDateTime etd;

    @NotNull
    Integer etdWeek;

    @NotNull
    LocalDateTime eta;

    LocalDateTime ata;

    LocalDateTime atd;
}
