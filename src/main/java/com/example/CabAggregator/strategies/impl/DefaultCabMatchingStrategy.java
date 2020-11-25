package com.example.CabAggregator.strategies.impl;

import com.example.CabAggregator.models.Cab;
import com.example.CabAggregator.models.Location;
import com.example.CabAggregator.models.Rider;
import com.example.CabAggregator.strategies.CabMatchingStrategy;
import lombok.NonNull;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DefaultCabMatchingStrategy implements CabMatchingStrategy {
    @Override
    public Cab matchCabToRider(
            @NonNull final Rider rider,
            @NonNull final List<Cab> candidateCabs,
            @NonNull final Location fromPoint,
            @NonNull final Location toPoint) {
        if (candidateCabs.isEmpty()) {
            return null;
        }
        return candidateCabs.get(0);
    }
}
